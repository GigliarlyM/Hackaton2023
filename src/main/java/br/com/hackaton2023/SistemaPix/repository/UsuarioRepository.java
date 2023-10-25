package br.com.hackaton2023.SistemaPix.repository;

import br.com.hackaton2023.SistemaPix.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
