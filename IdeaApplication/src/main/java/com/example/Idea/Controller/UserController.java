package com.example.Idea.Controller;

import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Idea.EXception.ResourceNOtFoundException;
import com.example.Idea.Entity.User;
import com.example.Idea.Service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody User User) {
        User createdUser = userService.CreateUser(User);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@Valid @PathVariable("id") Integer userId, @RequestBody User User) throws AttributeNotFoundException {
        User updatedUser = userService.updateDto(User, userId);
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@Valid @PathVariable("id") Integer userId) throws ResourceNOtFoundException {
        userService.Delete(userId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@Valid @PathVariable("id") Integer userId) {
        User user = userService.getUserByID(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
