package com.example.web.redis;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
public class RedisConfig {

    @Resource
    private RedisProperties redisProperties;

    @Bean
    public RedisClient redisClient() {
        return new RedisCluster();
    }

    /**
     * @Description 创建集群配置bean
     */
    @Bean
    public JedisCluster jedisCluster() {
        // 切割配置的redis集群节点
        int timeOut = (int) redisProperties.getTimeout().toMillis();
        List<String> nodeList = redisProperties.getCluster().getNodes();
        Set<HostAndPort> nodes = new HashSet<>();
        for (String ipPort : nodeList) {
            String[] ipPortPair = ipPort.split(":");
            String host = ipPortPair[0].trim();
            int port = Integer.parseInt(ipPortPair[1].trim());
            nodes.add(new HostAndPort(host, port));
        }
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(redisProperties.getJedis().getPool().getMaxIdle());
        config.setMinIdle(redisProperties.getJedis().getPool().getMinIdle());
        //连接池的最大数据库连接数
        config.setMaxTotal(redisProperties.getJedis().getPool().getMaxActive());
        config.setMaxWaitMillis(redisProperties.getJedis().getPool().getMaxWait().toMillis());
        config.setTestWhileIdle(true);
        //连接的最小空闲时间 默认1800000毫秒(30分钟)
        config.setMinEvictableIdleTimeMillis(300000);
        //每次释放连接的最大数目,默认3
        config.setMinEvictableIdleTimeMillis(5);
        //逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
        config.setTimeBetweenEvictionRunsMillis(30000);
        config.setTestOnBorrow(true);
        return new JedisCluster(nodes, timeOut, timeOut, redisProperties.getCluster().getMaxRedirects(), redisProperties.getPassword(), config);
    }

}
