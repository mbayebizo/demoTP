package com.example.demotp.repositories;

import com.example.demotp.models.Couleur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouleurRepository extends JpaRepository<Couleur, Long> {
}