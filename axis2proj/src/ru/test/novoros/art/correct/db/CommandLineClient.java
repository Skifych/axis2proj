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
	}
	
	private void initEntityManager() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}
}
