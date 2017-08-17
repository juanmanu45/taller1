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
public class Apuntadores {
    RandomAccessFile raf;

    public Apuntadores(RandomAccessFile raf) throws FileNotFoundException {
       raf=new RandomAccessFile("apunta.txt","rw");
    }

    Apuntadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void dejarApu1(int pos1) throws IOException{
        raf.seek(0);
        raf.writeInt(pos1);
       
    }
     public void dejarApu2(int pos2) throws IOException{
        
        raf.seek(4);
        raf.writeInt(pos2);
        
           
    }
      public void dejarApu3( int pos3) throws IOException{
        
        raf.seek(8);
        raf.writeInt(pos3);
           
    }
    
}
