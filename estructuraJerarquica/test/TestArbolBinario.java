package test;

import dinamica.ArbolBinario;

public class TestArbolBinario {
    public static void main(String[] args) {
        ArbolBinario pruebaArbol=new ArbolBinario();
        pruebaArbol.insertar(1, null, ' ');
        pruebaArbol.insertar(2, 1, 'i');
        pruebaArbol.insertar(3, 1, 'd');
        pruebaArbol.insertar(4, 2, 'i');
        pruebaArbol.insertar(5, 3, 'd');
        System.out.println(pruebaArbol.listarPreorden().toString());
         
    }
}
