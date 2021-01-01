package com.example.web.web;

import cn.hutool.core.io.file.FileReader;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.web.entity.AccountsInfo;
import com.example.web.entity.Teacher;
import com.example.web.mapper.DemoMapper;
import com.example.web.mapper.TeacherMapper;
//import com.example.web.telegram.YourBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class TestController {

    @Value("${spring.application.name}")
    private String serverName;

    @Resource
    private DemoMapper demoMapper;

    @Resource
    private TeacherMapper teacherMapper;

    private final String key = "key123";
    private final String value = "value";

    @RequestMapping("/readFile")
    public String readFile() throws FileNotFoundException {
//        File file = ResourceUtils.getFile("classpath:result.log");
//        InputStream inputStream = new FileInputStream(file);

        FileReader fileReader = new FileReader("result.log");
        final List<String> strings = fileReader.readLines();
        System.out.println(strings);
        return "nice";
    }

    @RequestMapping("/test10")
    public String test10(){

        QueryWrapper<Teacher> teacherQueryWrapper = new QueryWrapper<>();
//        teacherQueryWrapper.

//        Teacher teacher = new Teacher();
//        teacher.setId(1);
//        teacher.setAge(14);
        return "nice";
    }

    @RequestMapping("/test9")
    public String test9(){

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setAge(14);

        teacherMapper.update(teacher,null);

        new AccountsInfo().updateById();

        return "nice";
    }

    @RequestMapping("/test8")
    public String test8(){
        Teacher teacher = new Teacher();
//        teacher.setId(1);
        teacher.setAge(13);

        teacherMapper.insert(teacher);

        return "nice";
    }

    @RequestMapping("/test7")
    public String test7(){

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setAge(13);

        teacherMapper.updateById(teacher);

        return "nice";
    }

    /**
     * mybatis只查询一个字段
     * @return
     */
    @RequestMapping("/test4")
    public String test4(){
        LambdaQueryWrapper<Teacher> teacherLambdaQueryWrapper = new LambdaQueryWrapper<>();
        teacherLambdaQueryWrapper.select(Teacher::getName);
        teacherLambdaQueryWrapper.eq(Teacher::getClass, 1);
        List<Teacher> teachers = teacherMapper.selectList(teacherLambdaQueryWrapper);
        System.out.println(teachers);

        return "nice";
    }

    @RequestMapping("/test1")
    public String test(){
        AccountsInfo accountsInfo = demoMapper.callback(0,1);
        System.out.println(accountsInfo);
        return "nice";
    }

    @RequestMapping("/test5")
    public String test5(@RequestParam("userId") Integer userId){
        System.out.println(userId);
        return userId.toString();
    }

//    @Resource
//    private YourBot yourBot;

//    @RequestMapping("/tele")
//    public String tele(@RequestParam("userId") Integer userId) throws TelegramApiException {
//        System.out.println(userId);
//
//        SendMessage sm = new SendMessage();
//        sm.setChatId(569079805l);
//        sm.setText("收到!");
//        yourBot.execute(sm);
//        return userId.toString();
//    }
//
//    @RequestMapping("/test6")
//    public String test6() throws TelegramApiException {
//        return serverName;
//    }


//    @Autowired
//    private PayService payService;
//
//    @RequestMapping("/test15")
//    public void test15() throws TelegramApiException {
//        payService.pay("str");
//    }
}
