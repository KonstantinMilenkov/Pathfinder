package com.softuni.demo.service.impl;

import com.softuni.demo.model.entity.User;
import com.softuni.demo.repository.UserRepository;
import com.softuni.demo.service.UserService;
import com.softuni.demo.service.session.LoggedUser;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final LoggedUser loggedUser;

    public UserServiceImpl(UserRepository userRepository, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.loggedUser = loggedUser;
    }

    @Override
    public User getLoggedUser() {
        return userRepository.findByUsername(loggedUser.getUsername());
    }
}
