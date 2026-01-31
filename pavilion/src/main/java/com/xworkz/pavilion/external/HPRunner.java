package com.xworkz.pavilion.external;

import com.xworkz.pavilion.entity.HpEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HPRunner {
    public static void main(String[] args) {

           try {


               EntityManagerFactory hp = Persistence.createEntityManagerFactory("hp");
               EntityManager entityManager = hp.createEntityManager();
               EntityTransaction transaction = entityManager.getTransaction();
               transaction.begin();
               HpEntity data = entityManager.find(HpEntity.class, 2);
               HpEntity data1 = entityManager.find(HpEntity.class, 3);
               HpEntity data2 = entityManager.find(HpEntity.class, 4);
               HpEntity data3 = entityManager.find(HpEntity.class, 9);
               HpEntity data4 = entityManager.find(HpEntity.class, 10);

               System.out.println(data.toString());
               System.out.println(data1.toString());
               System.out.println(data2.toString());
               System.out.println(data3.toString());
               System.out.println(data4.toString());
           }catch (Exception e){
               e.printStackTrace();
           }

    }
}
