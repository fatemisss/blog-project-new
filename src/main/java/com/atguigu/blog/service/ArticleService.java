package com.atguigu.blog.service;

import com.atguigu.blog.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> selectList(Article article);
    Article getArticle(Long id);

    void addArticle(Article article);

    void deleteArticle(Long id);
    void updateArticle(Article article);
    List<Article> findArticleById(Integer uid);
}
