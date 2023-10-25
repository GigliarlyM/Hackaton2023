package br.com.hackaton2023.controller;


import br.com.hackaton2023.model.Instituicao;
import br.com.hackaton2023.model.Pix;
import br.com.hackaton2023.model.Usuario;
import br.com.hackaton2023.repository.InstituicaoRepository;
import br.com.hackaton2023.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pix/autenticacao")
public class AutenticacaoController {

    @Autowired
    private UsuarioRepository usuarioRepo;
    @Autowired
    private InstituicaoRepository instituicaoRepo;

    @PostMapping("/usuario")
    public Usuario autenticarUsuario(@RequestParam String nome, String cpf) {
        Usuario usuario = new Usuario(nome, cpf);
        Usuario result = usuarioRepo.save(usuario);

        return result;
    }

    @PostMapping("/instituicao")
    public Instituicao autenticacaoInstituicao(@RequestParam String nome, String cnpj) {
        Instituicao instituicao = new Instituicao(nome, cnpj);
        Instituicao result = instituicaoRepo.save(instituicao);

        return result;
    }

}
