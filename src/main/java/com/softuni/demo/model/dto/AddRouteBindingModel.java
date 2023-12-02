package com.softuni.demo.model.dto;

import com.softuni.demo.model.enums.CategoryNames;
import com.softuni.demo.model.enums.Level;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class AddRouteBindingModel {

    private String name;

    private String description;

    private Level level;

    private String videoUrl;

    private Set<CategoryNames> categories;

}
