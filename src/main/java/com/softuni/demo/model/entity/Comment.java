package com.softuni.demo.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "comments")
public class Comment extends BaseEntity{
    @Column(name = "approved", nullable = false)
    private boolean approved;

    @Column(name = "created", nullable = false)
    private LocalDateTime created;

    @Column(name = "text_content", columnDefinition = "TEXT",nullable = false)
    private String textContent;

    @ManyToOne
    private User author;

    @ManyToOne
    private Route route;

}
