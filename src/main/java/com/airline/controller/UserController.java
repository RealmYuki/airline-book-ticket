package com.airline.controller;

import com.airline.dto.Result;
import com.airline.pojo.User;
import com.airline.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ClassName: UserController
 * Description:
 * {@code @Author} 苏羽晨
 * {@code @Create} 2023/10/25 17:02
 * {@code @Version}  1.0
 */
@RequestMapping("/user")
@Slf4j
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public Result create(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }

}
