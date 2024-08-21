/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicionsobreherencia;

/**
 *
 * @author USUARIO
 */
public class Memoria {
    String capacidad;
    String creador;
    String TipoLectura;

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getTipoLectura() {
        return TipoLectura;
    }

    public void setTipoLectura(String TipoLectura) {
        this.TipoLectura = TipoLectura;
    }

    public Memoria(String capacidad, String creador, String TipoLectura) {
        this.capacidad = capacidad;
        this.creador = creador;
        this.TipoLectura = TipoLectura;
    }

    public Memoria() {
    }
    
}
