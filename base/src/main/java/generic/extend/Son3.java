package generic.extend;

import generic.PairT;

/**
 * 继承时不指定父类的泛型参数,会有警告信息
 */
public class Son3 extends PairT {


    public Son3(Object first, Object last) {
        super(first, last);
    }
}
