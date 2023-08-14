package com.atguigu.blog.mapper;

import com.atguigu.blog.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> selectList();

    Category getCategory(Long cid);

    void insertCategory(Category category);

    void updateCategory(Category category);

    void DeleteCategory(Long cid);
    Long selectCount(Category category);

    List<Category> pageList(@Param("begin") Long begin,
                            @Param("limit") Long limit,
                            @Param("vo") Category category);

}
