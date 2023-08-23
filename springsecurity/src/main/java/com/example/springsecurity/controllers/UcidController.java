package com.example.springsecurity.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UcidController {
	
	@GetMapping("/api/user")
	public Object getUserInfo() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		OidcUser user = (OidcUser)authentication.getPrincipal();
		return user;
	}
	
}
