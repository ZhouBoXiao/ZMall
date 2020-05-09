package com.devotion.zmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients(basePackages = "com.devotion.zmall.member.feign")
@EnableDiscoveryClient
//@MapperScan("com.devotion.zmall.member.dao")
@SpringBootApplication
public class ZmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmallMemberApplication.class, args);
    }

}
