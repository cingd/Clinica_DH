package com.example.clinica_odontologica;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Odontologo odontologo;
    @ManyToOne
    private Paciente paciente;
    private LocalDateTime fechaHora;

}

