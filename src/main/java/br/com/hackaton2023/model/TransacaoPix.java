package br.com.hackaton2023.model;

import jakarta.persistence.*;

@Entity
public class TransacaoPix {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Usuario remetente;
	@ManyToOne
	private Usuario destinatario;
	private Double valor;
	private Status status;

	public TransacaoPix() {
	}

	public TransacaoPix(Usuario remetente, Usuario destinatario, Double valor) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.valor = valor;
		this.status = Status.PENDENTE;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getRemetente() {
		return remetente;
	}

	public void setRemetente(Usuario remetente) {
		this.remetente = remetente;
	}

	public Usuario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Usuario destinatario) {
		this.destinatario = destinatario;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public enum Status {
		PENDENTE, FINALIZADA
	}

}