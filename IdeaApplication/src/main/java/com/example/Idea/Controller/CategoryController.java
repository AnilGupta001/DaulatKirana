package com.example.Idea.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Idea.Entity.Category;
import com.example.Idea.Service.CategoryIMP;

import jakarta.validation.constraints.AssertFalse.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired 
    CategoryIMP categoryIMP;

    @PostMapping
    public ResponseEntity<Category> creatEntity(@RequestBody Category category) {
        Category category2 = categoryIMP.create(category);
        return new ResponseEntity<Category>(category2, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> UpdateEntity(@RequestBody Category category, @PathVariable int id) {
        Category category2 = categoryIMP.update(category, id);
        return new ResponseEntity<Category>(category2, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> GetEntity(@PathVariable int id) {
        Category category2 = categoryIMP.getCategory(id);
        return new ResponseEntity<Category>(category2, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<java.util.List<Category>> GetEntity() {
        java.util.List<Category> category2 = categoryIMP.listCategry();
        return new ResponseEntity<java.util.List<Category>>(category2, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> DeleteEntity(@PathVariable int id) {
        categoryIMP.delete(id);
        return new ResponseEntity<String>("Category Has Been Deleted", HttpStatus.OK);
    }
}
