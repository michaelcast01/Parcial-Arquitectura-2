package com.example.parcial.controladores;

import com.example.parcial.modelos.Jugador;
import com.example.parcial.servicios.JugadorServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorControlador {

    @Autowired
    private JugadorServicios servicio;

    // 🔹 Obtener todos los jugadores
    @GetMapping
    public List<Jugador> obtenerTodos() {
        return servicio.obtenerTodos();
    }

    // 🔹 Obtener jugadores de un equipo específico (consulta nativa)
    @GetMapping("/equipo/{id}")
    public List<Jugador> obtenerPorEquipo(@PathVariable Integer id) {
        return servicio.obtenerPorEquipo(id);
    }

    // 🔹 Obtener jugadores con más de X goles (consulta nativa)
    @GetMapping("/goles")
    public List<Jugador> obtenerConMasGoles(@RequestParam Integer min) {
        return servicio.obtenerConMasGoles(min);
    }

    // 🔹 Crear jugador (lo que falló en Postman)
    @PostMapping
    public Jugador crearJugador(@RequestBody Jugador jugador) {
        return servicio.guardar(jugador);
    }

    // 🔹 Actualizar jugador
    @PutMapping
    public Jugador actualizarJugador(@RequestBody Jugador jugador) {
        return servicio.guardar(jugador);
    }

    // 🔹 Eliminar jugador por ID
    @DeleteMapping("/{id}")
    public void eliminarJugador(@PathVariable Integer id) {
        servicio.eliminar(id);
    }
}
