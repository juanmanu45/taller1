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
        RandomAccessFile file = new RandomAccessFile("file1.txt", "rw");
        raf.seek(0);
        raf.writeInt(idesquema);
        for (int i = 0; i < nombre.length; i++) {
            raf.writeChar(nombre[i]);
        }
        raf.writeInt(numcol);

    }
    
    public void leerEsquema() throws IOException{
        raf.seek(0);
        Esquema es=new Esquema();
        raf.readInt();
        for (int i = 0; i < es.getNombre().length; i++) {
            raf.readChar();
            
        }
        raf.readInt();
        
        
    }

}
