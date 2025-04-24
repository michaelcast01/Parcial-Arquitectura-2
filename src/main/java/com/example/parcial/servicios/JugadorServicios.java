package com.example.parcial.servicios;

import com.example.parcial.modelos.Jugador;
import com.example.parcial.repositorios.JugadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JugadorServicios {

    @Autowired
    private JugadorRepositorio repositorio;

    public List<Jugador> obtenerTodos() {
        return repositorio.findAll();
    }

    public List<Jugador> obtenerPorEquipo(Integer idEquipo) {
        return repositorio.buscarPorEquipo(idEquipo);
    }

    public Jugador guardar(Jugador jugador) {
        return repositorio.save(jugador);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }

    public List<Jugador> obtenerConMasGoles(int goles) {
        return repositorio.jugadoresConMasDeXGoles(goles);
    }
}