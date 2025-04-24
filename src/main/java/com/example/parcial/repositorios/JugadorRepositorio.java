package com.example.parcial.repositorios;
import com.example.parcial.modelos.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepositorio extends JpaRepository<Jugador, Integer> {

    @Query(value = "SELECT * FROM jugador WHERE id_equipo = :id", nativeQuery = true)
    List<Jugador> buscarPorEquipo(@Param("id") Integer id);

    @Query(value = """
        SELECT j.* FROM jugador j
        JOIN estadistica_jugador e ON j.id_jugador = e.id_jugador
        GROUP BY j.id_jugador
        HAVING SUM(e.goles) > :goles
    """, nativeQuery = true)
    List<Jugador> jugadoresConMasDeXGoles(@Param("goles") Integer goles);
}
