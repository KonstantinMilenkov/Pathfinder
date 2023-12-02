package com.softuni.demo.service.session;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
public class LoggedUser {

    private String username;

    private String email;

    private String fullName;

    private boolean isLogged;
    public void reset(){
        setUsername(null);
        setEmail(null);
        setFullName(null);
        setLogged(false);
    }

}
