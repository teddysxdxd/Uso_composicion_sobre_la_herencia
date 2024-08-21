/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicionsobreherencia;

/**
 *
 * @author USUARIO
 */
public class Computadora {
    String modelo;
    String serie;
    String tipo;

    public Computadora(String modelo, String serie, String tipo) {
        this.modelo = modelo;
        this.serie = serie;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Computadora() {
    }
    
}
