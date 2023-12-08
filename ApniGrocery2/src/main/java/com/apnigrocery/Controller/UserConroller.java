package com.apnigrocery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apnigrocery.Entity.User;
import com.apnigrocery.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserConroller {
	@Autowired
	UserService userService=new UserService();
@GetMapping
public List<User> getAllUser(){
	userService.addUser(new User("Anil","Anil@email.com","123234365"));
	userService.addUser(new User("Anil","Anil@email.com","123234365"));
	userService.addUser(new User("Anil","Anil@email.com","123234365"));
	userService.addUser(new User("Anil","Anil@email.com","123234365"));
	userService.addUser(new User("Anil","Anil@email.com","123234365"));
	userService.addUser(new User("Anil","Anil@email.com","123234365"));
	userService.addUser(new User("Anil","Anil@email.com","123234365"));
	userService.addUser(new User("Anil","Anil@email.com","123234365"));
	
	
	return userService.ListOfUser();
}
@PostMapping
public User saveUser(@RequestBody User send) {
	userService.addUser(send);
	return send;
}
}
