package generic;

/**
 * 多个泛型类型
 */
public class PairTK<T,K> {
    private T first;
    private K last;

    public PairTK(T first, K last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public K getLast() {
        return last;
    }

}
