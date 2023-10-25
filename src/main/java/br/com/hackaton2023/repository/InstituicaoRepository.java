package br.com.hackaton2023.repository;

import br.com.hackaton2023.model.Instituicao;
import org.springframework.data.repository.CrudRepository;

public interface InstituicaoRepository extends CrudRepository<Instituicao, Long> {
}
