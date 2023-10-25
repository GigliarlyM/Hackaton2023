package br.com.hackaton2023.controller;

import br.com.hackaton2023.model.Pix;
import br.com.hackaton2023.repository.PixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pix/chave")
public class PixController {

	@Autowired
	private PixRepository pixRepo;

	@PostMapping
	public ResponseEntity<String> inserirChavePix(@RequestBody Pix pix){
		Pix result = pixRepo.save(pix);
		return ResponseEntity.status(HttpStatus.CREATED).body(result.toString());
	}
	
	@GetMapping("/{id}")
	private Pix getPix(@PathVariable Long id) {
		return pixRepo.findById(id).get();
	}
}
