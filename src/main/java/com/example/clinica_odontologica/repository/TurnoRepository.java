package com.example.clinica_odontologica.repository;

import com.example.clinica_odontologica.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository extends JpaRepository<Turno, Long> {
    // Additional custom queries if any
}
