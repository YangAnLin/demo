package google;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class GoogleAuth {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String key = generaKey();
        System.out.printf("生成的Key:%s\r\n", key);
        System.out.printf("生成的二维码:%s\r\n",createGoogleAuthQRCodeData(key,"Google github","example@domain.com"));
        Scanner input = new Scanner(System.in);
        System.out.println("输入验证码:");
        check(key, input.nextInt());
    }


    /**
     * 生成key
     */
    public static String generaKey(){
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        GoogleAuthenticatorKey key = gAuth.createCredentials();
        return key.getKey();
    }

    /**
     * 生成二维码
     * @param key 生成的key
     * @param issuer app上title名字                服务名称 如: Google Github 印象笔记
     * @param account app上title名字(括号里的)       用户账户 如: example@domain.com 138XXXXXXXX
     */
    public static String createGoogleAuthQRCodeData(String key, String account,String issuer) throws UnsupportedEncodingException {
        return String.format("otpauth://totp/%s?secret=%s&issuer=%s",
                URLEncoder.encode(issuer + ":" + account, "UTF-8").replace("+", "%20"),
                URLEncoder.encode(key, "UTF-8").replace("+", "%20"),
                URLEncoder.encode(issuer, "UTF-8").replace("+", "%20"));
    }

    /**
     * 检查
     * @param key 生成的key
     * @param code 用户输入的面膜
     */
    public static void check(String key,Integer code){
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        // 根据用户密钥和用户输入的密码，验证是否一致。
        boolean isCodeValid = gAuth.authorize(key, code);
        System.out.printf("检查秘钥是否正确:%s,输入的code:%s,结果:%s\r\n",key,code,isCodeValid);
    }
}
