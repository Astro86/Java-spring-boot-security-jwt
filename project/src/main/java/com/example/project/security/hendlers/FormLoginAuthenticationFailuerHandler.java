package com.example.project.security.hendlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

@Component
public class FormLoginAuthenticationFailuerHandler implements AuthenticationFailureHandler {
	
	private static final Logger log = LoggerFactory.getLogger(FormLoginAuthenticationFailuerHandler.class);
	
	@Override
	public void onAuthenticationFailure(
			HttpServletRequest request, 
			HttpServletResponse response,
			AuthenticationException exception
			) throws IOException, ServletException {
		log.error(exception.getMessage());
	}

}
