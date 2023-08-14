package com.atguigu.blog.mapper;

import com.atguigu.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User loginUser(String username);

}
