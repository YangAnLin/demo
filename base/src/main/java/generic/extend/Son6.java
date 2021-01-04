package generic.extend;

import generic.PairT;

/**
 * 这里的Integer 不是java.lang.Integer
 * 这里的Integer = T 的意思
 */
public class Son6<Integer> extends PairT<Integer> {

    Integer otherData;

    public Son6(Integer first, Integer last) {
        super(first, last);
    }
}
