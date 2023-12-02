package com.softuni.demo.repository;

import com.softuni.demo.model.entity.Category;
import com.softuni.demo.model.enums.CategoryNames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Set<Category> findByNameIn(Set<CategoryNames> categories);
}
