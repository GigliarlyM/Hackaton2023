package br.com.hackaton2023.service;

import br.com.hackaton2023.model.TransacaoPix;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TransacaoService {
    public List<TransacaoPix> filtrarUsuario(Long usuarioId);
}
