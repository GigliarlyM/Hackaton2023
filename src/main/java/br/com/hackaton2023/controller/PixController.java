package br.com.hackaton2023.controller;

import br.com.hackaton2023.model.Pix;
import br.com.hackaton2023.model.Usuario;
import br.com.hackaton2023.repository.PixRepository;
import br.com.hackaton2023.repository.UsuarioRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pix/chave")
public class PixController {

	@Autowired
	private PixRepository pixRepo;

	@Autowired
	private UsuarioRepository usuarioRepo;

	@PostMapping
	public Pix inserirChavePix(@RequestParam String chavePix, Long usuarioId ){

		Usuario usuario = usuarioRepo.findById(usuarioId).get();
		Pix pix = new Pix(chavePix, usuario);

		Pix result = pixRepo.save(pix);
		return result;
	}
	
	@GetMapping("/{id}")
	private Pix getPix(@PathVariable Long id) {
		return pixRepo.findById(id).get();
	}

	@GetMapping
	private List<Pix> getPix() {
		return pixRepo.findAll();
	}
}
