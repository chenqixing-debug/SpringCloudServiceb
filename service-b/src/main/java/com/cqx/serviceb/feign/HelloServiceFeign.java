package com.cqx.serviceb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author qixing.chen
 * @Date 2021/8/8 1:32 下午
 */
@FeignClient("SERVICE-A")
public interface HelloServiceFeign {

    @RequestMapping(value = "testA", method = RequestMethod.GET)
    public String getServiceA();
}
