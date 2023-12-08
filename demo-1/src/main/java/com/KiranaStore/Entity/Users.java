package com.KiranaStore.Entity;

import java.util.Objects;

import org.springframework.stereotype.Service;

public class Users {
private String userID;
private String UserName;
private String email;
public Users(String userID, String userName, String email) {
	super();
	this.userID = userID;
	UserName = userName;
	this.email = email;
}
@Override
public int hashCode() {
	return Objects.hash(UserName, email, userID);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Users other = (Users) obj;
	return Objects.equals(UserName, other.UserName) && Objects.equals(email, other.email)
			&& Objects.equals(userID, other.userID);
}
public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Users() {
	super();
}


	
}
