package com.xworkz.rapido.external;

import com.xworkz.rapido.entity.RapidoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class RapidoRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rapido");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        List<RapidoEntity> entityList=new ArrayList<>();
//        entityList.add(new RapidoEntity(101,"dasa",76552211));
//        entityList.add(new RapidoEntity(102,"raju",76552765));
//        entityList.add(new RapidoEntity(103,"roja",76552354));
//        entityList.add(new RapidoEntity(104,"navya",89552211));
//        entityList.add(new RapidoEntity(105,"nithya",96552211));


//        for (RapidoEntity data:entityList){
//            entityManager.persist(data);
//        }

      RapidoEntity rapido = entityManager.find(RapidoEntity.class,105);
//      rapido.setName("ram");
//      entityManager.merge(rapido);
//
//
//        transaction.commit();

        entityManager.remove(rapido);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
