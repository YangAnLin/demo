package generic.extend;

import generic.PairT;

/**
 * 子类增加了一个泛型参数，父类的泛型参数不能遗漏，所以仍然要定义
 */
public class Son2<K,T> extends PairT<T> {

    private K k;

    public Son2(T first, T last,K value) {
        super(first, last);
        this.k = value;
    }
}
