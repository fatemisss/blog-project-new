package com.atguigu.blog.service.impl;

import com.atguigu.blog.entity.Article;
import com.atguigu.blog.mapper.ArticleMapper;
import com.atguigu.blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;
    @Override
    public List<Article> selectList(Article article) {
        return articleMapper.selectList(article);
    }

    @Override
    public Article getArticle(Long id) {
        return articleMapper.getArticle(id);
    }

    @Override
    public void addArticle(Article article) {
        articleMapper.addarticle(article);
    }

    @Override
    public void deleteArticle(Long id) {
        articleMapper.deleteArticle(id);
    }

    @Override
    public void updateArticle(Article article) {
        articleMapper.updateArticle(article);
    }
}
