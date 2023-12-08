package com.apnigrocery.Entity;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Component
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer userID;
@Column(length = 50,nullable = false)
@NotEmpty
private String userName;
@Column(nullable = false)
@Email(message = "Enter your email")
private String Email;
@Size(min = 8,max = 12,message = "password min 6 charactor and max 12 char")
@NotEmpty
private String password;
@ManyToMany
private List<Trasaction> trasactions;
@OneToMany
private List<Address> address;
public User(Integer userID, @NotEmpty String userName,
		@jakarta.validation.constraints.Email(message = "Enter your email") String email,
		@Size(min = 8, max = 12, message = "password min 6 charactor and max 12 char") @NotEmpty String password,
		List<Trasaction> trasactions, List<Address> address) {
	super();
	this.userID = userID;
	this.userName = userName;
	Email = email;
	this.password = password;
	this.trasactions = trasactions;
	this.address = address;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getUserID() {
	return userID;
}
public void setUserID(Integer userID) {
	this.userID = userID;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public List<Trasaction> getTrasactions() {
	return trasactions;
}
public void setTrasactions(List<Trasaction> trasactions) {
	this.trasactions = trasactions;
}
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}
public User(Integer userID, @NotEmpty String userName,
		@jakarta.validation.constraints.Email(message = "Enter your email") String email,
		@Size(min = 8, max = 12, message = "password min 6 charactor and max 12 char") @NotEmpty String password) {
	super();
	this.userID = userID;
	this.userName = userName;
	Email = email;
	this.password = password;
}
public User(@NotEmpty String userName, @jakarta.validation.constraints.Email(message = "Enter your email") String email,
		@Size(min = 8, max = 12, message = "password min 6 charactor and max 12 char") @NotEmpty String password) {
	super();
	this.userName = userName;
	Email = email;
	this.password = password;
}




}
