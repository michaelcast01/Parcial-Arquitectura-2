package com.example.parcial.repositorios;
import com.example.parcial.modelos.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidoRepositorio extends JpaRepository<Partido, Integer> {

    @Query(value = """
        SELECT SUM(
            CASE 
                WHEN equipo_local = :id THEN goles_local
                WHEN equipo_visita = :id THEN goles_visita
                ELSE 0
            END
        )
        FROM partido
        WHERE equipo_local = :id OR equipo_visita = :id
    """, nativeQuery = true)
    Integer totalGolesPorEquipo(@Param("id") Integer idEquipo);

    @Query(value = """
        SELECT p.id_partido, p.fecha, el.nombre AS equipo_local, ev.nombre AS equipo_visita,
               p.goles_local, p.goles_visita
        FROM partido p
        JOIN equipo el ON p.equipo_local = el.id_equipo
        JOIN equipo ev ON p.equipo_visita = ev.id_equipo
    """, nativeQuery = true)
    List<Object[]> obtenerResultadosPartidos();
}
