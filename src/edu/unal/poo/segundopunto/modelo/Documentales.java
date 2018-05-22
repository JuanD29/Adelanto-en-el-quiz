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
public class Documentales extends Video{
    private String genero;

    public Documentales(String genero, String titulo, String nombreDirector, int annioVideo) {
        super(titulo, nombreDirector, annioVideo);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
