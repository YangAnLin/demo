package generic.extend;

import generic.PairT;

/**
 * 最正常的继承，子类的泛型参数和父类的参数是一致的
 */
public class Son1<T> extends PairT<T> {

    public Son1(T first, T last) {
        super(first, last);
    }
}
