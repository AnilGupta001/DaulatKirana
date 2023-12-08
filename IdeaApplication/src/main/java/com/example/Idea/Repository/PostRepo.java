package com.example.Idea.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Idea.Entity.Category;
import com.example.Idea.Entity.Post;
import com.example.Idea.Entity.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
List<Post> findByUser(User user);
List<Post> findByCategory(Category category);
}
