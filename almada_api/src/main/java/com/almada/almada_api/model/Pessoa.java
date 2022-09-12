package com.almada.almada_api.model;

import java.io.Serializable;
//import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_PESSOA")
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length = 11)
	private String cpf;
	@Column(length = 150, nullable = false)
	private String nome;
	@OneToOne
	@JoinColumn(name = "numero_apt", referencedColumnName = "numero")
	private Apartamento apt;
	@OneToMany(mappedBy="pessoa")
	private List<Telefone> telefones;
	@Column(length = 100, nullable = false)
	private String email;
	@Column(length = 10, nullable = false)
	private String senha;
	@Enumerated(EnumType.ORDINAL)
	private TipoPessoa tipo;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String cpf, String nome, Apartamento apt, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.apt = apt;
		this.email = email;
	}
	
	public Pessoa(String cpf, String nome, Apartamento apt, String email, TipoPessoa tipo) {
		this.cpf = cpf;
		this.nome = nome;
		this.apt = apt;
		this.email = email;
		this.tipo = tipo;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Apartamento getApt() {
		return apt;
	}
	public void setApt(Apartamento apt) {
		this.apt = apt;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", apt=" + apt + ", telefones=" + telefones + ", email="
				+ email + ", senha=" + senha + ", tipo=" + tipo + "]";
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

//	public static void main (String [] args) {
//		
//		Pessoa pessoa = new Pessoa("07673662477", "Candice", 304, "candice@gmail.com");
//		List<Telefone> tels = new ArrayList<>(); 
//		Telefone telefone = new Telefone(83,"99525697");
//		tels.add(telefone);
//		Telefone telefone2 = new Telefone(83,"999837230");
//		tels.add(telefone2);
//		pessoa.setTelefones(tels);
//		
//		System.out.println(pessoa);
//	}
	
}
