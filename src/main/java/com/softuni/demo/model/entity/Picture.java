package com.softuni.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pictures")
@Getter
@Setter
@NoArgsConstructor
public class Picture extends BaseEntity{

    @Column(name = "title")
    private String title;

    @Column(name = "url")
    private String url;
    @ManyToOne
    private User author;

    @ManyToOne
    private Route route;

}
