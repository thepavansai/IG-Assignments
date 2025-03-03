package com.ig.evergreen.hibernate.ui;

import com.ig.evergreen.hibernate.model.Student;
import com.ig.evergreen.hibernate.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(new Student("phantom"));
            em.persist(new Student("dark knight"));
            transaction.commit();

            List<Student> students = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
            students.forEach(System.out::println);

            transaction.begin();
            Student studentToUpdate = em.find(Student.class, 1);
            if (studentToUpdate != null) {
                studentToUpdate.setName("updated phantom");
                transaction.commit();
            } else {
                transaction.rollback();
            }

            transaction.begin();
            Student studentToDelete = em.find(Student.class, 2);
            if (studentToDelete != null) {
                em.remove(studentToDelete);
                transaction.commit();
            } else {
                transaction.rollback();
            }

            students = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
            students.forEach(System.out::println);

        } catch (Exception e) {
            if (transaction.isActive()) transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            JpaUtil.close();
        }
    }
}