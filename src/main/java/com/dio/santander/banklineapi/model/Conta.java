package com.dio.santander.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 
 * @author Pablo Mafessoli(mafessolip@gmail.com)
 *
 */

@Embeddable
public class Conta {
	
	@Column(name= "conta_numero")
	private Long numer;
	
	@Column(name= "conta_saldo")
	private Double saldo;
	
	
	
	public Long getNumer() {
		return numer;
	}
	public void setNumer(Long numer) {
		this.numer = numer;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
