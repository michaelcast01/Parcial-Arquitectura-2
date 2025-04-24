package com.example.parcial.servicios;

import com.example.parcial.modelos.Equipo;
import com.example.parcial.repositorios.EquipoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquipoServicio {

    @Autowired
    private EquipoRepositorio repositorio;

    public List<Equipo> obtenerTodos() {
        return repositorio.findAll();
    }

    public Equipo obtenerPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public Equipo guardar(Equipo equipo) {
        return repositorio.save(equipo);
    }


    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}