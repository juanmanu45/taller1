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
public class Columna {
    
    private int foranea ;
    private int idCol;
    private String nombre;

    public Columna(int foranea, int idCol, String nombre) {
        this.foranea = foranea;
        this.idCol = idCol;
        this.nombre = nombre;
    }

    public int getForanea() {
        return foranea;
    }

    public void setForanea(int foranea) {
        this.foranea = foranea;
    }

    public int getIdCol() {
        return idCol;
    }

    public void setIdCol(int idCol) {
        this.idCol = idCol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
