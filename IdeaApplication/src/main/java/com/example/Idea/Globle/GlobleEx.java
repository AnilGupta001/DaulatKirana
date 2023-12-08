package com.example.Idea.Globle;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.Idea.Controller.UserController;
import com.example.Idea.EXception.ResourceNOtFoundException;
import com.example.Idea.EXception.ValidationEX;

@RestControllerAdvice
public class GlobleEx {
	@ExceptionHandler(ValidationEX.class)
public ResponseEntity<Map<String, String>> handleValidationEntity(MethodArgumentNotValidException ex){
	Map<String, String> respMap=new HashMap<>();
	ex.getBindingResult().getAllErrors().forEach(e->{
		
		String  massage=e.getDefaultMessage(); 
		respMap.put(e.getObjectName(), massage);
		});
	return new ResponseEntity<Map<String,String>>(respMap,HttpStatus.BAD_REQUEST);
}


}
