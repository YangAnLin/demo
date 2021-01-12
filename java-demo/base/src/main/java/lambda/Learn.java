package lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Learn {

    /**
     * JDK7匿名内部类写法,不带参数
     */
    @Test
    public void test1(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("=====");
            }
        }).start();

    }

    /**
     * JDK8 Lambda写法,不带参数
     */
    @Test
    public void test2(){
        new Thread(() -> System.out.println("=====")).start();
    }

    /**
     * JDK7匿名内部类写法,带参数
     */
    @Test
    public void test3(){

        class Demo implements Comparator<String>{
            @Override
            public int compare(String s1, String s2) {
                if(s1 == null)
                    return -1;
                if(s2 == null)
                    return 1;
                return s1.length()-s2.length();
            }
        }

        List<String> list = Arrays.asList("I", "love", "you", "too");
        list.sort(new Demo());
        System.out.printf("jdk7排序1:%s\r\n",list);

        // 或者

        List<String> list2 = Arrays.asList("I", "love", "you", "too");
        list2.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1 == null)
                    return -1;
                if(s2 == null)
                    return 1;
                return s1.length()-s2.length();
            }
        });
        System.out.printf("jdk7排序2:%s\n",list2);

    }


    /**
     * JDK8 Lambda写法,带参数
     */
    @Test
    public void test4(){

        List<String> list2 = Arrays.asList("I", "love", "you", "too");
        list2.sort((s1, s2) -> {
            if(s1 == null)
                return -1;
            if(s2 == null)
                return 1;
            return s1.length()-s2.length();
        });
        System.out.printf("jdk8排序:%s\n",list2);

    }

    /**
     * JDK8 自定义
     */
    @Test
    public void test5(){



    }
}


