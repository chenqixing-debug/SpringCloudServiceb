package com.cqx.serviceb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qixing.chen
 * @Date 2021/8/8 1:28 下午
 */
@RestController
public class TestController {

    @RequestMapping("testB")
    public String TestBController(){
        return "Hello,SpringCloud for TestB";
    }

}
