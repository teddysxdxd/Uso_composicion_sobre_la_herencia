/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicionsobreherencia;

/**
 *
 * @author USUARIO
 */
public class Procesador {
    String serie;
    Integer Puntosantutu;
    String arquitectura;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getPuntosantutu() {
        return Puntosantutu;
    }

    public void setPuntosantutu(Integer Puntosantutu) {
        this.Puntosantutu = Puntosantutu;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public Procesador(String serie, Integer Puntosantutu, String arquitectura) {
        this.serie = serie;
        this.Puntosantutu = Puntosantutu;
        this.arquitectura = arquitectura;
    }

    public Procesador() {
    }
    
}

