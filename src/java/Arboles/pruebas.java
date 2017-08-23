/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author Juan Manuel
 */
public class pruebas {
    public static void main(String[] args) {
        
        Arbol1 ar=new Arbol1();
        ar.insertar(0, 3);
        ar.insertar(1, 4);
        ar.insertar(5, 0);
        
        
        Arbol1 br=new Arbol1();
        br=ar.buscar(5);
        br.inOrder();
        
        
    }
    
}
