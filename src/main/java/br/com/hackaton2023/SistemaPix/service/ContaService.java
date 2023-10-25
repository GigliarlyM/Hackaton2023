package br.com.hackaton2023.SistemaPix.service;

import br.com.hackaton2023.SistemaPix.model.Usuario;
import br.com.hackaton2023.SistemaPix.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ContaService {
	@Autowired
	private UsuarioRepository userRepository;
//	@Autowired
//	private ContaRepository repository;
	
	// 1000 / 400 / 900
	public String transferencia(Usuario p1, Usuario p2, Double dinheiroTransferido) {
		Double saldoDoP1 = p1.getPix().getSaldo();
		Double saldoDoP2 = p2.getPix().getSaldo();
		
		if(saldoDoP1 >= dinheiroTransferido) {
			p1.getPix().setSaldo(saldoDoP1 - dinheiroTransferido);
			p2.getPix().setSaldo(saldoDoP2 + dinheiroTransferido);
			atualizarSaldo(p1.getId());
			atualizarSaldo(p2.getId());
			return "Transferência concluída!";
		}
		
		return "Saldo Insuficiente!";
	}
	public void atualizarSaldo(Integer id) {
		Usuario usuario = userRepository.findById(id).get();
		userRepository.save(usuario);
		
	}
	
}