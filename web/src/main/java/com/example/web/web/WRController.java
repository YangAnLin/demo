package com.example.web.web;

import com.example.demo.entity.AccountMycatTest;
import com.example.demo.entity.AgentMycatTest;
import com.example.demo.mapper.AccountMycatTestMapper;
import com.example.demo.mapper.AgentMycatTestMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class WRController {

    @Resource
    private AccountMycatTestMapper accountMycatTestMapper;

    @Resource
    private AgentMycatTestMapper agentMycatTestMapper;

    @RequestMapping("/account/write")
    public void test1(){
        AccountMycatTest accountMycatTest = new AccountMycatTest();
        accountMycatTest.setTestNname("anthony_account");
        int insert = accountMycatTestMapper.insert(accountMycatTest);
        System.out.println(insert);
        int i = 1 / 0;
    }

    @RequestMapping("/account/read")
    public void test2(){
        System.out.println(accountMycatTestMapper.selectById(2));
    }

    @RequestMapping("/account/write/trans")
    @Transactional
    public void test12(){
        AccountMycatTest accountMycatTest = new AccountMycatTest();
        accountMycatTest.setTestNname("anthony_account");
        int insert = accountMycatTestMapper.insert(accountMycatTest);
        System.out.println(insert);
        int i = 1 / 0;
    }

    @RequestMapping("/agent/write")
    public void test3(){
        AgentMycatTest agentMycatTest = new AgentMycatTest();
        agentMycatTest.setTestNname("anthony_agent");
        int insert = agentMycatTestMapper.insert(agentMycatTest);
        System.out.println(insert);
    }

    @RequestMapping("/agent/read")
    public void test4(){
        System.out.println(accountMycatTestMapper.selectById(2));
    }

}
