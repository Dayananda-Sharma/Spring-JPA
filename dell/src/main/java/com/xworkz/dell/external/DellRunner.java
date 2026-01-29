package com.xworkz.dell.external;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DellRunner {
    public static void main(String[] args) {
        EntityManagerFactory dell = Persistence.createEntityManagerFactory("dell");
        EntityManager entityManager = dell.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        if (dell!=null){
            System.out.println("connected");
        }else {
            System.out.println("not connected");
        }
    }
}
