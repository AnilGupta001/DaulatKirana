package com.example.Idea.Service;

import com.example.Idea.Entity.Category;
import java.util.List;


public interface CateRepo {

 Category create(Category category);
 Category update(Category category,int id);
 void delete(int ID);
 Category getCategory(int ID);
 List<Category> listCategry();
}
