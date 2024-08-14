package com.tourguide.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourguide.app.model.Login;


public interface LoginRepository extends JpaRepository<Login, Integer> {

    Optional<Login> findById(Long id);

    void deleteById(Long id);
}
