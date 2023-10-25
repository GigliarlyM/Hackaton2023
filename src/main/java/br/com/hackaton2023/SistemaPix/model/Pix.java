package br.com.hackaton2023.SistemaPix.model;

import jakarta.persistence.*;

public class Pix {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "chave_pix")
	private String chavePix;
	@OneToOne
	private Usuario usurio;

	public String getChavePix() {
		return chavePix;
	}
	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

}
