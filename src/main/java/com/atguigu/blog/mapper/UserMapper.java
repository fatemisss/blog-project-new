package com.atguigu.blog.mapper;

import com.atguigu.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User loginUser(String username);
    //注册
    void insertUser(User user);
    //根据id查询
    User getUser(Long id);
    //修改
    void updateUser(User user);
}
