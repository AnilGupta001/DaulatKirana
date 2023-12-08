package com.apnigrocery.Entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Component
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer ID;
	@NotEmpty
private String Locality;
	@NotEmpty
private String city;
	@NotEmpty
	@Size(min = 6,max = 6)
private String pin;
	@OneToMany(mappedBy = "address")
	private List<User> users;

	
	public Address() {
	super();
	// TODO Auto-generated constructor stub
}


public Integer getID() {
		return ID;
	}


	public void setID(Integer iD) {
		ID = iD;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


public Address(Integer iD, @NotEmpty String locality, @NotEmpty String city,
			@NotEmpty @Size(min = 6, max = 6) String pin, List<User> users) {
		super();
		ID = iD;
		Locality = locality;
		this.city = city;
		this.pin = pin;
		this.users = users;
	}


public String getLocality() {
	return Locality;
}
public void setLocality(String locality) {
	Locality = locality;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}



}
