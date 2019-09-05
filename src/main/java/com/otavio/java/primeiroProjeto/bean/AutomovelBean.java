package com.otavio.java.primeiroProjeto.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.otavio.java.primeiroProjeto.entity.Automovel;
import com.otavio.java.primeiroProjeto.util.JPAUtil;

@ManagedBean
public class AutomovelBean {
	
	private Automovel automovel = new Automovel();
	
	private List<Automovel> automoveis;	
	
	
	public void salva(Automovel automovel) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(automovel);
		
		em.getTransaction().commit();
		em.close();
		
	}	
	
	public void exclui(Automovel automovel) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		em.remove(automovel);
		
		em.getTransaction().commit();
		em.close();
	}

	public List<Automovel> getAutomoveis() {
		if(this.automoveis == null) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Query q = em.createQuery("select a from Automovel a", Automovel.class);
		
		this.automoveis = q.getResultList();
		em.close();
		}
		
		return automoveis;
		
	}

	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	
}
