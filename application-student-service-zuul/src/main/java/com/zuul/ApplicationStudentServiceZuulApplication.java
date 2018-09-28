package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApplicationStudentServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStudentServiceZuulApplication.class, args);
	}
}
