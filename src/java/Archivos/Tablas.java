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

    public void insertarTabla(int idt, int ids, char[] nombre, int pos) throws IOException {
        
        Apuntadores ap= new Apuntadores();
        if (pos != 0) {
            raf.seek(pos);

            if (nombre.length <= 20) {
                int desN = 20 - nombre.length;

                raf.writeInt(idt);
                for (int i = 0; i < nombre.length; i++) {
                    raf.writeChar(nombre[i]);
                }
                long pos1 = raf.getFilePointer();
                raf.seek(desN + pos1);

                raf.writeInt(ids);
                ap.dejarApu1((int) raf.getFilePointer());

            } else {
                raf.seek(0);
                if (nombre.length <= 20) {
                    int desN = 20 - nombre.length;

                    raf.writeInt(idt);
                    for (int i = 0; i < nombre.length; i++) {
                        raf.writeChar(nombre[i]);
                    }
                    long pos1 = raf.getFilePointer();
                    raf.seek(desN + pos1);

                    raf.writeInt(ids);
                     ap.dejarApu1((int) raf.getFilePointer());
                }
            }

        }

    }
}