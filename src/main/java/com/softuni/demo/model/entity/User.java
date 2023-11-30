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
@Table(name = "users")
public class User extends BaseEntity{
    @Column(name = "age")
    private Integer age;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "email")
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns ={ @JoinColumn(name = "user_id",referencedColumnName = "id") },
            inverseJoinColumns = {@JoinColumn(name = "roles_id",referencedColumnName = "id")}
    )
    private Set<Role> roles;

    @Enumerated(EnumType.STRING)
    private Level level;

    public User() {
        this.roles = new HashSet<>();
    }
}
