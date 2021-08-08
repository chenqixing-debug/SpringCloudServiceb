package com.cqx.serviceb.controller;

import com.cqx.serviceb.feign.HelloServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qixing.chen
 * @Date 2021/8/8 2:10 下午
 */
@RestController
public class TestFeignController {

    @Autowired
    private HelloServiceFeign helloServiceFeign;

    @RequestMapping(value = "getServiceA", method = RequestMethod.GET)
    public String getServiceA() {
        return helloServiceFeign.getServiceA();
    }
}
