package br.com.hackaton2023.repository;

import br.com.hackaton2023.model.Pix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PixRepository extends JpaRepository<Pix, Long> {

}
