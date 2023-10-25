package br.com.hackaton2023.service.impl;

import br.com.hackaton2023.model.TransacaoPix;
import br.com.hackaton2023.repository.TransacaoPixRepository;
import br.com.hackaton2023.repository.UsuarioRepository;
import br.com.hackaton2023.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TransacaoServiceImpl implements TransacaoService {

    @Autowired
    private TransacaoPixRepository transacaoPixRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<TransacaoPix> filtrarUsuario(Long usuarioId) {
        List<TransacaoPix> filtrados = null;

        if (usuarioRepository.findById(usuarioId) != null) {
            filtrados = new ArrayList<>();

            for (TransacaoPix transacao : transacaoPixRepository.findAll()) {
                if (transacao.equals(usuarioId)) {
                    filtrados.add(transacao);
                }
            }

        }

        return filtrados;
    }

}
