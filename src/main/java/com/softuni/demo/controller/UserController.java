package com.softuni.demo.controller;

import com.softuni.demo.model.entity.User;
import com.softuni.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @RequestMapping(path = "/users/all", method = RequestMethod.GET)
    @GetMapping("/users/all")
    public List<User> getAll(){
        return this.userService.getAll();
    }
}
