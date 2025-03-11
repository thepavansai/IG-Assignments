package com.spring.webapp.model;

public class Cars {
	String name;
	String company;
	Integer modelNo;
	Double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Integer getModelNo() {
		return modelNo;
	}
	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}
	
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cars [name=" + name + ", company=" + company + ", modelNo=" + modelNo + ", price=" + price + "]";
	}
	
	
	
	
}
