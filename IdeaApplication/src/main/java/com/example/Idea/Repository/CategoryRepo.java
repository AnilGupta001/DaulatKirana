package com.example.Idea.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Idea.Entity.Category;



public interface CategoryRepo  extends JpaRepository<Category, Integer>{

}
