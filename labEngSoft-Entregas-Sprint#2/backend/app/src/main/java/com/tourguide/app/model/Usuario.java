package com.tourguide.app.model;

import lombok.Data;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nome;
    private int idade;
    private String numeroDocumento;
    private String genero;
    private String telefone;
    private String endereco;
    private String perfil;
    private boolean permissao;
}

