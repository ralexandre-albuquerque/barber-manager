package com.barber.manager.controller;

import com.barber.manager.dto.BarbeiroRequest;
import com.barber.manager.entity.Barbeiro;
import com.barber.manager.service.BarbeiroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/barbeiros")
public class BarbeiroController {

    @Autowired
    private BarbeiroService service;

    @PostMapping
    public Barbeiro criar(@Valid @RequestBody BarbeiroRequest request) {
        // Conversão de DTO para Entity
        Barbeiro barbeiro = new Barbeiro();
        barbeiro.setNome(request.nome());
        barbeiro.setEmail(request.email());
        barbeiro.setEspecialidade(request.especialidade());

        return service.salvar(barbeiro);
    }

    @GetMapping
    public List<Barbeiro> listar() {
        return service.listarTodos();
    }
}