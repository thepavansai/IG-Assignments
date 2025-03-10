package com.ig.evergreen.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Order implements InitializingBean,DisposableBean{
	
	Integer id;
	Double amount;
	public Order(){
		
	}
	public Order(Integer id, Double amount) {
		super();
		this.id = id;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", amount=" + amount + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void start() {
		System.out.println(" bean ready to use ,created ");
	}
	public void stop() {
		System.out.println(" bean ready to stop ");
		
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