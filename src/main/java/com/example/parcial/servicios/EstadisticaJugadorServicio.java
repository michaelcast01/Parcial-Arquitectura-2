package com.example.parcial.servicios;
import com.example.parcial.modelos.EstadisticaJugador;
import com.example.parcial.repositorios.EstadisticaJugadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadisticaJugadorServicio {

    @Autowired
    private EstadisticaJugadorRepositorio repositorio;

    public List<EstadisticaJugador> obtenerTodas() {
        return repositorio.findAll();
    }

    public EstadisticaJugador guardar(EstadisticaJugador estadistica) {
        return repositorio.save(estadistica);
    }
}