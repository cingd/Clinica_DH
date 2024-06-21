package com.example.clinica_odontologica.service;

import com.example.clinica_odontologica.Turno;
import java.util.List;

public interface TurnoService {
    Turno guardar(Turno turno);
    List<com.example.clinica_odontologica.model.Turno> listarTodos();
    void eliminar(Long id);
}
