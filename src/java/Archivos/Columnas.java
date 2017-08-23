/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Arboles.Arbol1;
import Modelo.Columna;
import Modelo.Esquema;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Juan Manuel
 */
public class Columnas {

    RandomAccessFile raf = null;
    public Arbol1 ar;

    public Columnas() throws FileNotFoundException {
        raf = new RandomAccessFile("Columnas.txt", "rw");

    }

    public void insertarColumna(int idCol, char nombre[], int idTa) throws FileNotFoundException, IOException {

        long tamaño = raf.length();

        ar.insertar(idCol, (int) tamaño);

        raf.seek(tamaño);
        if (nombre.length <= 20) {
            int desN = 20 - nombre.length;

            raf.writeInt(idCol);
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

            raf.writeInt(idTa);

        }

    }

    public Columna leerUnEsquema(long pos) throws IOException {

        raf.seek(pos);
        Columna es = new Columna();
        es.setIdCol(raf.readInt());
        char[] nom = new char[20];
        for (int i = 0; i < 20; i++) {

            nom[i] = raf.readChar();
        }
        es.setNombre(nom);
        es.setIdTabla(raf.readInt());

        return es;

    }

    public Columna leer() throws IOException {
        raf.seek(0);
        Columna es = new Columna();
        es.setIdCol(raf.readInt());
        char[] nom = new char[20];
        for (int i = 0; i < 20; i++) {

            nom[i] = raf.readChar();
        }
        es.setNombre(nom);
        es.setIdTabla(raf.readInt());

        return es;
    }

}
