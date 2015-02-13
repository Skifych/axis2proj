package ru.test.novoros.art.correct.db;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	
	
	
	private static void createUsers(String name, String pass, String role, String comment) {
		//Set<Author> authorSet = new HashSet<Author>();
		Set<UserRoles> userRoles = new HashSet<UserRoles>();
		Users user = new Users();
		UserRoles userRole = new UserRoles();
		user.setLogin(name);
		user.setPass(pass);
		if (findUserRoleByType(role)!=null) {
			userRole=findUserRoleByType(role);
		}
		else {
			createUserRole(role);
		}
		user.setUserRole(userRole);
		//Author author = new Author();
		//Book book = new Book();
		//au.setId(1L);
		//g.setMessage("hello, createAndRead");
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}
	
	private static UserRoles findUserRoleByType(String role) {
		Query query = em.createQuery("select u from userroles u where role = :role", UserRoles.class);
		query.setParameter("role", role);
		return (UserRoles) query.getSingleResult();
	}
	private static UserRoles createUserRole(String role){
		UserRoles userRole = new UserRoles();
		userRole.setRole(role);
		em.getTransaction().begin();
		em.persist(userRole);
		em.getTransaction().commit();
		return findUserRoleByType(role);
	}
	
	private void initEntityManager() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}
}
