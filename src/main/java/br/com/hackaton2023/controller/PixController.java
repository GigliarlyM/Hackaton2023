package br.com.hackaton2023.controller;

import br.com.hackaton2023.model.Pix;
import br.com.hackaton2023.model.Usuario;
import br.com.hackaton2023.repository.PixRepository;
import br.com.hackaton2023.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pix/chave")
public class PixController {

	@Autowired
	private PixRepository pixRepo;
	@Autowired
	private UsuarioRepository usuarioRepo;

	private static Logger logger = LoggerFactory.getLogger(PixController.class);

	@GetMapping
	private List<Pix> getPix() {
		return pixRepo.findAll();
	}

	@PostMapping
	public Pix inserirChavePix(@RequestParam String chavePix, Long usuarioId) {

		Usuario usuario = usuarioRepo.findById(usuarioId).get();
		Pix pix = new Pix(chavePix, usuario);

		Pix result = pixRepo.save(pix);

		return result;
	}

	@PutMapping("/{id}")
	public Pix atualizarChavePix(@PathVariable Long id, @RequestParam String chavePix) {
		Pix pix = pixRepo.findById(id).get();
		if (pix != null) {
			pix.setChavePix(chavePix);
			pixRepo.save(pix);	
		}
		return pix;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getPix(@PathVariable Long id) {
		ResponseEntity<?> responseEntity;
		Pix pix = pixRepo.findById(id).orElse(null);

		if (pix != null) {
			responseEntity = ResponseEntity.ok(pix);
		} else {
			responseEntity = ResponseEntity.notFound().build();
		}

		return responseEntity;
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePix(@PathVariable Long id) {
		ResponseEntity<?> responseEntity;

		Pix pix = pixRepo.findById(id).orElse(null);
		if (pix != null) {
			pixRepo.delete(pix);
			responseEntity = ResponseEntity.ok("Deletado com sucesso!"); // Retorna 204
		} else {
			responseEntity = ResponseEntity.notFound().build(); // Retorna 404
		}

		return responseEntity;
	}

}
