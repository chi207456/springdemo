package com.sxgroup.springhelloword.conntroll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    private Map<String,Object> result=new HashMap<>();
    @RequestMapping("/hello")
    public Map<String,Object> hello(){
        result.put("name","eric");
        result.put("gender","男");
       return result;
    }
}
