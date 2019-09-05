package com.otavio.java.primeiroProjeto.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="automovel")
public class Automovel {

	@Column(name="anoFabricacao")
	private Integer anoFabricacao;
	
	@Column(name="anoModelo")
	private Integer anoModelo;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="marca")
	private String marca;

	@Column(name="modelo")
	private String modelo;
	
	@Column(name="observacoes")
	private String observacoes;
	
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
