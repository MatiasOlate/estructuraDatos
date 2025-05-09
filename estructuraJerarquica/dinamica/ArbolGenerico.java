package dinamica;
import estructuraLineal.Lista;

public class ArbolGenerico {
    private NodoGenerico raiz;

    public ArbolGenerico(){
        this.raiz=null;
    }

    //METODOS
    public boolean insertar(Object elemNuevo, Object elemPadre){
        //Inserta 
        boolean hecho=true;
        if (this.raiz==null) {
            this.raiz=new NodoGenerico(elemNuevo,null,null);
        }else{
            
        }
        return hecho;
    }


    private NodoGenerico obtenerNodo(NodoGenerico nodo, Object nodoBuscado){
        NodoGenerico resultado=null;
        if (nodo!=null) {
            if (nodo.getElem().equals(nodoBuscado)) {
                resultado=nodo;
            }else{
                resultado=obtenerNodo(nodo.getIzquierdo(), nodoBuscado);
                if (resultado==null) {
                    resultado=obtenerNodo(nodo.getDerecho(), nodoBuscado);
                }
            }
        }
        return resultado;
    }
    //ORDENAMIENTO ÁRBOL
    public Lista listarPreorden(){
        //Retorna una lista con los elementos del árbol en PRE-ORDEN
        Lista listaAux=new Lista();
        listarPreordenAux(this.raiz, listaAux);
        return listaAux;
    }

    private void listarPreordenAux(NodoGenerico nodo, Lista listaAux){
        if (nodo!=null) {
            //Visita el elemento del nodo.
            listaAux.insertar(nodo.getElem(),listaAux.longitud()+1);
            listarPreordenAux(nodo.getIzquierdo(),listaAux);
            listarPreordenAux(nodo.getDerecho(),listaAux);
        }
    }

}
