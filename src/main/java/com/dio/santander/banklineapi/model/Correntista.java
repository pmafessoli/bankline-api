package com.dio.santander.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Pablo Mafessoli(mafessolip@gmail.com)
 *
 */

@Entity
@Table(name = "tab_correntista")
public class Correntista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 20)
	private String cpf;

	@Column(length = 60)
	private String nome;
	
	@Embedded
	private Conta conta;
	
	public Correntista() {
		
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
}
