/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan Manuel
 */
public class Tablas {

    RandomAccessFile tablas;

    public Tablas() throws FileNotFoundException {

        tablas = new RandomAccessFile("tablas.txt", "rw");
    }
    
    public void insertarTabla(){
        
    }

}
