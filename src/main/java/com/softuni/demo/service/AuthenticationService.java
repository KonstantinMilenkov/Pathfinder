package com.softuni.demo.service;

import com.softuni.demo.model.dto.UserLoginBindingModel;
import com.softuni.demo.model.dto.UserRegisterBindingModel;

public interface AuthenticationService {
    void register(UserRegisterBindingModel userRegisterBindingModel);

    boolean login(UserLoginBindingModel userRegisterBindingModel);

    void logout();
}
