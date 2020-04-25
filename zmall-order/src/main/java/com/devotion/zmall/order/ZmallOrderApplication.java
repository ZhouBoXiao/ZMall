package com.devotion.zmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.devotion.zmall.order.dao")
@SpringBootApplication
public class ZmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmallOrderApplication.class, args);
    }

}
