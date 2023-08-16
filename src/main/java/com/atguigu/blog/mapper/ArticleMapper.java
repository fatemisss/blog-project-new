package com.atguigu.blog.mapper;

import com.atguigu.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface ArticleMapper {
    List<Article> selectList(Article article);
    Article getArticle(Long id);
    void addarticle(Article article);
    void deleteArticle(Long id);

    void updateArticle(Article article);
    List<Article> findArticleById(Integer uid);

}
