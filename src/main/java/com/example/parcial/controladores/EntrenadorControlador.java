package com.example.parcial.controladores;
import com.example.parcial.modelos.Entrenador;
import com.example.parcial.servicios.EntrenadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorControlador {

    @Autowired
    private EntrenadorServicio servicio;

    @GetMapping
    public List<Entrenador> obtenerTodos() {
        return servicio.obtenerTodos();
    }

    @PostMapping
    public Entrenador guardar(@RequestBody Entrenador entrenador) {
        return servicio.guardar(entrenador);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        servicio.eliminar(id);
    }
}
