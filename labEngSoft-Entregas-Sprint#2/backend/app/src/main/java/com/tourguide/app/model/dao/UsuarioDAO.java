package com.tourguide.app.model.dao;

import java.util.List;
import java.util.Optional;

import com.tourguide.app.model.Usuario;

public interface UsuarioDAO {
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario save(Usuario usuario);
    void deleteById(Long id);
}
