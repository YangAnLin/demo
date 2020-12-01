package com.example.demo.web;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.example.demo.HTTP;
import com.example.demo.sms.YunpianException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping
@RestController
public class SMSController {

    @PostMapping("/106")
    public String method1(@RequestParam("param") String param){
        return HTTP.sendPost("http://106.ihuyi.cn/webservice/sms.php?method=Submit", param);
    }

    @PostMapping("/3d")
    public String post3d(@RequestBody HashMap<String, String> map) throws YunpianException {
        return HTTP.post("https://sms.yunpian.com/v2/sms/single_send.json", map);
    }

    @PostMapping("/zx")
    public String postZX(@RequestBody Map<String, Object> request){
        return HTTP.sendPost((String)request.get("url"),(String)request.get("data"),(HashMap<String,String>)request.get("header"));
    }

    @PostMapping("/aliyun")
    public SendSmsResponse postAliyun(@RequestBody HashMap<String, String> map) throws ClientException {
        return HTTP.aliyun(map);
    }


}
