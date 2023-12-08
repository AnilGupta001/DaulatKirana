package com.example.Idea.Service;

import java.util.List;

import com.example.Idea.Entity.*;

public interface UserService {
User CreateUser(User User);
User updateDto(User User, Integer UserID);
User getUserByID(int UserID);
List<User> getAllUser();
void Delete(int UserID);	
}
