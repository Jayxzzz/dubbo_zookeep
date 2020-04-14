package com.java.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:Jay
 * time:16:55
 * date:2020/4/12
 */
@SpringBootApplication(scanBasePackages = "com.java.consumer.*")
public class ConsumerStart {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStart.class);
    }
}
