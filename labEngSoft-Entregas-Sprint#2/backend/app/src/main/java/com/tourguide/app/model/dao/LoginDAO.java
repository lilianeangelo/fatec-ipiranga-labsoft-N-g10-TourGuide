package com.tourguide.app.model.dao;

import java.util.List;
import java.util.Optional;

import com.tourguide.app.model.Login;

public interface LoginDAO {
    List<Login> findAll();
    Optional<Login> findById(Long id);
    Login save(Login login);
    void deleteById(Long id);
}
