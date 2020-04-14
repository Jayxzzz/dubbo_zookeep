package com.java.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:Jay
 * time:16:38
 * date:2020/4/12
 */
@SpringBootApplication(scanBasePackages = "com.java.provider.*")
public class Provider2Start {
    public static void main(String[] args) {
        SpringApplication.run(Provider2Start.class);
    }
}
