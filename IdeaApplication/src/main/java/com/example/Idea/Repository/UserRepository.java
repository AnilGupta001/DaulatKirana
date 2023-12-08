package com.example.Idea.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Idea.Entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
