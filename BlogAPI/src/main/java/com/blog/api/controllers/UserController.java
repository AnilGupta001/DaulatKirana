package com.blog.api.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.api.Entity.User;
import com.blog.api.Payloads.UserDTO;
import com.blog.api.Services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    // Autowire the UserService to interact with the user data
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        UserDTO createdUserDTO = this.userService.createUser(userDTO);
        return new ResponseEntity<>(createdUserDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{userID}")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable("userID") Integer userID) {
        UserDTO updateDto = this.userService.update(userDTO, userID);
        return ResponseEntity.ok(updateDto);
    }

    @DeleteMapping("/{UserID}")
    public ResponseEntity<Map<String, String>> deleteEntity(@PathVariable Integer UserID) {
        this.userService.deleteUser(UserID);
        return ResponseEntity.ok(Map.of("message", "User deleted"));
    }

    @GetMapping("/")
    public ResponseEntity<List<UserDTO>> getAll() {
        List<UserDTO> userDTOs = userService.getAllUsers();
        return ResponseEntity.ok(userDTOs);
    }

    @GetMapping("/{userID}")
    public ResponseEntity<UserDTO> getById(@PathVariable Integer userID) {
        UserDTO userDTO = userService.getByID(userID);
        return ResponseEntity.ok(userDTO);
    }
}
