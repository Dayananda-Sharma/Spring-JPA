package com.xworkz.puma.entity;

import javax.persistence.*;

public class FindPhAndEmail {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("puma");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query query = entityManager.createNamedQuery("findPhAndEmail");
        query.setParameter("numberby",776019787l);
        query.setParameter("emailby","prasad@gamil.com");

        Object entity = query.getSingleResult();
        System.out.println(entity);

        entityManager.close();
        entityManagerFactory.close();
    }
}
