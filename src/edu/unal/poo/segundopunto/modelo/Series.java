/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.segundopunto.modelo;

/**
 *
 * @author Estudiante
 */
public class Series extends Video {
    private int numeroCapitulos;
    private String temporada;

    public Series(int numeroCapitulos, String temporada, String titulo, String nombreDirector, int annioVideo) {
        super(titulo, nombreDirector, annioVideo);
        this.numeroCapitulos = numeroCapitulos;
        this.temporada = temporada;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    
    
    
}
