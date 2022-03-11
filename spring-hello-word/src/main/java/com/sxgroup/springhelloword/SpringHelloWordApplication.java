package com.sxgroup.springhelloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication //扫描Servlet的注解
public class SpringHelloWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloWordApplication.class, args);
    }
//    @Bean
//    public ServletRegistrationBean getServletRegistrationBean(){
//        ServletRegistrationBean bean= new ServletRegistrationBean<>(new HelloServlet());
//        bean.addUrlMappings("/helloServlet");
//        return bean;
//
//    }
//    @Bean
//    public FilterRegistrationBean getFilterRegistrationBean(){
//        FilterRegistrationBean bean= new FilterRegistrationBean(new HelloFilter());
//        bean.addUrlPatterns("/helloServlet");
//        return bean;
//
//    }

}
