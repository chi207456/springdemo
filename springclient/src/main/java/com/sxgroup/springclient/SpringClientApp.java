package com.sxgroup.springclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringClientApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringClientApp.class, args);
    }
}
