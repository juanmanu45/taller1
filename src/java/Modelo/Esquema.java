/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Labing I5
 */
public class Esquema {
   private int id;
   private char[] nombre;
    private int numTablas;

    public Esquema() {
    }
    
    
    public Esquema(int id, char[] nombre, int numTablas) {
        this.id = id;
        this.nombre = nombre;
        this.numTablas = numTablas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char[] getNombre() {
        return nombre;
    }

    public void setNombre(char[] nombre) {
        this.nombre = nombre;
    }

    public int getNumTablas() {
        return numTablas;
    }

    public void setNumTablas(int numTablas) {
        this.numTablas = numTablas;
    }
    


} 