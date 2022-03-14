package com.sxgroup.springclouddemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudApp {
    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(SpringCloudApp.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
    }
}
