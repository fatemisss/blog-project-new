package com.atguigu.blog.controller;

import com.atguigu.blog.entity.Category;
import com.atguigu.blog.service.CategoryService;
import com.atguigu.blog.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    //条件分页查询
    @PostMapping("queryListPage/{current}/{limit}")
    public Result queryListPage(@PathVariable Long current,
                                @PathVariable Long limit,
                                @RequestBody(required = false) Category category) {
        Map<String,Object> data = categoryService.queryPage(current,limit,category);
        return Result.ok(data);
    }

    @GetMapping("queryList")
    public Result queryList() {
        List<Category> list = categoryService.selectList();
        return Result.ok(list);
    }

    @GetMapping("/getCategory/{cid}")
    public Result getCategorybycid(@PathVariable Long cid) {
        Category category = categoryService.getCategory(cid);
        return Result.ok(category);
    }

    @PostMapping("addCategory")
    public Result addCategory(@RequestBody Category category) {
        categoryService.insertCategory(category);
        return Result.ok();
    }

    @PutMapping("updateCategory")
    public Result update(@RequestBody Category category) {
        categoryService.updateCategory(category);
        return Result.ok(category);
    }

    @DeleteMapping("deleteCategory/{cid}")
    public Result delete(@PathVariable Long cid) {
        categoryService.DeleteCategory(cid);
        return Result.ok();
    }
}
