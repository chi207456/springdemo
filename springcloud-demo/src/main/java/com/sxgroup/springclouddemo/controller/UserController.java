package com.sxgroup.springclouddemo.controller;

import com.sxgroup.springclouddemo.data.User;
import com.sxgroup.springclouddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class UserController {
 @Autowired
   private UserService userService;
 @GetMapping("/test")
 @ResponseBody
  public User test(){
      return  userService.queryById(1);
  }
    @GetMapping("/all")
    @ResponseBody
  public List<User> all(ModelMap mode) {
        List<User> users = userService.queryUsers();
// mode.addAllAttributes("users",users);
        return users;
    }
}
