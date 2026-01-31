package com.xworkz.inspiron.external;

import com.xworkz.inspiron.entity.DellEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DellRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dell");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        DellEntity dellEntity=new DellEntity(11,"mAC",700000);
        entityManager.persist(dellEntity);
        transaction.commit();
    }

}
