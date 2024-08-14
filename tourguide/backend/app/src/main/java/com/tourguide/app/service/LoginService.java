package com.tourguide.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourguide.app.model.Login;
import com.tourguide.app.model.dao.LoginDAO;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private LoginDAO loginDAO;

    public List<Login> getAllLogins() {
        return loginDAO.findAll();
    }

    public Optional<Login> getLoginById(Long id) {
        return loginDAO.findById(id);
    }

    @Transactional
    public Login createLogin(Login login) {
        return loginDAO.save(login);
    }

    @Transactional
    public Login updateLogin(Long id, Login login) {
        if (loginDAO.findById(id).isPresent()) {
            login.setIdLogin(id);
            return loginDAO.save(login);
        }
        throw new IllegalArgumentException("Login não encontrado.");
    }

    @Transactional
    public void deleteLogin(Long id) {
        loginDAO.deleteById(id);
    }
}
