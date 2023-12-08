package com.KiranaStore.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.KiranaStore.Entity.Users;

@Service
public class UserService {
private List<Users> users=new ArrayList<>();

public UserService() {
	users.add(new Users(UUID.randomUUID().toString(), "Anil", "anil@gmail.com"));
	users.add(new Users(UUID.randomUUID().toString(), "Abhay", "abhay@gmail.com"));
	users.add(new Users(UUID.randomUUID().toString(), "Arvind", "arvind@gmail.com"));
	users.add(new Users(UUID.randomUUID().toString(), "akash", "akash@gmail.com"));
}

public List<Users> getUser(){
	return users;
}
}