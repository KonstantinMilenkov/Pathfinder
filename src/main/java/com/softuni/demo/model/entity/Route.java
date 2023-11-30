package com.softuni.demo.model.entity;

import com.softuni.demo.model.enums.Level;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@Entity
@Table(name = "routes")
public class Route extends BaseEntity{

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name ="gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinate;

    @Enumerated(EnumType.STRING)
    @Column(name = "level")
    private Level level;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @ManyToOne
    private User author;

    @Column(name = "video_url")
    private String videoUrl;

    @ManyToMany
    private Set<Category> categories;

    public Route() {
        this.categories = new HashSet<>();
    }
}
