package com.springwebsecurity.configuration;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticationSuccessListener implements ApplicationListener<InteractiveAuthenticationSuccessEvent> {

	public void onApplicationEvent(InteractiveAuthenticationSuccessEvent event) {
		// for custom data -- http://javahotpot.blogspot.in/2013/12/spring-security-adding-more-information.html
		Object user = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("User Logged In"+user);

	}
}