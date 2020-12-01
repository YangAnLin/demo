package com.example.demo.google;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class GoogleAuth {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(step1());
        System.out.println(createGoogleAuthQRCodeData("PC5B5ORTOIDOGNFD","liangzi","160"));
        check();
    }


    /**
     * generate google key ro secry
     * use for google client write
     *
     * @return
     */
    public static String  step1(){
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        GoogleAuthenticatorKey key = gAuth.createCredentials();
        return key.getKey();
    }

    /**
     * 检查
     */
    public static void check(){
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        // 根据用户密钥和用户输入的密码，验证是否一致。
        boolean isCodeValid = gAuth.authorize("PC5B5ORTOIDOGNFD", 508280);
        System.out.println(isCodeValid);

    }

    /**
     *
     * @param secret before step google key
     * @param account AgentAcc
     * @param issuer agentID
     */
    public static String createGoogleAuthQRCodeData(String secret, String account, String issuer) throws UnsupportedEncodingException {
        return String.format("otpauth://totp/%s?secret=%s&issuer=%s",
                URLEncoder.encode(issuer + ":" + account, "UTF-8").replace("+", "%20"),
                URLEncoder.encode(secret, "UTF-8").replace("+", "%20"),
                URLEncoder.encode(issuer, "UTF-8").replace("+", "%20"));
    }
}
