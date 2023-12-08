package com.blog.api.Payloads;

import java.util.ArrayList;
import java.util.List;

public class CategoryDTO {
private int catId;	
private String title;
private String Description;
private List<PostDTO> posts=new ArrayList<>();

public CategoryDTO(String title, String description, List<PostDTO> posts) {
	super();
	this.title = title;
	Description = description;
	this.posts = posts;
}
public int getCatId() {
	return catId;
}
public void setCatId(int catId) {
	this.catId = catId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public List<PostDTO> getPosts() {
	return posts;
}
public void setPosts(List<PostDTO> posts) {
	this.posts = posts;
}
public CategoryDTO() {
	super();
	// TODO Auto-generated constructor stub
}

}
