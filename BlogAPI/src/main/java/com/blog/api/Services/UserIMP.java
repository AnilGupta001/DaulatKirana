package com.blog.api.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.api.Entity.User;
import com.blog.api.Exception.ConfigDataResourceNotFoundException;
import com.blog.api.Payloads.UserDTO;
import com.blog.api.Repositorys.UserInterface;
@Service
public class UserIMP implements UserService{
@Autowired
	private UserInterface userInterface;
@Autowired
private ModelMapper mapper;
	@Override
	public UserDTO createUser(UserDTO user) {
		userInterface.save(UserdtoToUser(user));
		return user;
	}

	@Override
	public UserDTO update(UserDTO user, Integer userID) {
		UserDTO user1=getByID(userID);
		user1.setAbout(user.getAbout());
		user1.setEmail(user.getEmail());
		user1.setName(user.getName());
		user1.setPassword(user.getPassword());
		userInterface.save(UserdtoToUser(user1));
		return user1;
	}

	@Override
	public UserDTO getByID(Integer userID) {
    User user = null;
	try {
		user = this.userInterface.findById(userID).orElseThrow(()->new ConfigDataResourceNotFoundException("User","id",userID));
	} catch (ConfigDataResourceNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return UserDToUserDTO(user);
	}

	@Override
	public List<UserDTO> getAllUsers() {
		List<User> users=userInterface.findAll();
	List<UserDTO> userDTOs=	users.stream().map(user->UserDToUserDTO(user)).collect(Collectors.toList());
return userDTOs;
	}

	@Override
	public void deleteUser(Integer userId) {
		UserDTO user=getByID(userId);
		userInterface.delete(UserdtoToUser(user));
		
		
	}
	private User UserdtoToUser(UserDTO userDTO) {
//		User user=new User();
//		user.setName(userDTO.getName());
//		user.setPassword(userDTO.getPassword());
//		user.setEmail(userDTO.getEmail());
//		user.setAbout(userDTO.getAbout());
		User user=this.mapper.map(userDTO, User.class);
		return user;
	}
private UserDTO UserDToUserDTO(User user) {
		UserDTO userDTO=this.mapper.map(user, UserDTO.class);
		return userDTO;
	}

	

}
