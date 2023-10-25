package br.com.hackaton2023.repository;

import br.com.hackaton2023.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
