package com.example.Idea.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int catId;
	@Column(nullable = false)
	
private String title;
private String Description;
@OneToMany(mappedBy = "category",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
private List<Post> posts=new ArrayList<>();
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Category( String title, String description) {
	super();
	this.title = title;
	Description = description;
}
@Override
public String toString() {
	return "Category [catId=" + catId + ", title=" + title + ", Description=" + Description + "]";
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
public Category(String title, String description, List<Post> posts) {
	super();
	this.title = title;
	Description = description;
	this.posts = posts;
}


}
