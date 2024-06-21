package com.example.clinica_odontologica.service;

import com.example.clinica_odontologica.model.Odontologo;

import java.util.List;

public interface OdontologoService {
    Odontologo guardar(Odontologo odontologo);
    List<Odontologo> listarTodos();
    Odontologo modificar(Odontologo odontologo);
    void eliminar(Long id);
}
