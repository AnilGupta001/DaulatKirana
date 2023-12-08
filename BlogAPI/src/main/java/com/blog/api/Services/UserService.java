package com.blog.api.Services;

import java.util.List;

import com.blog.api.Payloads.UserDTO;

public interface UserService {
UserDTO createUser(UserDTO user);
UserDTO update(UserDTO user, Integer userID);
UserDTO getByID(Integer userID);
List<UserDTO> getAllUsers();
void deleteUser(Integer userId);

}
