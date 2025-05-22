package dinamica;
import estructuraLineal.Lista;

public class ArbolGenerico {
    private NodoGenerico raiz;

    public ArbolGenerico(){
        this.raiz=null;
    }

    //METODOS PROPIOS DE LA CLASE
    public boolean insertar(Object elemNuevo, Object elemPadre){
        //Inserta un nuevo NodoGenerico a un nodo padre.
        boolean hecho=false;
        if (this.raiz==null) {
            this.raiz=new NodoGenerico(elemNuevo,null,null);
        }else{
            NodoGenerico nodoPadre=obtenerNodo(this.raiz,elemPadre);
            //Si encuentra al padre, inserta, sino devuelve falso, xq no se pudo concretar.
            if(nodoPadre!=null){
                //Se crea un NodoGenerico, el cual se le asigna el elemento nuevo, como hijo.
                NodoGenerico nodoHijo=new NodoGenerico(elemNuevo, null, null);
                //1ro se enlaza con sus hermanos, para no perderlos. 
                nodoHijo.setHermanoDerecho(nodoPadre.getHijoIzquierdo());
                //Luego se enlaza con su padre.
                nodoPadre.setHijoIzquierdo(nodoHijo);
                hecho=true;
            }
        }
        return hecho;
    }

    private NodoGenerico obtenerNodo(NodoGenerico nodo, Object nodoBuscado){
        //Apartir de una raiz va buscando al nodo padre.
        NodoGenerico resultado=null;
        if (nodo!=null) {
            if (nodo.getElem().equals(nodoBuscado)) {
                resultado=nodo;
            }else{
                resultado=obtenerNodo(nodo.getHijoIzquierdo(), nodoBuscado);
                if (resultado==null) {
                    resultado=obtenerNodo(nodo.getHermanoDerecho(), nodoBuscado);
                }
            }
        }
        return resultado;
    }

    public boolean insertarPorPosicion(Object elemNuevo, int posPadre){
        //Inserta un nuevo NodoGenerico a un nodo padre que se encuentra en una determinada posicion.
        //Se puede hacer usando un solo modulo?
        //Raiz=1, el resto preOrden
        boolean hecho=true;
        if (this.raiz==null) {
            this.raiz=new NodoGenerico(elemNuevo,null,null);
        }else{
            NodoGenerico nodoPadre=obtenerNodo(this.raiz,elemPadre);
            //Si encuentra al padre, inserta, sino devuelve falso, xq no se pudo concretar.
            if(nodoPadre!=null){
                //Se crea un NodoGenerico, el cual se le asigna el elemento nuevo, como hijo.
                NodoGenerico nodoHijo=new NodoGenerico(elemNuevo, null, null);
                //1ro se enlaza con sus hermanos, para no perderlos. 
                nodoHijo.setHermanoDerecho(nodoPadre.getHijoIzquierdo());
                //Luego se enlaza con su padre.
                nodoPadre.setHijoIzquierdo(nodoHijo);
            }else{
                hecho=false;
            }
        }
        return hecho;
    }

    public boolean pertenece(Object elemBuscado){
        //Devuelve 'verdadero' cuando encuentra al 1er nodo que sea igual al elemento buscado en el arbol
        boolean encontrado=false;
        NodoGenerico nodo=obtenerNodo(raiz, elemBuscado);
        if (nodo!=null) {
            encontrado=true;
        }
        return encontrado;
    }

    public Lista ancentros(Object elemBuscado){
        Lista listaAnc=null;
        if (pertenece(elemBuscado)){
            
        }
        return listaAnc;
    }

    private void listarAncestros(NodoGenerico nodoActual, Object ultimo, Lista listaDefinitiva){
        if (nodoActual.getElem().equals(ultimo)) {
            //Visita el elemento del nodo.
            listaAux.insertar(nodo.getElem(),listaAux.longitud()+1);
            NodoGenerico hijo=nodo.getHijoIzquierdo();
            while(hijo!=null){
                listarPreordenAux(hijo,listaAux);
                hijo=hijo.getHermanoDerecho();
            }
            
        }
    }
    public String toString(){
        return toStringAux(this.raiz);
    }

    private String toStringAux(NodoGenerico nodo){
        String salida="";
        if (nodo!=null) {
            salida+=nodo.getElem().toString()+">>";
            NodoGenerico hijo=nodo.getHijoIzquierdo();
            while (hijo!=null) {
                salida+=hijo.getElem().toString()+", ";
                hijo=hijo.getHermanoDerecho();
            }
            hijo=nodo.getHijoIzquierdo();
            while (hijo!=null) {
                salida+="\n"+toStringAux(hijo);
                hijo=hijo.getHermanoDerecho();
            }
        }
        return salida;
    }
    //ORDENAMIENTOS ÁRBOL (PRE-ORDEN, IN-ORDEN Y POS-ORDEN)
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
            NodoGenerico hijo=nodo.getHijoIzquierdo();
            while(hijo!=null){
                listarPreordenAux(hijo,listaAux);
                hijo=hijo.getHermanoDerecho();
            }
            
        }
    }


}
