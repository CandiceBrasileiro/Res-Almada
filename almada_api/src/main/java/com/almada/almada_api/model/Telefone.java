package com.almada.almada_api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_TELEFONE")
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int ddd;
	@Column(length = 10, nullable = false)
	private String num;
	@ManyToOne
	@JoinColumn(name = "pessoa_cpf", nullable = false)
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Telefone(int ddd, String num) {
		super();

		if (ddd == 0) {
			this.ddd = 83;
		} else {
			this.ddd = ddd;
		}
		this.num = num;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", num=" + num + "]";
	}

//	public static void main (String [] args){
//		Telefone telefone = new Telefone(0, "99525697");
//		System.out.println(telefone);
//	}
}
