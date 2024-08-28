package com.tourguide.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourguide.app.model.Usuario;
import com.tourguide.app.model.dao.UsuarioDAO;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    public List<Usuario> getAllUsuarios() {
        return usuarioDAO.findAll();
    }

    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioDAO.findById(id);
    }

    @Transactional
    public Usuario createUsuario(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    @Transactional
    public Usuario updateUsuario(Long id, Usuario usuario) {
        if (usuarioDAO.findById(id).isPresent()) {
            usuario.setIdUsuario(id);
            return usuarioDAO.save(usuario);
        }
        throw new IllegalArgumentException("Usuário não encontrado.");
    }

    @Transactional
    public void deleteUsuario(Long id) {
        usuarioDAO.deleteById(id);
    }
}
