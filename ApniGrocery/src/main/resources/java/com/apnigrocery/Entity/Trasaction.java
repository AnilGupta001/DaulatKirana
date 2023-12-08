package com.apnigrocery.Entity;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Component
public class Trasaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer ID;
	@NotEmpty
    private double amount;
	@NotEmpty
   @DateTimeFormat(style = "dd-MM-yyyy")
    private Date date;
	@ManyToMany
	private List<Product> list;
	@ManyToOne
	private User user;
	public Trasaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trasaction(Integer iD, @NotEmpty double amount, @NotEmpty Date date, List<Product> list, User user) {
		super();
		ID = iD;
		this.amount = amount;
		this.date = date;
		this.list = list;
		this.user = user;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Product> getList() {
		return list;
	}
	public void setList(List<Product> list) {
		this.list = list;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
