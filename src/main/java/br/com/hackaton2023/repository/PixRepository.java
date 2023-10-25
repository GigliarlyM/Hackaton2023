package br.com.hackaton2023.repository;

import br.com.hackaton2023.model.Pix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PixRepository extends CrudRepository<Pix, Long> {

}
