package com.atguigu.blog.controller;

import com.atguigu.blog.entity.Article;
import com.atguigu.blog.service.ArticleService;
import com.atguigu.blog.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @PostMapping("/queryList")//列表
    public Result articleList(@RequestBody Article article) {
        List<Article> list = articleService.selectList(article);
        return Result.ok(list);
    }

    @GetMapping("/getArticle/{id}")//根据id查询
    public Result getArticle(@PathVariable long id) {
        Article article = articleService.getArticle(id);
        return Result.ok(article);
    }

    @PostMapping("insertArticle")
    public Result insertArticle(@RequestBody Article article) {
        articleService.addArticle(article);
        return Result.ok();
    }

    @PutMapping("updateArticle")
    public Result update(@RequestBody Article article) {
        articleService.updateArticle(article);
        return Result.ok(article);
    }

    @DeleteMapping("deleteArticle/{id}")
    public Result deletebyid(@PathVariable Long id) {
        articleService.deleteArticle(id);
        return Result.ok();
    }


}
