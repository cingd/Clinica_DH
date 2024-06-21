package com.example.clinica_odontologica.controller;


import com.example.clinica_odontologica.model.Odontologo;
import com.example.clinica_odontologica.model.Paciente;
import com.example.clinica_odontologica.model.Turno;
import com.example.clinica_odontologica.service.OdontologoService;
import com.example.clinica_odontologica.service.PacienteService;
import com.example.clinica_odontologica.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clinica")
public class OdontologoController {

    @Autowired
    private OdontologoService odontologoService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private TurnoService turnoService;

    @GetMapping("/inicio")
    public String mostrarInicio() {
        return "inicio";
    }

    @GetMapping("/odontologos")
    public String mostrarOdontologos(Model model) {
        List<Odontologo> odontologos = odontologoService.listarTodos();
        model.addAttribute("odontologos", odontologos);
        return "odontologos";
    }

    @PostMapping("/odontologos/agregar")
    public String agregarOdontologo(Odontologo odontologo) {
        odontologoService.guardar(odontologo);
        return "redirect:/clinica/odontologos";
    }

    @GetMapping("/odontologos/eliminar/{id}")
    public String eliminarOdontologo(@PathVariable Long id) {
        odontologoService.eliminar(id);
        return "redirect:/clinica/odontologos";
    }

    @GetMapping("/pacientes")
    public String mostrarPacientes(Model model) {
        List<com.example.clinica_odontologica.Paciente> pacientes = pacienteService.listarTodos();
        model.addAttribute("pacientes", pacientes);
        return "pacientes";
    }

    @PostMapping("/pacientes/agregar")
    public String agregarPaciente(Paciente paciente) {
        pacienteService.guardar(paciente);
        return "redirect:/clinica/pacientes";
    }

    @GetMapping("/pacientes/eliminar/{id}")
    public String eliminarPaciente(@PathVariable Long id) {
        pacienteService.eliminar(id);
        return "redirect:/clinica/pacientes";
    }

    @GetMapping("/turnos")
    public String mostrarTurnos(Model model) {
        List<Turno> turnos = turnoService.listarTodos();
        model.addAttribute("turnos", turnos);
        return "turnos";
    }

    @PostMapping("/turnos/agregar")
    public String agregarTurno(Turno turno) {
        turnoService.guardar(turno);
        return "redirect:/clinica/turnos";
    }

    @GetMapping("/turnos/eliminar/{id}")
    public String eliminarTurno(@PathVariable Long id) {
        turnoService.eliminar(id);
        return "redirect:/clinica/turnos";
    }
}
