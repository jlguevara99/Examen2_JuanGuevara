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
public class Aleman implements Serializable{
    public String alias;
    public int edad;
    public String casta;
    public int resistencia;
    public String arma;
    public int poder;

    private static final long SerialVersionUID = 777L;
    public Aleman() {
    }

    public Aleman(String alias, int edad, String casta, int resistencia, String arma, int poder) {
        this.alias = alias;
        this.edad = edad;
        this.casta = casta;
        this.resistencia = resistencia;
        this.arma = arma;
        this.poder = poder;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
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

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return alias;
    }
    
}
