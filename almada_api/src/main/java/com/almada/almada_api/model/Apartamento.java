package com.almada.almada_api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_APARTAMENTO")
public class Apartamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer numero;
	@Column(length = 100, nullable = true)
	private String posicao;
	@OneToOne(mappedBy = "apt")
	private Pessoa titular;
	
	public Apartamento(Integer numero, String posicao, Pessoa titular) {
		super();
		this.numero = numero;
		this.posicao = posicao;
		this.titular = titular;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public Pessoa getTitular() {
		return titular;
	}
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "Apartamento [numero=" + numero + ", posicao=" + posicao + ", titular=" + titular + "]";
	}
	
	
}
