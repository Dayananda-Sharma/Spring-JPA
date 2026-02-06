package com.xworkz.puma.entity;

import javax.persistence.*;

public class FindbyEmail {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("puma");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query query = entityManager.createNamedQuery("findbyEmail");
        query.setParameter("emailby","prasad@gmail.com");
        Object singleResult = query.getSingleResult();
        System.out.println(singleResult);
        entityManager.close();
        entityManagerFactory.close();


    }
}
