package com.example.demotp.repositories;

import com.example.demotp.models.Taille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TailleRepository extends JpaRepository<Taille, Long> {
}