package com.example.parcial.servicios;
import com.example.parcial.modelos.Entrenador;
import com.example.parcial.repositorios.EntrenadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntrenadorServicio {

    @Autowired
    private EntrenadorRepositorio repositorio;

    public List<Entrenador> obtenerTodos() {
        return repositorio.findAll();
    }

    public Entrenador guardar(Entrenador entrenador) {
        return repositorio.save(entrenador);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}
