// PacienteService.java
package com.example.clinica_odontologica.service;

import com.example.clinica_odontologica.model.Paciente;

import java.util.List;

public interface PacienteService {
    Paciente guardar(Paciente paciente);
    List<Paciente> listarTodos();
    Paciente modificar(Paciente paciente);
    void eliminar(Long id);
}


