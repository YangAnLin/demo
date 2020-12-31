package reids;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * anthony@base:/var/log/redis$ redis-cli --cluster check 192.168.0.6:6379
 * 192.168.0.6:6379 (99af86e5...) -> 0 keys | 5461 slots | 1 slaves.
 * 192.168.0.8:6379 (982f74c7...) -> 3 keys | 5461 slots | 1 slaves.
 * 192.168.0.7:6379 (1069a632...) -> 0 keys | 5462 slots | 1 slaves.
 * [OK] 3 keys in 3 masters.
 * 0.00 keys per slot on average.
 * >>> Performing Cluster Check (using node 192.168.0.6:6379)
 * M: 99af86e59c7f5a4ddf212b29e9e1b12fa5e7a866 192.168.0.6:6379
 * slots:[0-5460] (5461 slots) master
 * 1 additional replica(s)
 * S: 102517bddae6af2434519e8f348cf062b0152fa7 192.168.0.9:6379
 * slots: (0 slots) slave
 * replicates 982f74c79ed5c5811b7011507c56f81374c70a0b
 * S: 392c5e4dcd5608c74a76902668ed58fb6ab50aaf 192.168.0.11:6379
 * slots: (0 slots) slave
 * replicates 1069a6320a0489f63e807c970c27f86f13f417cf
 * S: 4d12dd0de1af9d90bfac7dd141c36c348071d59f 192.168.0.10:6379
 * slots: (0 slots) slave
 * replicates 99af86e59c7f5a4ddf212b29e9e1b12fa5e7a866
 * M: 982f74c79ed5c5811b7011507c56f81374c70a0b 192.168.0.8:6379
 * slots:[10923-16383] (5461 slots) master
 * 1 additional replica(s)
 * M: 1069a6320a0489f63e807c970c27f86f13f417cf 192.168.0.7:6379
 * slots:[5461-10922] (5462 slots) master
 * 1 additional replica(s)
 * [OK] All nodes agree about slots configuration.
 * >>> Check for open slots...
 * >>> Check slots coverage...
 * [OK] All 16384 slots covered.
 */
public class ClusterDemo {

    private JedisCluster jedis;

    @Before
    public void before() {
        Set<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("192.168.0.6", 6379));
        nodes.add(new HostAndPort("192.168.0.7", 6379));
        nodes.add(new HostAndPort("192.168.0.8", 6379));
        nodes.add(new HostAndPort("192.168.0.9", 6379));
        nodes.add(new HostAndPort("192.168.0.10", 6379));
        nodes.add(new HostAndPort("192.168.0.11", 6379));


        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        jedis = new JedisCluster(nodes, poolConfig);
    }

    @After
    public void after() throws IOException {
        //使用完关闭连接
        jedis.close();
    }

    /**
     * 设值
     */
    @Test
    public void set() {
        //访问Redis服务
        jedis.set("stop07", "v1");
        System.out.println(jedis.get("k1"));
    }

    /**
     * redis集群的节点信息
     * map.key = IP:PORT
     */
    @Test
    public void info() {
        Map<String, JedisPool> clusterNodes = jedis.getClusterNodes();
        clusterNodes.keySet().forEach(key -> {
            System.out.printf("%s==%s\r\n", key, clusterNodes.get(key).getResource().info());
        });
    }


}
