package com.sxgroup.springhelloword.conntroll;


import com.sxgroup.springhelloword.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    /*** 用户列表展示 */
    @RequestMapping("/list1")
    public String list(Model model){
        //模拟用户数据
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"小张",18));
        list.add(new User(2,"小徐",20));
        list.add(new User(3,"小陈",22));
        //把数据存入model
          model.addAttribute("list", list);
          //跳转到 freemarker 页面:   list.ftl
     return "list";
    }
}
