package com.apnigrocery.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnigrocery.Entity.User;
import com.apnigrocery.Repository.UserRepo;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class UserService implements UserInterface{

	@Autowired
	UserRepo userRepo;

	@Override
	public User addUser(User user) {
		userRepo.save(user);
		return user;
	}

	@Override
	public User deleteUser(int userID) {
		User user=userRepo.findById(userID).orElseThrow();
	userRepo.deleteById(userID);
		return user;
	}

	@Override
	public User UpdateUser(int userID, User User) {
		User newUser=userRepo.findById(userID).orElseThrow();
		newUser.setUserName(User.getUserName());
		newUser.setEmail(User.getEmail());
		newUser.setPassword(User.getPassword());
		userRepo.save(newUser);
		return newUser;
	}

	@Override
	public List<User> ListOfUser() {
		List<User> list=userRepo.findAll();
		return list;
	}
	

}
