package com.atguigu.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private Long id;
    private String title; //文章标题
    private String content; //文章内容
    private Long cid; //分类id
    private Long uid; //用户id
    private Date create_time;
    private Date update_time;
}
