package com.example.parcial.controladores;
import com.example.parcial.modelos.EstadisticaJugador;
import com.example.parcial.servicios.EstadisticaJugadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
public class EstadisticaJugadorControlador {

    @Autowired
    private EstadisticaJugadorServicio servicio;

    @GetMapping
    public List<EstadisticaJugador> obtenerTodas() {
        return servicio.obtenerTodas();
    }

    @PostMapping
    public EstadisticaJugador guardar(@RequestBody EstadisticaJugador estadistica) {
        return servicio.guardar(estadistica);
    }
}