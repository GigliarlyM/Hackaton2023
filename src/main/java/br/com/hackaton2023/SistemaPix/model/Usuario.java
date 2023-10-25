package br.com.hackaton2023.SistemaPix.model;

import jakarta.persistence.*;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cpf")
	private String cpf;
	@OneToOne
	private Conta conta;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Conta getPix() {
		return conta;
	}
	public void setPix(Conta pix) {
		this.conta = pix;
	}
}
