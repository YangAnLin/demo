package generic;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 */
public class GenericTest {

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

    @Test
    public void T2() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        BaseBean<String> objectBaseBean = new BaseBean<>();
        objectBaseBean.setValue("中国");

        Field value = objectBaseBean.getClass().getDeclaredField("value");
        System.out.println("获取属性上的泛型类型:"+value.getType().getName());

        Method getValue = objectBaseBean.getClass().getDeclaredMethod("getValue");
        System.out.println("获取方法上的泛型类型:" + getValue.invoke(objectBaseBean).getClass().getName());


    }

    @Test
    public void T3(){

    }

}
