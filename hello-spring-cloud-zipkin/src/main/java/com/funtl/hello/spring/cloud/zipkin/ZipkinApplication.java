package com.funtl.hello.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @ClassName ZipkinApplication
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/15 9:13
 * @Version 1.0
 **/

@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
