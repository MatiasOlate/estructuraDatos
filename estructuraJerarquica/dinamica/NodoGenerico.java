package dinamica;

public class NodoGenerico {
    private Object elemento;
    private NodoGenerico hijoIzquierdo;
    private NodoGenerico hermanoDerecho;

    public NodoGenerico(Object elem,NodoGenerico hIzq,NodoGenerico hDer){
        this.elemento=elem;
        this.hijoIzquierdo=hIzq;
        this.hermanoDerecho=hDer;
    }

    //GETERS
    public Object getElem(){
        return this.elemento;
    }
    public NodoGenerico getHijoIzquierdo(){
        return this.hijoIzquierdo;
    }
    public NodoGenerico getHermanoDerecho(){
        return this.hermanoDerecho;
    }

    //SETERS
    public void setElem(Object unElem){
        this.elemento=unElem;
    }
    public void setHijoIzquierdo(NodoGenerico unHijoIzq){
        this.hijoIzquierdo=unHijoIzq;
    }
    public void setHermanoDerecho(NodoGenerico unDer){
        this.hermanoDerecho=unDer;
    }

    public boolean equals(Object unNodo){
        boolean igualdad=false;
        if (this.elemento==unNodo) {
            igualdad=true;
        }
        return igualdad;
    }
}
