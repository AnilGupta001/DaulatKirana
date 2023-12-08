package com.KiranaStore.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class AppCongfigration {
	@Bean
public UserDetailsService userDetailsService() {
UserDetails userDetails= User.builder().username("anil").password(posswordEncoder().encode("anil")).roles("ROLES").build();
UserDetails userDetails1= User.builder().username("anil1").password(posswordEncoder().encode("anil")).roles("ROLES").build();
UserDetails userDetails2= User.builder().username("anil2").password(posswordEncoder().encode("anil")).roles("ROLES").build();
return new InMemoryUserDetailsManager(userDetails,userDetails1,userDetails2);
		}
	@Bean
public PasswordEncoder posswordEncoder() {
	return new BCryptPasswordEncoder();
}
	
}
