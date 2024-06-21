// Turno.java
package com.example.clinica_odontologica.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Turno extends com.example.clinica_odontologica.Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Odontologo odontologo;

    @ManyToOne
    private Paciente paciente;

    private LocalDateTime fechaHora;

}
