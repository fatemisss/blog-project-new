package com.atguigu.blog.service.impl;

import com.atguigu.blog.entity.User;
import com.atguigu.blog.mapper.UserMapper;
import com.atguigu.blog.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        User selectUser = userMapper.loginUser(user.getUsername());//数据库查寻名字是否存在,存在返回user对象
        if (selectUser != null) {
            String inputpass = user.getPassword();//传入的user对象的密码
            String databasepass = selectUser.getPassword();//后台数据库获取的密码
            if (!inputpass.equals(databasepass)) {//比较二者是否相等
                return null;
            }
            return selectUser;
        }
        return null;

    }

    @Override
    public boolean register(User user) {
        User selectUser = userMapper.loginUser(user.getUsername());
        if (selectUser == null) {
            userMapper.insertUser(user);
            return true;
        }
        return false;
    }

    @Override
    public User get(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateUser(user);
    }
}
