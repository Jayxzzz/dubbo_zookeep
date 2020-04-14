package com.java.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:Jay
 * time:15:44
 * date:2020/4/12
 */
@SpringBootApplication(scanBasePackages = "com.java.provider.*")
public class Provider1Start {
    public static void main(String[] args) {
        SpringApplication.run(Provider1Start.class);
    }
}
