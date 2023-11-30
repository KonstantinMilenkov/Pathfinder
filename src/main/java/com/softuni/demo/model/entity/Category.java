package com.softuni.demo.model.entity;

import com.softuni.demo.model.enums.CategoryNames;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false, unique = true)
    private CategoryNames name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
}
