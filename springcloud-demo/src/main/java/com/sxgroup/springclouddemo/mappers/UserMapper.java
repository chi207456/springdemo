package com.sxgroup.springclouddemo.mappers;


import com.sxgroup.springclouddemo.data.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.bruce.mapper
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-16 15:07
 * @Description: TODO
 */
@Mapper
public interface UserMapper {

    //根据ID查询
    public User queryById(Integer id);

    //根据ID删除
    public int deleteById(Integer id);

    //查询用户
    public List<User> queryUsers();
}
