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
    private String nombre;
    private int numTablas;

    public int getNumTablas() {
        return numTablas;
    }

    public void setNumTablas(int numTablas) {
        this.numTablas = numTablas;
    }

   

    public Esquema(int id, String nombre, int numTablas) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
