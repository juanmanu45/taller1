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
public class Arbol3 {private class nodoArbol {
         Arbol3 hd;
         Arbol3 hi;
         int idEs;
         int pos;
 
        private void nodoArbol(){
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
            nuevo.hd = new Arbol3();
            nuevo.hi = new Arbol3();
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
 
    public void inOrder(){
        if (!esVacio()) {
            raiz.hi.inOrder();
            System.out.print("id: " +raiz.idEs +" pos: "+raiz.pos + ", "  );
            raiz.hd.inOrder();
        }
    }
 
    public void posOrder(){
        if (!esVacio()) {
            raiz.hd.posOrder();
            raiz.hi.posOrder();
            System.out.print( raiz.idEs + ", "  );
 
        }
    }
 
    public Arbol3 buscar(int a){
        Arbol3 arbolito = null;
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
        Arbol3 arbolActual = this;
        while( !arbolActual.raiz.hi.esVacio() ) {
            arbolActual = arbolActual.raiz.hi;
        }
        int devuelvo= arbolActual.raiz.idEs;
        arbolActual.raiz=null;
        return devuelvo;
    }
 
    public int buscarMan() {
        Arbol3 arbolActual = this;
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
        Arbol3 paraEliminar = buscar(a);
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
