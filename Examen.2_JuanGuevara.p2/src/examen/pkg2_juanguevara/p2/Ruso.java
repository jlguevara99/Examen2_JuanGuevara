/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_juanguevara.p2;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Ruso implements Serializable{
    public int edad;
    public String ID;
    public String nombre;
    public int resistencia;
    public String arma;
    public String rango;
    public int poder;
    
    private static final long SerialVersionUID = 666L;

    public Ruso() {
    }

    public Ruso(int edad, String ID, String nombre, int resistencia, String arma, String rango, int poder) {
        this.edad = edad;
        this.ID = ID;
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.arma = arma;
        this.rango = rango;
        this.poder = poder;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
