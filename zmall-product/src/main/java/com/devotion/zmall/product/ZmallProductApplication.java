package com.devotion.zmall.product;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//@MapperScan("com.devotion.zmall.product.dao")
@SpringBootApplication
public class ZmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmallProductApplication.class, args);
    }

}
