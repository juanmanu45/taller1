/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Arboles.Arbol1;
import Modelo.Esquema;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author Juan Manuel
 */
public class Sistemas {

     RandomAccessFile raf = null;
    public Arbol1 ar;

    public Sistemas() throws FileNotFoundException {
        raf = new RandomAccessFile("Esquemas.txt", "rw");

    }

    public void insertarEsquema(int idesquema, char nombre[], int numcol) throws FileNotFoundException, IOException {

        long tamaño = raf.length();
        
        ar.insertar(idesquema, (int) tamaño);
        

        raf.seek(tamaño);
        if (nombre.length <= 20) {
            int desN = 20 - nombre.length;

            raf.writeInt(idesquema);
            int cont = 0;
            for (int i = 0; i < nombre.length; i++) {
                raf.writeChar(nombre[i]);
                cont = i;
            }
            for (int i = cont; i < desN; i++) {
                raf.writeChar(' ');
            }
            long pos1 = raf.getFilePointer();
            raf.seek(desN + pos1);

            raf.writeInt(numcol);

        }

       
    }

    public Esquema leerUnEsquema(long pos) throws IOException {
        

        raf.seek(pos);
        Esquema es = new Esquema();
        es.setId(raf.readInt());
        char[] nom = new char[20];
        for (int i = 0; i < 20; i++) {

            nom[i] = raf.readChar();
        }
        es.setNombre(nom);

        return es;

    }
    public Esquema leer() throws IOException{
         raf.seek(0);
        Esquema es = new Esquema();
        es.setId(raf.readInt());
        char[] nom = new char[20];
        for (int i = 0; i < 20; i++) {

            nom[i] = raf.readChar();
        }
        es.setNombre(nom);

        return es;
    }

    

}
