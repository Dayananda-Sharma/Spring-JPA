package com.xworkz.asus.external;

import com.xworkz.asus.entity.AsusEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AsusRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("asus");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        AsusEntity asus =new AsusEntity(5,"Asus",45000);

        entityManager.persist(asus);
        transaction.commit();
        System.out.println("inserted");

        AsusEntity asus1 = entityManager.find(AsusEntity.class, 1);
        System.out.println(asus1.toString());
    }
}
