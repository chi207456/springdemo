package com.sxgroup.springclient.controller;

import com.sxgroup.springclient.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public List<User> consumerTest() {
        String url = "http://127.0.0.1:8081/all";
        return this.restTemplate.getForObject(url, List.class);
    }


}
