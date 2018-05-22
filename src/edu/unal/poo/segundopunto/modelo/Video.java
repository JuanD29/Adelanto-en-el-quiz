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
public abstract class Video {
    protected String titulo;
    protected String nombreDirector;
    protected int annioVideo;

    public Video(String titulo, String nombreDirector, int annioVideo) {
        this.titulo = titulo;
        this.nombreDirector = nombreDirector;
        this.annioVideo = annioVideo;
    }
    
    public void mostrarInfoVideo(){
            
        }
}
