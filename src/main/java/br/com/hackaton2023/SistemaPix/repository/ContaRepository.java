package br.com.hackaton2023.SistemaPix.repository;

import br.com.hackaton2023.SistemaPix.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Integer> {

}
