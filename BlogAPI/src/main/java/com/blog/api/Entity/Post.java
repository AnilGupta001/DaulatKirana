package com.blog.api.Entity;

import java.time.LocalDate;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(nullable = false)
private String title;
	@Column(nullable = false,length = 100000)
private String content;
	@Column(nullable = false)
private String imageName;
	@Column(nullable = false)
private String addedString=LocalDate.now().toString();
     @ManyToOne
	private Category category;
	 @ManyToOne
	private User user;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(String title, String content, String imageName, String addedString,
			com.blog.api.Entity.Category category, com.blog.api.Entity.User user) {
		super();
		this.title = title;
		this.content = content;
		this.imageName = imageName;
		this.addedString = addedString;
		this.category = category;
		this.user = user;
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	 
}
