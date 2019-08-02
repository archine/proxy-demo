package com.example.demo.web.api;

import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Gjing
 **/
@RestController
public class TestController {
    @Resource
    private UserService userService;

    @GetMapping("/test")
    public void test() {
        System.out.println(userService.getUser(1));
        System.out.println(userService.ok());
        userService.say();
    }
}
