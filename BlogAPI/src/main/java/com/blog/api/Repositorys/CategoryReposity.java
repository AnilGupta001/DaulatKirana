package com.blog.api.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.api.Entity.Category;

public interface CategoryReposity extends JpaRepository<Category, Integer>{

}
