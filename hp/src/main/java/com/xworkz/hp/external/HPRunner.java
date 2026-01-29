package com.xworkz.hp.external;

import javax.persistence.*;

public class HPRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("hp");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
           entityTransaction.begin();

        if (entityManager != null){

            System.out.println("its connected");
        }else {
            System.out.println("its not connected");
        }

    }
}
