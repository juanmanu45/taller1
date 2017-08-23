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

    RandomAccessFile raf;

    public Tablas() throws FileNotFoundException {

        raf = new RandomAccessFile("tablas.txt", "rw");
    }

    public void insertarTabla(int idt, int ids, char[] nombre) throws IOException {

        long tamaño = raf.length();
        raf.seek(tamaño);

        if (nombre.length <= 20) {
            int desN = 20 - nombre.length;

            raf.writeInt(idt);
            for (int i = 0; i < nombre.length; i++) {
                raf.writeChar(nombre[i]);
            }
            long pos1 = raf.getFilePointer();
            raf.seek(desN + pos1);

            raf.writeInt(ids);

        }

    }

    public Tabla leertablas() throws FileNotFoundException, IOException {
        Tabla t = new Tabla();
        raf.seek(0);
        
        t.setIdt(raf.readInt());
        char[] nom = new char[20];
        for (int i = 0; i < 20; i++) {

            nom[i] = raf.readChar();
        }
        t.setNombre(nom);
        t.setIdEs(raf.readInt());

        return t ; 
    }

}
