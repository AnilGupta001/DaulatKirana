package com.blog.api.Payloads;

import java.time.LocalDate;

import com.blog.api.Entity.User;

public class PostDTO {
private int id;
	
private String title;
	
private String content;
	
private String imageName;
	
private String addedString=LocalDate.now().toString(); 
	private CategoryDTO category;
	
	private UserDTO user;
	public PostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getAddedString() {
		return addedString;
	}
	public void setAddedString(String addedString) {
		this.addedString = addedString;
	}
	public CategoryDTO getCategory() {
		return category;
	}
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public PostDTO(String title, String content, String imageName, String addedString, CategoryDTO category, UserDTO user) {
		super();
		this.title = title;
		this.content = content;
		this.imageName = imageName;
		this.addedString = addedString;
		this.category = category;
		this.user = user;
	}
	
}