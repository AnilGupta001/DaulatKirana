package com.example.Idea.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Idea.Entity.User;
import com.example.Idea.Repository.UserRepository;
@Service
public class UserIMP implements UserService{
@Autowired
UserRepository userRepository;
@Autowired
private ModelMapper mapper;
	@Override
	public User CreateUser(User User) {
	userRepository.save(User);
	return User;
	}

	@Override
	public User updateDto(User User, Integer UserID) {
		User user2=userRepository.findById(UserID).orElseThrow();
		return user2;
	}

	@Override
	public User getUserByID(int UserID) {
		User user2=userRepository.findById(UserID).orElseThrow();
		return user2;
	}

	@Override
	public List<User> getAllUser() {
	return userRepository.findAll();
	}

	@Override
	public void Delete(int UserID) {
		User user2=userRepository.findById(UserID).orElseThrow();
		userRepository.delete(user2);
				
	}
}