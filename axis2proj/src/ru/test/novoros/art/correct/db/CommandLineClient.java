package ru.test.novoros.art.correct.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CommandLineClient {
	private static final String PERSISTENCE_UNIT_NAME = "axis2proj";
	private EntityManagerFactory emf;
	private static EntityManager em;
	 
	public static void main(String[] args) {
		CommandLineClient main = new CommandLineClient();
		main.initEntityManager();
		//createRoles()
		//em.find(Users.class, "skif");
		/*
		 * http://www.javacodegeeks.com/2012/07/ultimate-jpa-queries-and-tips-list-part.html
		 * 
		  private static Person findPersonByName(EntityManager em, String name) {
			Query query = em.createQuery('select p from Person p where name = :name', Person.class);
			query.setParameter('name', name);
			return (Person) query.getSingleResult();
		  }
		 *  
		 */
	}
	
	private void initEntityManager() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}
}
