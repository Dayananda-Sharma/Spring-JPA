import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LenovoRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lenovo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        LenovoEntity lenovoEntity = entityManager.find(LenovoEntity.class, 2);
        lenovoEntity.setName("thinkPad");
        entityManager.merge(lenovoEntity);

        LenovoEntity lenovoEntity1 = entityManager.find(LenovoEntity.class, 3);
        lenovoEntity1.setPrice(50000);
        entityManager.merge(lenovoEntity);

        LenovoEntity lenovoEntity2 = entityManager.find(LenovoEntity.class, 4);
        lenovoEntity2.setPrice(60000);
        entityManager.merge(lenovoEntity2);

        LenovoEntity lenovoEntity4 = entityManager.find(LenovoEntity.class, 2);
        lenovoEntity4.setName("MAC");
        entityManager.merge(lenovoEntity4);

        LenovoEntity lenovoEntity3 = entityManager.find(LenovoEntity.class, 3);
        lenovoEntity3.setName("hp15");
        entityManager.merge(lenovoEntity3);


        System.out.println("updated");
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
