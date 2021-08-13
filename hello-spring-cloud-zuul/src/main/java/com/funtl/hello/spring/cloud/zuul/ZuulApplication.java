package com.funtl.hello.spring.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName ZuulApplication
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/14 14:41
 * @Version 1.0
 **/

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
