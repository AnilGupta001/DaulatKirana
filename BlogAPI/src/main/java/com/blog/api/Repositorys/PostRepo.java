package com.blog.api.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.api.Entity.Post;

public interface PostRepo extends JpaRepository<Post, Integer>{

}
