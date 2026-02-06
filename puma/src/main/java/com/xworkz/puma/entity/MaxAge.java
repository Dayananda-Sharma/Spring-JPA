package com.xworkz.puma.entity;

import javax.persistence.*;

public class MaxAge {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("puma");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();


        Query query=entityManager.createNamedQuery("getMaxInAge");
        Integer result=(Integer) query.getSingleResult();
        System.out.println(result);

        entityManager.close();
        entityManagerFactory.close();
    }
}
