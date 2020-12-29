package reids;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class SingtonDemo {

    private Jedis jedis;

    @Before
    public void before(){
        //指定Redis服务Host和port
        jedis = new Jedis("192.168.0.5", 6379);
    }

    @After
    public void after(){
        //使用完关闭连接
        jedis.close();
    }

    /**
     * 设值
     */
    @Test
    public void set() {
        //访问Redis服务
        jedis.set("k1", "v1");
        System.out.println(jedis.get("k1"));
    }

    /**
     * 设值,并且设置超时时间
     */
    @Test
    public void setTime() {
        String key = "setTimeKey";
        jedis.setex(key, 20000, "setTimeValue");
        System.out.println(jedis.get(key));
        System.out.println(jedis.ttl(key));
    }

    /**
     * 分布式锁原理,
     * key不存在的时候才插入
     */
    @Test
    public void setNX() {
        String key = "setNXKey";
        // 1.先插入一个值
        jedis.set(key, "setNXValue");

        // 2.NX是不存在时才set， XX是存在时才set， EX是秒，PX是毫秒
        String set = jedis.set(key, "setNXValue---NX", "NX", "EX", 20000L);
        System.out.println(set);
        System.out.println(jedis.get(key));
        System.out.println(jedis.ttl(key));

        System.out.println("======================================================");

        // 3.设置个没有的key
        String key2 = "setNXKey2";
        String set2 = jedis.set(key2, "setNXValue2---NX", "NX", "EX", 20000L);
        System.out.println(set2);
        System.out.println(jedis.get(key2));
        System.out.println(jedis.ttl(key2));
    }

    /**
     * key存在时才插入
     */
    @Test
    public void setXX() {
        String key = "setXXKey";
        // 1.先插入一个值
        jedis.set(key, "setXXValue");

        // 2.NN
        String set = jedis.set(key, "setXXValue---XX", "XX", "EX", 20000L);
        System.out.println(set);
        System.out.println(jedis.get(key));
        System.out.println(jedis.ttl(key));

        System.out.println("======================================================");

        // 3.设置个没有的key
        String key2 = "setXXKey2";
        String set2 = jedis.set(key2, "setXXValue2---NX", "XX", "EX", 20000L);
        System.out.println(set2);
        System.out.println(jedis.get(key2));
        System.out.println(jedis.ttl(key2));
    }

    @Test
    public void expire() {}

    public Boolean expireAt(String key, long millisecondsTimestamp) {
        return null;
    }

    public boolean exit(String key) {
        return false;
    }

    public String get(String key) {
        return null;
    }

    public <T> T get(String key, Class<T> clazz) {
        return null;
    }

    public <T> List<T> getList(String key, Class<T> clazz) {
        return null;
    }

    public Boolean delete(String key) {
        return null;
    }

    public Set<String> getKeys(String pattern) {
        return null;
    }

    public void delAll(String pattern) {}

    public boolean setDistributedLock(String lockKey, String requestId, long expireTime) {
        return false;
    }

    public boolean releaseDistributedLock(String lockKey, String requestId) {
        return false;
    }

}
