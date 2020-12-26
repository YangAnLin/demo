package reids;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class InfoDemo {

    private Jedis jedis;

    @Before
    public void before(){
        jedis = new Jedis("192.168.198.130", 6379);  //指定Redis服务Host和port
    }

    @After
    public void agter(){
        jedis.close(); //使用完关闭连接
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
