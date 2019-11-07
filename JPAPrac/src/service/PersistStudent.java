package service;
import model.StudentPojo;
import javax.persistence.*;

public class PersistStudent {

	public static void main(String[] args) {
		
	//	Persistence p = new Persistence();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPrac");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		StudentPojo s1 = new StudentPojo();
		s1.setId(100);
		s1.setName("fire");
		
		
		StudentPojo s2 = new StudentPojo();
		s2.setId(101);
		s2.setName("water");
		
		em.persist(s1);
		em.persist(s2);
		
		em.getTransaction().commit();
		em.close();

	}

}
