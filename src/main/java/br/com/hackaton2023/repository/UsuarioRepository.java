package br.com.hackaton2023.repository;

import br.com.hackaton2023.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
