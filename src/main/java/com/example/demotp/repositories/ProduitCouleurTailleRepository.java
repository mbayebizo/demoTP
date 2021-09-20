package com.example.demotp.repositories;

import com.example.demotp.models.ProduitCouleurTaille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitCouleurTailleRepository extends JpaRepository<ProduitCouleurTaille, Long> {
}