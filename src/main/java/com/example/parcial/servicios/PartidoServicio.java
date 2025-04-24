package com.example.parcial.servicios;
import com.example.parcial.modelos.Partido;
import com.example.parcial.repositorios.PartidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoServicio {

    @Autowired
    private PartidoRepositorio repositorio;

    public List<Partido> obtenerTodos() {
        return repositorio.findAll();
    }

    public Integer totalGolesPorEquipo(Integer idEquipo) {
        return repositorio.totalGolesPorEquipo(idEquipo);
    }

    public List<Object[]> obtenerResultados() {
        return repositorio.obtenerResultadosPartidos();
    }
}
