package com.barber.manager.service;

import com.barber.manager.entity.Barbeiro;
import com.barber.manager.repository.BarbeiroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarbeiroService {

    private final BarbeiroRepository repository;

    public BarbeiroService(BarbeiroRepository repository) {
        this.repository = repository;
    }

    public Barbeiro salvar(Barbeiro barbeiro) {
        return repository.save(barbeiro);
    }

    public List<Barbeiro> listarTodos() {
        return repository.findAll();
    }
}