package com.xworkz.puma.entity;

import javax.persistence.*;

public class FindbyNumber {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("puma");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query namedQuery = entityManager.createNamedQuery("findbyphoneNumber");
        namedQuery.setParameter("numberby",776019787l);
        Object singleResult = namedQuery.getSingleResult();
        System.out.println(singleResult);

        entityManager.close();
        entityManagerFactory.close();


    }
}
