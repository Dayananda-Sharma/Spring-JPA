package com.xworkz.hero.external;

import com.xworkz.hero.entity.HeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HeroRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hero");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        HeroEntity hero = new HeroEntity(4, "access", 30000);

        entityManager.persist(hero);
        transaction.commit();
        System.out.println("new row inserted...");

        HeroEntity data=entityManager.find(HeroEntity.class, 1);
        System.out.println(data.toString());

    }
}
