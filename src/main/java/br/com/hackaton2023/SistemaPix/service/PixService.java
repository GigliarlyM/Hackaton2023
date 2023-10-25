package br.com.hackaton2023.SistemaPix.service;

import br.com.hackaton2023.SistemaPix.model.Pix;
import br.com.hackaton2023.SistemaPix.repository.PixRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PixService {
	
	@Autowired
	private PixRepository pixRepo;
	
	public Iterable<Pix> findAll(){
		return pixRepo.findAll();
	}
	
	public void savePix(Pix pix) {
		pixRepo.save(pix);
	}
	
	public Pix findPix(int id) {
		return pixRepo.findById(id).get();
	}

}
