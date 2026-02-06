package com.xworkz.puma.external;

import com.xworkz.puma.entity.NamedQueryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PumaRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("puma");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        List<NamedQueryEntity> list=new ArrayList<>();
        list.add(new NamedQueryEntity(1,"Daya",776019787,25,"sharma2172000@gmail.com"));
        list.add(new NamedQueryEntity(2,"prasad",987662122,23,"prasad@gmail.com"));
        list.add(new NamedQueryEntity(3,"manoj",987733333,25,"manoj@gmail.com"));
        list.add(new NamedQueryEntity(4,"charles",897156383,24,"charles@gmail.com"));
        list.add(new NamedQueryEntity(5,"shree",653837833,23,"shree@gmail.com"));
        list.add(new NamedQueryEntity(6,"ajay",992922222,22,"ajay@gmail.com"));
        list.add(new NamedQueryEntity(7,"sharth",881187717,21,"sharth@gmail.com"));
        for (NamedQueryEntity data:list)
        entityManager.persist(data);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
