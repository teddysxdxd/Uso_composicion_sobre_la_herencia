/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicionsobreherencia;

/**
 *
 * @author USUARIO
 */
public class Telefono {
    String color;
    String tipoPantalla;
    String tipoPuerto;

    public Telefono(String color, String tipoPantalla, String tipoPuerto) {
        this.color = color;
        this.tipoPantalla = tipoPantalla;
        this.tipoPuerto = tipoPuerto;
    }

    public Telefono() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getTipoPuerto() {
        return tipoPuerto;
    }

    public void setTipoPuerto(String tipoPuerto) {
        this.tipoPuerto = tipoPuerto;
    }
    
}
