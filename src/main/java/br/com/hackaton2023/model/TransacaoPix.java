package br.com.hackaton2023.model;

import jakarta.persistence.*;

@Entity
public class TransacaoPix {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManytoOne
	private Usuario usuario;
	private Double valorDoPix;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getPaga() {
		return paga;
	}

	public void setPaga(Usuario paga) {
		this.paga = paga;
	}

	public Usuario getRecebe() {
		return recebe;
	}

	public void setRecebe(Usuario recebe) {
		this.recebe = recebe;
	}

	public Double getValorDoPix() {
		return valorDoPix;
	}

	public void setValorDoPix(Double valorDoPix) {
		this.valorDoPix = valorDoPix;
	}

}

