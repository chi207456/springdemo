package com.sxgroup.eurakeserver7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakeServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurakeServer7001Application.class, args);
    }

}
