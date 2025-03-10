package com.ig.evergreen.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean,DisposableBean {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	String name;
	String email;
	public Customer(){
		
	}
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method form Disposable");		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after prop set");	
	}
	
}
