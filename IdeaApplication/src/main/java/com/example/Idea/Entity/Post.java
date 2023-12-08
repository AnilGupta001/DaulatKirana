package com.example.Idea.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.*;

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
	
	
	public Post(String title, String content, String imageName, String addedString) {
		super();
		this.title = title;
		this.content = content;
		this.imageName = imageName;
		this.addedString = addedString;
	}


	public Post(String title, String content, String imageName, String addedString, Category category, User user) {
		super();
		this.title = title;
		this.content = content;
		this.imageName = imageName;
		this.addedString = addedString;
		this.category = category;
		this.user = user;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addedString, category, content, id, imageName, title, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(addedString, other.addedString) && Objects.equals(category, other.category)
				&& Objects.equals(content, other.content) && id == other.id
				&& Objects.equals(imageName, other.imageName) && Objects.equals(title, other.title)
				&& Objects.equals(user, other.user);
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
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", imageName=" + imageName
				+ ", addedString=" + addedString + ", category=" + category + ", user=" + user + "]";
	}


	public Post(String title, String content, String imageName) {
		super();
		this.title = title;
		this.content = content;
		this.imageName = imageName;
	}
	
	
}
