package com.example.Idea.EXception;

public class ResourceNOtFoundException  extends Exception{

String resouceName;
String fielName;
long fielValue;

	public ResourceNOtFoundException(String resouceName,String fielName,long fielValue) {
	super(String.format("%s not found with %s : %l",resouceName));
	this.resouceName=resouceName;
	this.fielName=fielName;
	this.fielValue=fielValue;
}
	
}
