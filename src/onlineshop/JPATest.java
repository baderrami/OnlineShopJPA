package onlineshop;

import javax.persistence.*;

public class JPATest {
	private static final String PERSISTENCE_UNIT_NAME = "user04_jpa";
	static EntityManagerFactory emf;
	
	
	public static void main(String[] args) {
			emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			EntityManager em = emf.createEntityManager();
		
				// Create new article
				 Article art1 = new Article();
				 // Set property values
				 art1.setArticle("Keyboard");
				 art1.setPrice(20.99);
				 art1.setCurrency('E');
				 art1.setDeleted(false);

				 // store new article in DB
				 em.persist(art1);
				 em.getTransaction().begin();
				 em.getTransaction().commit();
				 System.out.println("Article " +art1.getArticle_id() + " has been created and made persistent");
				 System.out.println(art1.getArticle_id() + " " + art1.getArticle() + " " + art1.getPrice() + " " + art1.getCurrency());
	}
}
