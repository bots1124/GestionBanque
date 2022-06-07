package com.Banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banque.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
