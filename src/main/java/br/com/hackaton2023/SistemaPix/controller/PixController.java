package br.com.hackaton2023.SistemaPix.controller;

import br.com.hackaton2023.SistemaPix.model.Pix;
import br.com.hackaton2023.SistemaPix.service.PixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pix/chaves")
public class PixController {
	
	@Autowired
	private PixService pixService;
	
	@PostMapping
	public ResponseEntity<String> inserirChavePix(@RequestBody Pix pix){
		pixService.savePix(pix);
		return ResponseEntity.status(HttpStatus.CREATED).body("Chave Pix registrada com sucesso ! ");
	}
	
	@GetMapping("/{id}")
	private Pix getPix(@PathVariable int id) {
		return pixService.findPix(id);
	}
}
