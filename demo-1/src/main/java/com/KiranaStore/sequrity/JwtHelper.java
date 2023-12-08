package com.KiranaStore.sequrity;
import java.awt.RenderingHints.Key;
import java.util.Date;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Function;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtHelper {
	private String GJWTToken(UserDetails userDetails) {
	    return Jwts.builder()
	            .setSubject(userDetails.getUsername())  // Set the subject of the token to the username from UserDetails
	            .issuedAt(new Date(System.currentTimeMillis()))  // Set the issue time of the token to the current time
	            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))  // Set the expiration time of the token to 24 hours from the current time
	            .signWith((java.security.Key) getSignKey(), SignatureAlgorithm.HS384)  // Sign the token using the specified signing key and algorithm (HS384)
	            .compact();  // Compact the token into its final string representation
	}

private Key getSignKey() {
	byte[] key=Decoders.BASE64.decode("123456abcdefghijk");
	return (Key) Keys.hmacShaKeyFor(key);
}
private <T> T TokenExtract(String Token, Function<Claims,T>  ClaimResolver) {
	final Claims claims=exractAllToken(Token);
	return ClaimResolver.apply(claims);
}

private Claims exractAllToken(String token) {
	return Jwts.parser().build()token.
}
}