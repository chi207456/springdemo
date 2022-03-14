package com.sxgroup.springclouddemo.service.impl;

import com.sxgroup.springclouddemo.data.User;
import com.sxgroup.springclouddemo.mappers.UserMapper;
import com.sxgroup.springclouddemo.service.UserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User queryById(Integer id) {
        return userMapper.queryById(id);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public List<User> queryUsers() {
        return userMapper.queryUsers();
    }
}
