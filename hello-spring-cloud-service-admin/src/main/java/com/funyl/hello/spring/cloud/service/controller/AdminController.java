package com.funyl.hello.spring.cloud.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/14 11:14
 * @Version 1.0
 **/
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String message) {
        return String.format("hi ur meseeage is %s port:%s", message, port);
    }
}
