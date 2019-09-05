package com.otavio.java.primeiroProjeto.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import com.otavio.java.primeiroProjeto.entity.Automovel;
import com.otavio.java.primeiroProjeto.util.JPAUtil;

public class PersistidorDeAutomovel{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("PrimeiroProjeto");
		
		EntityManager em = JPAUtil.getEntityManager();
		
		/*Query q = em.createQuery("select a from Automovel a", Automovel.class);
		
		List <Automovel> autos = q.getResultList();
		
		for(Automovel a : autos) {
			System.out.println("Carro:");
			System.out.println("Marca: " + a.getMarca());
			System.out.println("Modelo: " + a.getModelo());
			System.out.println("Ano de fabrica��o: " + a.getAnoFabricacao());
			System.out.println("Ano do modelo: " + a.getAnoModelo());
			System.out.println();
		}*/
		
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2015);
		auto.setAnoModelo(2015);
		auto.setMarca("Volkswagen");
		auto.setModelo("Voyage");
		auto.setObservacoes("Sedan de luxo.");
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(auto);
		tx.commit();
		
/*		Automovel auto2 = em.find(Automovel.class, 1);
		
		tx.begin();
		
		//em.persist(auto);
		em.remove(auto2);
		em.flush();
		tx.commit();*/
		
		em.close();
		
		//emf.close();
	}

}
