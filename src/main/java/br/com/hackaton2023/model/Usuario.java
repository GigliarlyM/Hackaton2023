package br.com.hackaton2023.model;

import jakarta.persistence.*;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	@ManyToOne
	@JoinColumn(name = "instituicao_id")
	private Instituicao instituicao;
	
	public Usuario(){}

	public Usuario(String nome, String cpf, Instituicao instituicao) {
		this.nome = nome;
		this.cpf = cpf;
		this.instituicao = instituicao;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
}
