package com.sxgroup.springclouddemo.service;



import com.sxgroup.springclouddemo.data.User;

import java.util.List;

public interface UserService {
    public User queryById(Integer id);
    public  void  deleteById(Integer id);
    public List<User>queryUsers();

}
