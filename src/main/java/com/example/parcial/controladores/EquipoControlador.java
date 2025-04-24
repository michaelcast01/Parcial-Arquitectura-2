package com.example.parcial.controladores;

import com.example.parcial.modelos.Equipo;
import com.example.parcial.servicios.EquipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoControlador {

    @Autowired
    private EquipoServicio servicio;

    @GetMapping
    public List<Equipo> obtenerTodos() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Equipo obtenerPorId(@PathVariable Integer id) {
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public Equipo guardar(@RequestBody Equipo equipo) {
        return servicio.guardar(equipo);
    }
    @PutMapping
    public Equipo actualizarEquipo(@RequestBody Equipo equipo) {
        return servicio.guardar(equipo);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        servicio.eliminar(id);
    }
}