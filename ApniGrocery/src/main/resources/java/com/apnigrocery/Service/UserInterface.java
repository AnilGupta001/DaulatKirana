package com.apnigrocery.Service;

import java.util.List;

import com.apnigrocery.Entity.User;

public interface UserInterface {
 User addUser(User user);
 User deleteUser(int userID);
 User UpdateUser(int userID,User User);
 List<User> ListOfUser();
 
}
