package com.Mounika;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SpringService {
    
	
	@Value("${driverClassName}")
	private String className;
	@Value("${dbUrl}")
	private String url;
	@Value("${username}")
	private String username;
	@Value("${pass}")
	private String pass;
	@Override
	public String toString() {
		return "SomeExternalService [className=" + className + ", url=" + url + ", username=" + username + ", pass="
				+ pass + "]";
	}
	public String getClassName() {
		return className;
	}
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return pass;
	}
	
	
	
	
	
}
