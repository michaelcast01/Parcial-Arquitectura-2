package com.example.parcial.modelos;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Partido {

    @Id
    private Integer id_partido;

    private LocalDate fecha;
    private String estadio;

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visita")
    private Equipo equipoVisita;

    private Integer goles_local;
    private Integer goles_visita;

    @OneToMany(mappedBy = "partido")
    private List<EstadisticaJugador> estadisticas;

    public Integer getId_partido() {
        return id_partido;
    }

    public void setId_partido(Integer id_partido) {
        this.id_partido = id_partido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisita() {
        return equipoVisita;
    }

    public void setEquipoVisita(Equipo equipoVisita) {
        this.equipoVisita = equipoVisita;
    }

    public Integer getGoles_local() {
        return goles_local;
    }

    public void setGoles_local(Integer goles_local) {
        this.goles_local = goles_local;
    }

    public Integer getGoles_visita() {
        return goles_visita;
    }

    public void setGoles_visita(Integer goles_visita) {
        this.goles_visita = goles_visita;
    }

    public List<EstadisticaJugador> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<EstadisticaJugador> estadisticas) {
        this.estadisticas = estadisticas;
    }
}
