package br.com.hackaton2023.SistemaPix.repository;

import br.com.hackaton2023.SistemaPix.model.Pix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PixRepository extends JpaRepository<Pix, Integer> {

}
