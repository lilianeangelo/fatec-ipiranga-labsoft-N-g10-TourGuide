package com.tourguide.app.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tourguide.app.model.Usuario;
import com.tourguide.app.model.dao.UsuarioDAO;
import com.tourguide.app.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
