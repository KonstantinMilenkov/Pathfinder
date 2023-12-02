package com.softuni.demo.model.dto;

import com.softuni.demo.model.enums.Level;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddRouteBindingModel {

    private String name;

    private String description;

    private Level level;

    private String videoUrl;
}
