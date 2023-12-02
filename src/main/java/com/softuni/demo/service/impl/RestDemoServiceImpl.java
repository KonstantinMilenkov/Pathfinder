package com.softuni.demo.service.impl;

import com.softuni.demo.model.entity.User;
import com.softuni.demo.repository.UserRepository;
import com.softuni.demo.service.RestDemoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestDemoServiceImpl implements RestDemoService {
    private UserRepository userRepository;

    public RestDemoServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
