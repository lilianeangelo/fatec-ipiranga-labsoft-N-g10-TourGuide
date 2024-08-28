package com.tourguide.app.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tourguide.app.model.Login;
import com.tourguide.app.model.dao.LoginDAO;
import com.tourguide.app.repository.LoginRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class LoginDAOImpl implements LoginDAO {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public List<Login> findAll() {
        return loginRepository.findAll();
    }

    @Override
    public Optional<Login> findById(Long id) {
        return loginRepository.findById(id);
    }

    @Override
    public Login save(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public void deleteById(Long id) {
        loginRepository.deleteById(id);
    }
}
