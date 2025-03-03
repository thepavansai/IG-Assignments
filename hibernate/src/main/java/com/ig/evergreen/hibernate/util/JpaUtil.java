package com.ig.evergreen.hibernate.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
	private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentTable");
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
	public static void close() {
		emf.close();
	}

}
