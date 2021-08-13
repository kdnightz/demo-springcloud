package com.funyl.hello.spring.cloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName SerivceAdminApplication
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/14 11:05
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class, args);
    }
}
