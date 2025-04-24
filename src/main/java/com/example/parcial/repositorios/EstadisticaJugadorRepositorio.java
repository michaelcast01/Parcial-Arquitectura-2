package com.example.parcial.repositorios;
import com.example.parcial.modelos.EstadisticaJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadisticaJugadorRepositorio extends JpaRepository<EstadisticaJugador, Integer> {
}
