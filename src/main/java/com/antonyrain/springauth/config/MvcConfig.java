package com.antonyrain.springauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry
			.addViewController("/")
			.setViewName("index");

		registry
			.addViewController("/login")
			.setViewName("login");

		registry
			.addViewController("/logged")
			.setViewName("logged");

		registry
			.addViewController("/logout")
			.setViewName("logout");

		registry
			.addViewController("/user")
			.setViewName("user");

		registry
			.addViewController("/moderator")
			.setViewName("moderator");

		registry
			.addViewController("/admin")
			.setViewName("admin");
	}
}