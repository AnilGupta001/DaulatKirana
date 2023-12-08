package com.apnigrocery.Entity;

import java.awt.Image;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Component
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer ID;
	@NotEmpty
	private String ProductName;
	@NotEmpty
	private Double price;
	@NotEmpty
	private String ImageUrl;
	@NotEmpty
	private String Description;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer iD, @NotEmpty String productName, @NotEmpty Double price, @NotEmpty String imageUrl,
			@NotEmpty String description) {
		super();
		ID = iD;
		ProductName = productName;
		this.price = price;
		ImageUrl = imageUrl;
		Description = description;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
}
