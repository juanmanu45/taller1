/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Modelo.Esquema;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan Manuel
 */
public class Sistemas {

    RandomAccessFile raf = null;

    public Sistemas() throws FileNotFoundException {
        raf = new RandomAccessFile("sistemas.txt", "rw");
        File arc = new File("sistemas.txt");
        System.out.println(arc.getAbsolutePath());
    }

    public void insertarEsquema(int idesquema, char nombre[], int numcol) throws FileNotFoundException, IOException {

        raf.seek(0);

        if (nombre.length <= 20) {
            int desN = 20 - nombre.length;

            raf.writeInt(idesquema);
            for (int i = 0; i < nombre.length; i++) {
                raf.writeChar(nombre[i]);
            }
            long pos1 = raf.getFilePointer();
            raf.seek(desN + pos1);

            raf.writeInt(numcol);

        }
    }

    public Esquema leerEsquema() throws IOException {
        raf.seek(0);
        Esquema es = new Esquema();
        es.setId(raf.readInt());
        char[] nom = new char[20];
        for (int i = 0; i < 20; i++) {
            

            nom[i] = raf.readChar();
        }
        es.setNombre(nom);

        raf.seek(44);
        System.out.println("  " + raf.readInt());
        
        return es;

    }

}
