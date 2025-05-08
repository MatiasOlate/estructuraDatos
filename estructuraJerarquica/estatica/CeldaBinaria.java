package estatica;

public class CeldaBinaria {
    private CeldaBinaria elemento;
    private int izquierdo;
    private int derecho;
    private boolean enUso;

    //CONSTRUCTOR VACIO
    public CeldaBinaria(){
        this.elemento=null;
        this.izquierdo=-1;
        this.derecho=-1;
        this.enUso=false;
    }

    //METODOS SET/GET
    public void setElemento(CeldaBinaria elemento) {
        this.elemento = elemento;
        this.enUso=true;
    }

}
