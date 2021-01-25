package cipher;

/**
 * 算法 algorithm
 */
public interface CommonInterface {

    /**
     * 加密 encode encrypt
     */
    Object encode(Object object);

    /**
     * 解密  decrypt decode
     */
    Object decode(Object object);

}
