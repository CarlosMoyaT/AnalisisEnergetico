package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Entity
public class Consumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuarioId;
    private LocalDate fecha;
    private double consumoKWh;
    private double precioKWh;
    private String tipoUsuario;

    public Consumo() {

    }

    public Consumo(Long id, String usuarioId, LocalDate fecha, double consumoKWh, double precioKWh, String tipoUsuario) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.fecha = fecha;
        this.consumoKWh = consumoKWh;
        this.precioKWh = precioKWh;
        this.tipoUsuario = tipoUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getConsumoKWh() {
        return consumoKWh;
    }

    public void setConsumoKWh(double consumoKWh) {
        this.consumoKWh = consumoKWh;
    }

    public double getPrecioKWh() {
        return precioKWh;
    }

    public void setPrecioKWh(double precioKWh) {
        this.precioKWh = precioKWh;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
   // 2.	Métodos de Filtro: Crear métodos en una clase AnalizadorConsumo que filtren por umbral de consumo
    // (filtrarPorConsumo(double umbral)) o por tipo de usuario (filtrarPorTipo(String tipo)).

    @Override
    public String toString() {
        return "Consummo{" +
                "id=" + id +
                ", usuarioId='" + usuarioId + '\'' +
                ", fecha=" + fecha +
                ", consumoKWh=" + consumoKWh +
                ", precioKWh=" + precioKWh +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }

}
