package generic;



import generic.extend.Son6;
import lombok.val;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 泛型
 */
public class GenericTest {

    /**
     * 没有使用泛型
     */
    @Test
    public void T1(){

        List<String> list1 = new ArrayList<>();
        list1.add("111");
        list1.add("222");
        // 编译报错
        // strings.add(333);

        List list2 = new ArrayList<>();
        list2.add("444");
        list2.add("555");
        list2.add(666);

    }

    /**
     * 使用泛型
     */
    @Test
    public void T2() throws Exception {

        BaseBean<String> objectBaseBean = new BaseBean<>();
        objectBaseBean.setValue("中国");

        Field value = objectBaseBean.getClass().getDeclaredField("value");
        System.out.println("获取属性上的泛型类型:"+value.getType().getName());

        Method getValue = objectBaseBean.getClass().getDeclaredMethod("getValue");
        System.out.println("获取方法上的泛型类型:" + getValue.invoke(objectBaseBean).getClass().getName());

    }

    @Test
    public void T3(){

        PairT<String> stringPairT = new PairT<>("hello", "world");
        String first = stringPairT.getFirst();
        System.out.println(first);

    }

    /**
     * 多个泛型类型
     */
    @Test
    public void T4(){

        PairTK<String,Integer> stringPairT = new PairTK<>("hello", 123);
        String first = stringPairT.getFirst();
        System.out.println(first);

    }

    /**
     * 泛型擦除和局限性
     */
    @Test
    public void T5(){

        PairT<String> stringPairTK = new PairT<>("hello", "world");
        PairT<Integer> integerPairTK = new PairT<>(1, 2);

        Class<? extends PairT> aClass = stringPairTK.getClass();
        Class<? extends PairT> aClass1 = integerPairTK.getClass();

        System.out.println(aClass == aClass1);
        System.out.println(aClass.equals(aClass1));
        System.out.println(aClass == PairT.class);
        System.out.println(aClass1 == PairT.class);


    }

    /**
     * 泛型继承
     */
    @Test
    public void T6(){

        PairT<String> stringPairTK = new PairT<>("hello", "world");
        PairT<Integer> integerPairTK = new PairT<>(1, 2);

        Class<? extends PairT> aClass = stringPairTK.getClass();
        Class<? extends PairT> aClass1 = integerPairTK.getClass();

        System.out.println(aClass == aClass1);
        System.out.println(aClass.equals(aClass1));
        System.out.println(aClass == PairT.class);
        System.out.println(aClass1 == PairT.class);

    }

    /**
     * 泛型继承
     */
    @Test
    public void T7(){
        Son6<String> stringSon6 = new Son6<>("1", "2");
        Son6<Double> doubleSon6 = new Son6<>(3.14, 3.16);
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }

    }

}
