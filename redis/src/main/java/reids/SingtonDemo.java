package reids;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SingtonDemo{

    private Jedis jedis;

    @Before
    public void before(){
        //指定Redis服务Host和port
        jedis = new Jedis("192.168.198.130", 6379);
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
        String key = "k2";
        // 设值
        jedis.set(key, "v2");
        // 设置过期时间
        // NX是不存在时才set， XX是存在时才set， EX是秒，PX是毫秒
        jedis.set(key, "k2", "NX", "EX", 1000l);
    }


    public Boolean expire(String key, long timeOut, TimeUnit unit) {
        return null;
    }


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


    public void delAll(String pattern) {

    }


    public Set<String> clusterScan(String pattern) {
        return null;
    }


    public boolean setDistributedLock(String lockKey, String requestId, long expireTime) {
        return false;
    }


    public boolean releaseDistributedLock(String lockKey, String requestId) {
        return false;
    }


    public Long hdel(String key, String... field) {
        return null;
    }


    public <T> boolean hset(String key, String field, T value) {
        return false;
    }


    public <T> T hget(String key, String field, Class<T> clazz) {
        return null;
    }


    public Map<String, String> hgetAll(String key) {
        return null;
    }


    public <T> Map<String, T> hgetAll(String key, Class<T> clazz) {
        return null;
    }
}
