package com.ig.evergreen.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ig.evergreen.beans.Customer;
import com.ig.evergreen.beans.Order;
import com.ig.evergreen.beans.SpringConfig;

public class App {
	public static void main(String[] args) { // IOC container - create beans, destroying, lifecycle, scope

		// BeanFactory ioc=new XMLBeanFactory(new FileSystemResource("beans.xml"));
		/*
		 * ClassPathXmlApplicationContext ioc = new
		 * ClassPathXmlApplicationContext("beans.xml"); Order o=(Order)ioc.getBean("o");
		 * Order o1=(Order)ioc.getBean("o"); Order o2=(Order)ioc.getBean("o"); Customer
		 * c=(Customer)ioc.getBean("c"); ioc.close();
		 * o.setAmount(9999.99);
		 * o.setId(102); 
		 */

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		// object creation,destruction ,lifecycle, scope
		Order o=(Order)context.getBean("order");
		Order o1=(Order)context.getBean(Order.class);
		System.out.println(o.hashCode() + "  " + o1.hashCode());
		System.out.println(o.getId() + "  " + o.getAmount());
		System.out.println(o1.getId() + "  " + o1.getAmount());
		Customer c=(Customer)context.getBean("customer");//using method name
		System.out.println(c+"\t"+c.hashCode());
		Customer c1=(Customer)context.getBean(Customer.class);//using class
		System.out.println(c1+"\t"+c1.hashCode());
		context.close();
	}
}