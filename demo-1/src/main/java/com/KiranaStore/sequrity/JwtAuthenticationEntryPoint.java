package com.KiranaStore.sequrity;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public abstract class  JwtAuthenticationEntryPoint implements AuthenticationEntryPoint{

	public void commence(HttpServletRequest req,HttpServletResponse res,AuthenticationEntryPoint authenticationEntryPoint) throws IOException {
		res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		PrintWriter writer=res.getWriter();
		writer.println("Access Deny");
	}
}
