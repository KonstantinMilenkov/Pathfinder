package com.softuni.demo.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterBindingModel{

       private String username;

       private String fullName;

       private String email;

       private int age;

       private String password;

       private String confirmPassword ;
}
