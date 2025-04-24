package com.example.parcial.controladores;
import com.example.parcial.modelos.Partido;
import com.example.parcial.servicios.PartidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoControlador {

    @Autowired
    private PartidoServicio servicio;

    @GetMapping
    public List<Partido> obtenerTodos() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/goles/{idEquipo}")
    public Integer totalGolesPorEquipo(@PathVariable Integer idEquipo) {
        return servicio.totalGolesPorEquipo(idEquipo);
    }

    @GetMapping("/resultados")
    public List<Object[]> obtenerResultados() {
        return servicio.obtenerResultados();
    }
}