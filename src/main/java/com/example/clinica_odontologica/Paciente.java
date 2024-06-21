package com.example.clinica_odontologica;

import javax.persistence.*;
import java.time.LocalDate;

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String dni;
    private LocalDate fechaAlta;

}

