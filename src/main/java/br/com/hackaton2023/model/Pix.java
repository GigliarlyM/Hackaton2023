package br.com.hackaton2023.model;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@DynamicUpdate
public class Pix {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "chave_pix")
	private String chavePix;
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	public Pix(){}

	public Pix(String chavePix, Usuario usuario) {
		this.chavePix = chavePix;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
