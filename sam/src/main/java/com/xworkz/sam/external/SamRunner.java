package com.xworkz.sam.external;

import com.xworkz.sam.entity.SamEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SamRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sam");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        SamEntity sam=new SamEntity(7,"sam",70000);
        entityManager.persist(sam);
        transaction.commit();
        System.out.println("inserted");

        SamEntity data = entityManager.find(SamEntity.class, 7);
        System.out.println(data.toString());
    }
}
