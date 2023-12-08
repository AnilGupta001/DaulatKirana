package com.blog.api.Exception;

public class ConfigDataResourceNotFoundException extends Exception{
String resourceName;
String fieldNam;
long fieldValue;
public ConfigDataResourceNotFoundException() {
	super();
	// TODO Auto-generated constructor stub
}
public ConfigDataResourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
		boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	// TODO Auto-generated constructor stub
}
public ConfigDataResourceNotFoundException(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
}
public ConfigDataResourceNotFoundException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
}
public ConfigDataResourceNotFoundException(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
}
public ConfigDataResourceNotFoundException(String resourceName, String fieldNam, long fieldValue) {
    super(String.format("%s not found with %s : %d", resourceName, fieldNam, fieldValue));
    this.resourceName = resourceName;
    this.fieldNam = fieldNam;
    this.fieldValue = fieldValue;
}

public String getResourceName() {
	return resourceName;
}
public void setResourceName(String resourceName) {
	this.resourceName = resourceName;
}
public String getFieldNam() {
	return fieldNam;
}
public void setFieldNam(String fieldNam) {
	this.fieldNam = fieldNam;
}
public long getFieldValue() {
	return fieldValue;
}
public void setFieldValue(long fieldValue) {
	this.fieldValue = fieldValue;
}


}
