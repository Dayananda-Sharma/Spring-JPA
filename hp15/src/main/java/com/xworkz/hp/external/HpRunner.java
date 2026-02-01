package com.xworkz.hp.external;

import com.xworkz.hp.entity.HpEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HpRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        HpEntity hpEntity = entityManager.find(HpEntity.class, 8);
        entityManager.remove(hpEntity);

        HpEntity hpEntity1 = entityManager.find(HpEntity.class, 3);
        entityManager.remove(hpEntity1);

        HpEntity hpEntity2 = entityManager.find(HpEntity.class, 4);
        entityManager.remove(hpEntity2);

        HpEntity hpEntity3 = entityManager.find(HpEntity.class, 9);
        entityManager.remove(hpEntity3);
        HpEntity hpEntity4 = entityManager.find(HpEntity.class, 11);
        entityManager.remove(hpEntity4);

        transaction.commit();

    }
}
