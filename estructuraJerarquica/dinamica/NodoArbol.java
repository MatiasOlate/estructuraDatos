package dinamica;

public class NodoArbol {
    private Object elemento;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol(Object elem,NodoArbol izq,NodoArbol der){
        this.elemento=elem;
        this.izquierdo=izq;
        this.derecho=der;
    }

    //GETERS
    public Object getElem(){
        return this.elemento;
    }
    public NodoArbol getIzquierdo(){
        return this.izquierdo;
    }
    public NodoArbol getDerecho(){
        return this.derecho;
    }

    //SETERS
    public void setElem(Object unElem){
        this.elemento=unElem;
    }
    public void setIzquierdo(NodoArbol unIzq){
        this.izquierdo=unIzq;
    }
    public void setDerecho(NodoArbol unDer){
        this.derecho=unDer;
    }

    public boolean equals(Object unNodo){
        boolean igualdad=false;
        if (this.elemento==unNodo) {
            igualdad=true;
        }
        return igualdad;
    }
}
