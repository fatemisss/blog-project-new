package com.atguigu.blog.service;

import com.atguigu.blog.entity.User;

public interface UserService {
    //登录
    User login(User user);
    //注册
    boolean register(User user);
    //根据id查询
    User get(Long id);

    //修改
    void update(User user);
}
