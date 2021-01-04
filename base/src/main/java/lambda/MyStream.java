package lambda;


import lombok.Setter;

import java.util.Arrays;
import java.util.List;



public class MyStream<T> {


    @Setter
    private List<T> list;

    public void myForEach(ConsumerInterface<T> consumer){
        for(T t : list){
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
        MyStream<String> stringMyStream = new MyStream<>();
        stringMyStream.setList(Arrays.asList("1","2","3"));
        stringMyStream.myForEach(System.out::println);
    }
}
