package generic.extend;

import generic.PairT;

/**
 * 继承时指定父类的泛型参数，子类就不用再写泛型参数，如果写了，那就是子类自己新增加的
 */
public class Son4 extends PairT<Integer> {


    public Son4(Integer first, Integer last) {
        super(first, last);
    }
}
