package com.zuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zuul.filters.ErrorFilter;
import com.zuul.filters.PostFilter;
import com.zuul.filters.PreFilter;
import com.zuul.filters.RouteFilter;

@Configuration
public class ZuulConfig {
	
	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
