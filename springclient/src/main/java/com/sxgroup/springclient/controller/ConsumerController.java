package com.sxgroup.springclient.controller;

import com.sxgroup.springclient.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

    @Autowired
    private DiscoveryClient client;

    // Eureka客户端，可以获取到服务实例 信息
    @RequestMapping("/test1")
    public List<User> consumerTest1() {
        List<String> list = client.getServices();
        System.out.println("*服务列表*" + list);
        List<ServiceInstance> srvList = client.getInstances("springcloud-demo-service");
        for (ServiceInstance element : srvList) {

        //●注册中心： ●访问测试： 2.4.注册微服务信息完善
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t" + element.getUri());
        }
        // 因为只有一个UserService,因此我们直接get(0)获取
        ServiceInstance instance = srvList.get(0); // 获取ip和端口信息
        String baseUrl = "http://" + instance.getHost() + ":" + instance.getPort() + "/all";
        System.out.println("访问地址:" + baseUrl);
        return this.restTemplate.getForObject(baseUrl, List.class);
    }



}
