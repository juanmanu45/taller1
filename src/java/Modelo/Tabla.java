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
public class Tabla {
    
    private int idt;
    private int idEs;
    private String nombre;

    public Tabla(int idt, int idEs, String nombre) {
        this.idt = idt;
        this.idEs = idEs;
        this.nombre = nombre;
    }

    public int getIdt() {
        return idt;
    }

    public void setIdt(int idt) {
        this.idt = idt;
    }

    public int getIdEs() {
        return idEs;
    }

    public void setIdEs(int idEs) {
        this.idEs = idEs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
