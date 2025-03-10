package com.ig.evergreen.springcomponents;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class GothamCity implements InitializingBean ,DisposableBean{
	private String name;
	private Integer ssn;
	public GothamCity() {
		
	}
	public GothamCity(String name, Integer ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSsn() {
		return ssn;
	}
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "GothamCity [name=" + name + ", ssn=" + ssn + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after prop set");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method form Disposable");
		
	}
	
	
}
