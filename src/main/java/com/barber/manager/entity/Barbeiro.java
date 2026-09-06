package com.barber.manager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "barbeiros")
@Data // Isso aqui é o Lombok que você adicionou, ele gera getters/setters em tempo de compilação
public class Barbeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true)
    private String email;

    private String especialidade;
}