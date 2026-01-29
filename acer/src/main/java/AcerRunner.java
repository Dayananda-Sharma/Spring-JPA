import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AcerRunner {
    public static void main(String[] args) {
        EntityManagerFactory managerFactory =Persistence.createEntityManagerFactory("acer");
        EntityManager manager =managerFactory.createEntityManager();
        EntityTransaction transaction =manager.getTransaction();
        transaction.begin();
        if (transaction!=null){
            System.out.println("its connected");
        }else {
            System.out.println("its not connected");
        }
    }
}
