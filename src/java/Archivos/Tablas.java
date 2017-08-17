/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Modelo.Tabla;
import java.io.FileNotFoundException;
import java.io.IOException;
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

    public void insertarTabla(int idt, int ids, char[] nombre) throws IOException {

        tablas.seek(0);

        tablas.writeInt(ids);
        for (int i = 0; i < nombre.length; i++) {
            tablas.writeChar(nombre[i]);
        }
        tablas.writeInt(idt);

    }

    public Tabla leerTablas() throws IOException {
        
        Tabla t=new Tabla();
         tablas.seek(0);
        t.setIdEs(tablas.readInt());
        ArrayList
        
        for (int i = 0; i < 10; i++) {
            
        }
        t.setNombre(tablas.readChar());
       
         
        return t;

    }

}
