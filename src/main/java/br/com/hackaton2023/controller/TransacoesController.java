package br.com.hackaton2023.controller;

import java.util.List;

import br.com.hackaton2023.service.TransacaoService;
import br.com.hackaton2023.service.impl.TransacaoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.hackaton2023.model.TransacaoPix;
import br.com.hackaton2023.model.Usuario;
import br.com.hackaton2023.repository.TransacaoPixRepository;
import br.com.hackaton2023.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/pix/transacoes")
public class TransacoesController {

    @Autowired
    private TransacaoPixRepository transacaoPixRepo;
    @Autowired
    private UsuarioRepository usuarioRepo;
    private TransacaoService transacaoService;

    private static Logger logger = LoggerFactory.getLogger(TransacoesController.class);

    @PostMapping("/pagamento")
    public ResponseEntity<?> iniciarTransacaoDePagamento(@RequestParam Long remetenteId, Long destinatarioId, Double valor) {
        Usuario remetente = usuarioRepo.findById(remetenteId).get();
        Usuario destinatario = usuarioRepo.findById(destinatarioId).get();

        if (remetente == null || destinatario == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Remetente ou destinatário não encontrado");
        }

        TransacaoPix transacao = new TransacaoPix(remetente, destinatario, valor);
        TransacaoPix result = transacaoPixRepo.save(transacao);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PostMapping("/transferencia")
    public ResponseEntity<?> iniciarTransacaoDeTransferencia(@RequestParam Long remetenteId, Long destinatarioId, Double valor) {
        Usuario remetente = usuarioRepo.findById(remetenteId).orElse(null);
        Usuario destinatario = usuarioRepo.findById(destinatarioId).orElse(null);

        if (remetente == null || destinatario == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Remetente ou destinatário não encontrado");
        }

        TransacaoPix transacao = new TransacaoPix(remetente, destinatario, valor);
        TransacaoPix result = transacaoPixRepo.save(transacao);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTransacao(@PathVariable Long id) {
        TransacaoPix transacao = transacaoPixRepo.findById(id).orElse(null);

        if (transacao == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Transação não encontrada");
        }

        return ResponseEntity.status(HttpStatus.OK).body(transacao);
    }

    @GetMapping("/historico/{usuarioId}")
    public ResponseEntity<?> getHistoricoTransacoes(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioRepo.findById(usuarioId).orElse(null);

        if (usuario == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado");
        }
//        List<TransacaoPix> historico = transacaoPixRepo.findAll();
        List<TransacaoPix> historicoFiltrado = transacaoService.filtrarUsuario(usuarioId);

        return ResponseEntity.status(HttpStatus.OK).body(historicoFiltrado);
    }

    @GetMapping("/status/{id}")
    public ResponseEntity<?> getStatusTransacao(@PathVariable Long id) {
        TransacaoPix transacao = transacaoPixRepo.findById(id).orElse(null);

        if (transacao == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Transação não encontrada");
        }

        return ResponseEntity.status(HttpStatus.OK).body(transacao.getStatus());
    }

}
