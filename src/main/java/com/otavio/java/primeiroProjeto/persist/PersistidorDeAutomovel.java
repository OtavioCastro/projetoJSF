package com.otavio.java.primeiroProjeto.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.otavio.java.primeiroProjeto.entity.Automovel;
import com.otavio.java.primeiroProjeto.util.JPAUtil;

public class PersistidorDeAutomovel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("PrimeiroProjeto");
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Query q = em.createQuery("select a from Automovel a", Automovel.class);
		
		List <Automovel> autos = q.getResultList();
		
		for(Automovel a : autos) {
			System.out.println("Carro:");
			System.out.println("Marca: " + a.getMarca());
			System.out.println("Modelo: " + a.getModelo());
			System.out.println("Ano de fabricação: " + a.getAnoFabricacao());
			System.out.println("Ano do modelo: " + a.getAnoModelo());
			System.out.println();
		}
		
/*		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2007);
		auto.setAnoModelo(2007);
		auto.setMarca("Audi");
		auto.setModelo("A8");
		auto.setObservacoes("Potente");*/
		

		
		/*EntityTransaction tx = em.getTransaction();
		tx.begin();		
		//em.persist(auto);
		tx.commit();
		
		em.close();*/
		
		//emf.close();
	}

}
