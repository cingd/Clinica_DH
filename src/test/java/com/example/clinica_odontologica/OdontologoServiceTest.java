package com.example.clinica_odontologica;

import com.example.clinica_odontologica.model.Odontologo;
import com.example.clinica_odontologica.service.OdontologoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class OdontologoServiceTest {

    @Autowired
    private OdontologoService odontologoService;

    @Test
    public void testGuardarYListarOdontologos() {
        // Crear dos objetos Odontologo
        Odontologo odontologo1 = new Odontologo();
        odontologo1.setNumeroMatricula("12345");
        odontologo1.setNombre("Juan");
        odontologo1.setApellido("Perez");

        Odontologo odontologo2 = new Odontologo();
        odontologo2.setNumeroMatricula("67890");
        odontologo2.setNombre("Maria");
        odontologo2.setApellido("Gomez");

        // Guardar los objetos odontologo en la base de datos
        odontologoService.guardar(odontologo1);
        odontologoService.guardar(odontologo2);

        // Listar todos los odontólogos guardados
        List<Odontologo> odontologos = odontologoService.listarTodos();

        // Verificar que hay dos odontólogos en la lista
        assertEquals(2, odontologos.size());
        assertEquals("Juan", odontologos.get(0).getNombre());
        assertEquals("Maria", odontologos.get(1).getNombre());
    }
}
