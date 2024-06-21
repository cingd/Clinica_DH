package com.example.clinica_odontologica.service;

import com.example.clinica_odontologica.Turno;
import com.example.clinica_odontologica.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoServiceImpl implements TurnoService {

    private final TurnoRepository turnoRepository;

    @Autowired
    public TurnoServiceImpl(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    @Override
    public Turno guardar(Turno turno) {
        return turnoRepository.save(turno);
    }

    @Override
    public List<com.example.clinica_odontologica.model.Turno> listarTodos() {
        return turnoRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        turnoRepository.deleteById(id);
    }
}

