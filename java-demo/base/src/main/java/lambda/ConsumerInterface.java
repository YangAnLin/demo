package lambda;

/**
 * 自定义函数接口
 * 函数接口，是指内部只有一个抽象方法的接口
 */

@FunctionalInterface
public interface ConsumerInterface<T> {

    void accept(T t);
}
