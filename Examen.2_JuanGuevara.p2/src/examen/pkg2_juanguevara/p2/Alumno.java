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
public class Alumno implements Serializable{
    public String apodo;
    public String NmoCuenta;
    public int edad;
    public int resistencia;
    public String GradAcademico;
    public String arma;
    public int poder;

    private static final long SerialVersionUID = 888L;
    public Alumno() {
    }

    public Alumno(String apodo, String NmoCuenta, int edad, int resistencia, String GradAcademico, String arma, int poder) {
        this.apodo = apodo;
        this.NmoCuenta = NmoCuenta;
        this.edad = edad;
        this.resistencia = resistencia;
        this.GradAcademico = GradAcademico;
        this.arma = arma;
        this.poder = poder;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNmoCuenta() {
        return NmoCuenta;
    }

    public void setNmoCuenta(String NmoCuenta) {
        this.NmoCuenta = NmoCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getGradAcademico() {
        return GradAcademico;
    }

    public void setGradAcademico(String GradAcademico) {
        this.GradAcademico = GradAcademico;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return apodo;
    }
    
}
