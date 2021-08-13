package com.funtl.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @ClassName AdminService
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/14 11:35
 * @Version 1.0
 **/
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;



    @HystrixCommand
    public String sayHi(String message) {
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message=" + message, String.class);
    }

    public String hiError(String message) {
        return String.format("hi ur message is:%s but request bad", message);
    }
}
