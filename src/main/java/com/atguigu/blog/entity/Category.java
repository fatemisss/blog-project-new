package com.atguigu.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Long cid;
    private String cname; //分类名称
    private Date create_time;
    private Date update_time;
}
