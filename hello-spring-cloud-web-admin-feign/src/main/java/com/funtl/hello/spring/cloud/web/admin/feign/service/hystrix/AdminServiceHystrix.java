package com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @ClassName AdminServiceHystrix
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/14 14:07
 * @Version 1.0
 **/

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("hi ur message is : %s but request bad", message);
    }

}
