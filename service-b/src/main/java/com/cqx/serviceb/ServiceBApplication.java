package com.cqx.serviceb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cqx.serviceb.feign"})
//@ComponentScan(basePackages = {"com.cqx.serviceb.feign"})
public class ServiceBApplication {

    private static final Logger logger = LoggerFactory.getLogger(ServiceBApplication.class);
    public static void main(String[] args) {
        logger.info("----------service-b Run Success----------");
        SpringApplication.run(ServiceBApplication.class, args);
        System.out.println("----------service-b Run Success----------");
    }

}
