package reids;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class ClusterDemo {

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

    @Test
    public void test1(){
        jedis.set("k1", "v1"); //访问Redis服务
        System.out.println(jedis.get("k1"));
    }

    @Test
    public void test2(){

        String info = jedis.info();
        System.out.println(info);

//        jedis.memo
    }
}
