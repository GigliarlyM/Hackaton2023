package br.com.hackaton2023.SistemaPix.model;

import jakarta.persistence.*;

@Entity
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "agencia_conta")
	private Integer agencia;
	@Column(name = "numero_conta")
	private Long numeroDaConta;
	@Column(name = "saldo_conta")
	private Double saldo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Long getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(Long numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
