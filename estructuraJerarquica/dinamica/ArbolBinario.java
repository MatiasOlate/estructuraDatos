package dinamica;
import estructuraLineal.Lista;

public class ArbolBinario {
    private NodoArbol raiz;

    public ArbolBinario(){
        this.raiz=null;
    }

    //METODOS
    public boolean insertar(Object elemNuevo, Object elemPadre, char lugar){
        //Inserta 
        boolean hecho=true;
        if (this.raiz==null) {
            this.raiz=new NodoArbol(elemNuevo,null,null);
        }else{
            //Si el árbol no esta vacio, busca al padre.
            NodoArbol nodoP=obtenerNodo(this.raiz,elemPadre);
            //Si encuentra al padre y encuentra un lugar desocupado, lo inserta, sino, tira ERROR.
            if(nodoP!=null){
                if (lugar=='i' && nodoP.getIzquierdo()==null) {
                    nodoP.setIzquierdo(new NodoArbol(elemNuevo,null,null));
                }else if(lugar=='d' && nodoP.getDerecho()==null){
                    nodoP.setDerecho(new NodoArbol(elemNuevo,null,null));
                }else{
                    hecho=false;
                }
            }
        }
        return hecho;
    }


    private NodoArbol obtenerNodo(NodoArbol nodo, Object nodoBuscado){
        NodoArbol resultado=null;
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

    private void listarPreordenAux(NodoArbol nodo, Lista listaAux){
        if (nodo!=null) {
            //Visita el elemento del nodo.
            listaAux.insertar(nodo.getElem(),listaAux.longitud()+1);
            listarPreordenAux(nodo.getIzquierdo(),listaAux);
            listarPreordenAux(nodo.getDerecho(),listaAux);
        }
    }

}
