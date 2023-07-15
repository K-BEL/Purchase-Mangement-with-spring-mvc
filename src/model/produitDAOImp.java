package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



public class produitDAOImp implements produitDAO {
	private EntityManager entityManager=JPA.getEntityManager("GESTIONPRODUIT");
	@Override
	public Produit create(Produit p) {
		EntityTransaction tx = entityManager.getTransaction();
	 	tx.begin();
	 	entityManager.persist(p);
	 	tx.commit();

		return p;
	}

	@Override
	public Produit select(int id) {
		return entityManager.find(Produit.class, id);
	}






}
