package generic;

public class PairT<T> {
    private T first;
    private T last;

    public PairT(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    // 编译报错
    // 对静态方法使用<T>:
//    public static PairT<T> create(T first, T last) {
//        return new PairT<T>(first, last);
//    }

    /**
     * 静态方法先加载,静态方法的T跟类上声明的T没有关系
     * @param first
     * @param last
     * @param <T>
     * @return
     */
    public static <T> PairT<T> create(T first, T last) {
        return new PairT<T>(first, last);
    }

}
