/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

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
    }

    public void insertarEsquema(int idesquema, char nombre[], int numcol) throws FileNotFoundException, IOException {

        raf.seek(0);
        raf.writeInt(idesquema);
        for (int i = 0; i < nombre.length; i++) {
            raf.writeChar(nombre[i]);
        }
        raf.writeInt(numcol);

    }

}
