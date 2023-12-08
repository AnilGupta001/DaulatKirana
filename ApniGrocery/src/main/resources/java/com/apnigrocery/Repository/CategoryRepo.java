package com.apnigrocery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apnigrocery.Entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
