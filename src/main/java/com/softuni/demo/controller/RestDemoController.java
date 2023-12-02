package com.softuni.demo.controller;

import com.softuni.demo.model.entity.User;
import com.softuni.demo.service.RestDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class RestDemoController {

    private RestDemoService restDemoService;

    public RestDemoController(RestDemoService restDemoService) {
        this.restDemoService = restDemoService;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return this.restDemoService.getAll();
    }
}
