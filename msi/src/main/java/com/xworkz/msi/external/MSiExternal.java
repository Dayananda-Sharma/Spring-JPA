package com.xworkz.msi.external;

import com.xworkz.msi.entity.MSIEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MSiExternal {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("msi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        MSIEntity msiEntity=new MSIEntity(2,"msi",40000);

        entityManager.persist(msiEntity);
        transaction.commit();
        System.out.println("inserted");

        MSIEntity data=entityManager.find(MSIEntity.class,2);
        System.out.println(data.toString());


    }
}
