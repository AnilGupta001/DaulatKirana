package com.example.Idea.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Service;

import com.example.Idea.Entity.Category;
import com.example.Idea.Repository.CategoryRepo;
@Service
public class CategoryIMP implements CateRepo {
    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public Category create(Category category) {
        categoryRepo.save(category);
        return category;
    }

    @Override
    public Category update(Category category, int id) {
        Category category2 = categoryRepo.findById(id).orElseThrow();
        category2.setTitle(category.getTitle());
        category2.setDescription(category.getDescription());
        return category2;
    }

    @Override
    public void delete(int ID) {
        Category category2 = categoryRepo.findById(ID).orElseThrow();
        categoryRepo.delete(category2);
    }

    @Override
    public Category getCategory(int ID) {
        return categoryRepo.findById(ID).orElseThrow();
    }

    @Override
    public List<Category> listCategry() {
        return categoryRepo.findAll();
    }
}
