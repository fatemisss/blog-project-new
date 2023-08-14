package com.atguigu.blog.service.impl;

import com.atguigu.blog.entity.Category;
import com.atguigu.blog.mapper.CategoryMapper;
import com.atguigu.blog.service.CategoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> selectList() {
        return categoryMapper.selectList();
    }

    @Override
    public Category getCategory(Long cid) {
        return categoryMapper.getCategory(cid);
    }

    @Override
    public void insertCategory(Category category) {
        categoryMapper.insertCategory(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryMapper.updateCategory(category);
    }

    @Override
    public void DeleteCategory(Long cid) {
        categoryMapper.DeleteCategory(cid);
    }

    @Override
    public Map<String, Object> queryPage(Long current, Long limit, Category category) {
        //查询总记录数
        Long total = categoryMapper.selectCount(category);
        //分页条件查询
        Long begin = (current-1)*limit;
        List<Category> list = categoryMapper.pageList(begin,limit,category);
        //封装
        Map<String, Object> map = new HashMap<>();
        map.put("total",total);
        map.put("list",list);
        return map;
    }


}
