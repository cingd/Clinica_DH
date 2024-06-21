package com.example.clinica_odontologica;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ClinicaOdontologicaApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        // Verifica que el contexto de la aplicación se carga correctamente
    }

    @Test
    void pruebaEjemplo() {
        // Ejemplo de prueba: verifica que la página principal responda con contenido adecuado
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class))
                .contains("Bienvenido a la clínica odontológica");
    }


}

