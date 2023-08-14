package com.atguigu.blog.service;

import com.atguigu.blog.entity.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    List<Category> selectList();

    Category getCategory(Long cid);

    void insertCategory(Category category);

    void updateCategory(Category category);
    void DeleteCategory(Long cid);
    //条件分页查询
    Map<String, Object> queryPage(Long current, Long limit, Category category);
}
