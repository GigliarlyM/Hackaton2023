package br.com.hackaton2023.SistemaPix.controller;

import br.com.hackaton2023.SistemaPix.model.Usuario;
import br.com.hackaton2023.SistemaPix.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {
	
	@Autowired
	private UsuarioService clienteService;
	
	@PostMapping
	public ResponseEntity<String> inserir(@RequestBody Usuario usuario) {
		clienteService.inserir(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body("Criada com sucesso!!");
	}

	/*
	 * @GetMapping public ResponseEntity<Iterable<Usuario>> buscarTodos() { return
	 * ResponseEntity.ok(clienteService.buscarTodos()); }
	 * 
	 * @GetMapping("/{id}") public ResponseEntity<Usuario> buscarPorId(@PathVariable
	 * Integer id) { return ResponseEntity.ok(clienteService.buscarPorId(id)); }
	 * 
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<Void> deletar(@PathVariable
	 * Integer id) { clienteService.deletar(id); return ResponseEntity.ok().build();
	 * }
	 */

}
