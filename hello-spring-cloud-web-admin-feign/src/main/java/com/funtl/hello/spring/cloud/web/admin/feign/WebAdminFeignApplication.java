package com.funtl.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName WebAdminFeignApplication
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/14 11:51
 * @Version 1.0
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
public class WebAdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class, args);
    }
}
