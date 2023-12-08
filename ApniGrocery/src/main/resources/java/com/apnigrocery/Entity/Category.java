package com.apnigrocery.Entity;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Component
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer ID;
 @NotEmpty
 private String CategoryName;
@OneToMany
private List<Product> list;
public Category(Integer iD, @NotEmpty String categoryName, List<Product> list) {
	super();
	ID = iD;
	CategoryName = categoryName;
	this.list = list;
}
public Integer getID() {
	return ID;
}
public void setID(Integer iD) {
	ID = iD;
}
public String getCategoryName() {
	return CategoryName;
}
public void setCategoryName(String categoryName) {
	CategoryName = categoryName;
}
public List<Product> getList() {
	return list;
}
public void setList(List<Product> list) {
	this.list = list;
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}


 
}
