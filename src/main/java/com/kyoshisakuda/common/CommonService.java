package com.kyoshisakuda.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CommonService {

    public static void main(String[] args) {
        SpringApplication.run(CommonService.class, args);
    }

}
