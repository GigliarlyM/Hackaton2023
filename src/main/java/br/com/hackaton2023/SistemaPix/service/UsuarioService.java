package br.com.hackaton2023.SistemaPix.service;

import br.com.hackaton2023.SistemaPix.model.Usuario;
import br.com.hackaton2023.SistemaPix.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioService {
	@Autowired
	private UsuarioRepository userRepository;
//	@Autowired
//	private ContaRepository contaRepository;
	
	public Iterable<Usuario> buscarTodos(){
		return userRepository.findAll();
	}

	public Usuario buscarPorId(Integer id) {
		return userRepository.findById(id).get();
	}

	public Usuario inserir(Usuario user) {
		return userRepository.save(user);
	}

	public void deletar(Integer id) {
		userRepository.deleteById(id);
	}
}