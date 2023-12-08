package com.KiranaStore.contollers;

import java.security.Principal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KiranaStore.Entity.Users;
import com.KiranaStore.Service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	UserService userService=new UserService();
public List<Users> users=userService.getUser();
	@GetMapping("/user")
	public List<Users> getUser() {
		System.out.print("Anil");
		return  users;
	}
	@GetMapping("/details")
	//Principal Is object there availble all the details releted user
	public String getCurrentUser(Principal principal) {
		return principal.getName();
	}
}
