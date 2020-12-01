//package com.example.demo.sms;
//
//import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
//import com.aliyuncs.exceptions.ClientException;
//import com.example.demo.HTTP;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * 短信中转
// */
//public class Transfer {
//
//    public static void main(String[] args) throws YunpianException, ClientException {
//
//
//        Integer type = 0;
//
//        HashMap<String, String> objectObjectHashMap = new HashMap<>();
//
//        String result = "";
//        switch (type) {
//            case 0:
//                result= method0(objectObjectHashMap);
//                break;
//            case 1:
//                result= method1(objectObjectHashMap);
//                break;
//            case 2:
//                result= method2(objectObjectHashMap);
//                break;
//            case 3:
////                result= method3(objectObjectHashMap);
//                break;
//        }
//
//        System.out.println(result);
//    }
//
//    /**
//     * 106平台
//     * @param message
//     */
//    public static String method0(HashMap<String, String> message){
////        return HTTP.sendPost("baidu.com", message);
//        return "";
//    }
//
//    /**
//     * 完美 3D
//     * @param message
//     */
//    public static String method1(HashMap<String, String> message) throws YunpianException {
//        // message 转map
//        HashMap<String, String> objectObjectHashMap = new HashMap<>();
//        return HTTP.post("baidu.com", objectObjectHashMap);
//    }
//
//    /**
//     * 众鑫短信平台
//     * @param message
//     */
//    public static String method2(HashMap<String, String> message){
//        Map<String, String> map = new HashMap<>();
//        map.put("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
//        map.put("Accept", "application/json;charset=utf-8");
//        return HTTP.sendPost("baidu.com",message,map);
//    }
//
//    /**
//     * 阿里云
//     * @param message
//     * @return
//     */
//    public static SendSmsResponse method3(HashMap<String, String> message) throws ClientException {
//        return HTTP.aliyun(message);
//    }
//
//}
