package com.xworkz.microsoft.external;

import com.xworkz.microsoft.entity.MicrosoftEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MicroRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("micro");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        MicrosoftEntity entity =new MicrosoftEntity(6,"microsoft",50000);
        entityManager.persist(entity);
        transaction.commit();
        System.out.println("inserted");

        MicrosoftEntity d = entityManager.find(MicrosoftEntity.class, 6);
        System.out.println(d.toString());
    }
}
