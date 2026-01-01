package com.example.TP8.Spring.RestController.repositories;

import com.example.TP8.Spring.RestController.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}

