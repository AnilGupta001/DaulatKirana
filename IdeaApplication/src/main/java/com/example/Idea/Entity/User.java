package com.example.Idea.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@NotEmpty
	@Size(min = 4,message="User must be min of 4 Charctoter!")
private String name;
	@Email(message = "Email address is not valid !!")
private  String email;
	@NotEmpty
	@Size(min = 3 ,max = 10 ,message = "Password Must be min of 3 and max of 4 Charactor")
	//@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")
private String Password;
	@NotEmpty
private  String about;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Post> posts=new ArrayList<>();
public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(int id, String name, String email, String password, String about) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	Password = password;
	this.about = about;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}

public List<Post> getPosts() {
	return posts;
}

public void setPosts(List<Post> posts) {
	this.posts = posts;
}

public User(@NotEmpty @Size(min = 4, message = "User must be min of 4 Charctoter!") String name,
		@Email(message = "Email address is not valid !!") String email,
		@NotEmpty @Size(min = 3, max = 10, message = "Password Must be min of 3 and max of 4 Charactor") @Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$") String password,
		@NotEmpty String about, List<Post> posts) {
	super();
	this.name = name;
	this.email = email;
	Password = password;
	this.about = about;
	this.posts = posts;
}



}
