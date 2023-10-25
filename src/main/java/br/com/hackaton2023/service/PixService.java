package br.com.hackaton2023.service;


import br.com.hackaton2023.repository.PixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PixService {
    @Autowired
    private PixRepository pixRepository;
}
