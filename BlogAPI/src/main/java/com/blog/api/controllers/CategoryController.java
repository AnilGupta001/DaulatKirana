package com.blog.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.api.Payloads.APIResoponce;
import com.blog.api.Payloads.CategoryDTO;
import com.blog.api.Services.CategoryService;

@RestController
@RequestMapping("/Category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/")
  public ResponseEntity<CategoryDTO> createEntity(@RequestBody CategoryDTO categoryDTO) {
        CategoryDTO createdCategory = categoryService.createCategoryDTO(categoryDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
    }
    @PutMapping("/{CategoryID}")
    public ResponseEntity<CategoryDTO> updatEntity(CategoryDTO categoryDTO,@PathVariable Integer CategoryID){
    	return new ResponseEntity<CategoryDTO>(categoryService.updateCategoryDTO(categoryDTO, CategoryID),HttpStatus.OK);
    }
    @GetMapping("/{cate")
    public ResponseEntity<CategoryDTO> getallEntity(@PathVariable Integer cate){
    	return  ResponseEntity.ok(categoryService.getCategoryDTOByID(cate));
    }
    @DeleteMapping("/{CategoryID}")
    public ResponseEntity<APIResoponce> updatEntity(@PathVariable Integer CategoryID){
    	return ResponseEntity.ok(new APIResoponce("Category",true));
    }
}
