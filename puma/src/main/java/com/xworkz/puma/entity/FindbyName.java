package com.xworkz.puma.entity;

import javax.persistence.*;

public class FindbyName {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("puma");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();


        Query query = entityManager.createNamedQuery("findByName");
        query.setParameter("nameby", "daya");
        Object singleResult = query.getSingleResult();
        System.out.println(singleResult);

        entityManager.close();
        entityManagerFactory.close();

    }
}
