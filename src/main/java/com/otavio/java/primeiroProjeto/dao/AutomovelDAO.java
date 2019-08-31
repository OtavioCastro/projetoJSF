package com.otavio.java.primeiroProjeto.dao;

import java.util.List;

import com.otavio.java.primeiroProjeto.entity.Automovel;

public interface AutomovelDAO {

	void salva(Automovel a);
	
	List<Automovel> lista();
}
