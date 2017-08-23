/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import Modelo.Esquema;

/**
 *
 * @author Juan Manuel
 */
public class Arbol1 {
    
     private class nodoArbol {
        Arbol1 hd;
        Arbol1 hi;
        public int idEs;
        public  int pos;
 
        public void nodoArbol(){
            hd = null;
            hi = null;
            idEs = 0;
            pos=0;
        }
    }
 
    public nodoArbol raiz;
 
    public void abb(){
        nodoArbol raiz = new nodoArbol();
    }
 
    public boolean esVacio(){
        return (raiz == null);
    }
 
    public void insertar(int a,int pos){
        if (esVacio()) {
            nodoArbol nuevo = new nodoArbol();
            nuevo.idEs = a;
            nuevo.pos=pos;
            nuevo.hd = new Arbol1();
            nuevo.hi = new Arbol1();
            raiz = nuevo;
        }
        else {
            if (a > raiz.idEs) {
                (raiz.hd).insertar(a,pos);
            }
            if (a < raiz.idEs){
                (raiz.hi).insertar(a,pos);
            }
        }
    }
 
    public void preOrder(){
        if (!esVacio()) {
            System.out.print( raiz.idEs + ", "  );
            raiz.hi.preOrder();
            raiz.hd.preOrder();
        }
    }
 
    public Esquema inOrder(){
        Esquema sis=new Esquema();
        if (!esVacio()) {
            raiz.hi.inOrder();
            
            sis.setId(raiz.pos);
            System.out.print("id: " +raiz.idEs +" pos: "+raiz.pos + ", "  );
            raiz.hd.inOrder();
        }
        return sis;
    }
 
    public void posOrder(){
        if (!esVacio()) {
            raiz.hd.posOrder();
            raiz.hi.posOrder();
            System.out.print( raiz.idEs + ", "  );
 
        }
    }
 
    public Arbol1 buscar(int a){
        Arbol1 arbolito = null;
        if (!esVacio()) {
            if (a == raiz.idEs) {
            return this;
            }
            else {
                if (a < raiz.idEs) {
                    arbolito = raiz.hi.buscar(a);
                }
                else {
                    arbolito = raiz.hd.buscar(a);
                }
            }
        }
        return arbolito;
    }
 
    public boolean existe(int a){
    if (!esVacio()) {
            if (a == raiz.idEs) {
            return true;
            }
            else {
                if (a < raiz.idEs) {
                    raiz.hi.existe(a);
                }
                else {
                    raiz.hd.existe(a);
                }
            }
        }
        return false;
    }
 
    public int cantidad(){
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + raiz.hd.cantidad() + raiz.hi.cantidad());
        }
    }
 
    public int altura() {
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + Math.max(((raiz.hi).altura()), ((raiz.hd).altura())));
        }
    }
 
    public int buscarMin() {
        Arbol1 arbolActual = this;
        while( !arbolActual.raiz.hi.esVacio() ) {
            arbolActual = arbolActual.raiz.hi;
        }
        int devuelvo= arbolActual.raiz.idEs;
        arbolActual.raiz=null;
        return devuelvo;
    }
 
    public int buscarMax() {
        Arbol1 arbolActual = this;
        while( !arbolActual.raiz.hd.esVacio() ) {
            arbolActual = arbolActual.raiz.hd;
        }
        int devuelvo= arbolActual.raiz.idEs;
            arbolActual.raiz=null;
        return devuelvo;
    }
 
    public boolean esHoja() {
        boolean hoja = false;
        if( (raiz.hi).esVacio() && (raiz.hd).esVacio() ) {
            hoja = true;
        }
        return hoja;
    }
 
    public void eliminar(int a) {
        Arbol1 paraEliminar = buscar(a);
        if (!paraEliminar.esVacio()) {
            if (paraEliminar.esHoja()) {
                paraEliminar.raiz = null;
            }
            else {
                if (!paraEliminar.raiz.hi.esVacio() && !paraEliminar.raiz.hd.esVacio()) {
                    paraEliminar.raiz.idEs = paraEliminar.raiz.hd.buscarMin();
                }
                else {
                    if (paraEliminar.raiz.hi.esVacio()) {
                        paraEliminar.raiz = paraEliminar.raiz.hd.raiz;
                    }else{
                        paraEliminar.raiz = paraEliminar.raiz.hi.raiz;
                    }
                }
            }
        }
    }
    
}
