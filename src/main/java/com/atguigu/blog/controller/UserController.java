package com.atguigu.blog.controller;

import com.atguigu.blog.entity.User;
import com.atguigu.blog.service.UserService;
import com.atguigu.blog.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("login")
    public Result loginUser(@RequestBody User user) {
        User userExist = userService.login(user);
        if (userExist != null) {
            Map<String, Object> map = new HashMap<>();
            map.put("username", userExist.getUsername());
            map.put("uid", userExist.getUid());
            return Result.ok(map);
        } else {
            return Result.fail();
        }
    }

    @PostMapping("register")
    public Result registerUser(@RequestBody User user) {
        boolean flag = userService.register(user);
        if (flag) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @GetMapping("getUser/{id}")//根据id查询
    public Result getUser(@PathVariable Long id) {
        User user = userService.get(id);
        return Result.ok(user);
    }

    @PutMapping("updateUser")
    public Result updateUSer(@RequestBody User user) {
        userService.update(user);
        return Result.ok();
    }

}
