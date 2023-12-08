package com.blog.api.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.api.Entity.User;

public interface UserInterface extends JpaRepository<User, Integer>{

}