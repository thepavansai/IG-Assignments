package com.ig.evergreen.springcomponents;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CityTest {
	public static void main(String []phantom) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigComponent.class);
		GothamCity joker=(GothamCity)context.getBean(GothamCity.class);
		System.out.println(joker);
		joker.setName("Joker");
		joker.setSsn(1345);
		System.out.println(joker);
		//joker.destroy();
		GothamCity jokerr=(GothamCity)context.getBean(GothamCity.class);
		System.out.println(joker.hashCode()+"\t"+jokerr.hashCode());
		context.close();
	}
}
