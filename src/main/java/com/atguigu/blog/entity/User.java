package com.atguigu.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long uid; //用户id
    private String username;//用户名称
    private String password;//密码
    private String phone;//手机号
    private String introduction;//个人介绍
    private Date createTime;
    private Date updateTime;
}
