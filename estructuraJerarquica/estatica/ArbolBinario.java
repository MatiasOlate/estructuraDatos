package estatica;

public class ArbolBinario{
    private static final int TAMANIO=10;
    private CeldaBinaria[] arbol;
    private int raiz;

    //CONSTRUCTOR
    public ArbolBinario(){
        this.arbol=new CeldaBinaria[TAMANIO];
        for (int i = 0; i < TAMANIO; i++) {
            this.arbol[i]=new CeldaBinaria();
        }
        this.raiz=-1;
    }

    //METODOS
    public boolean insertar(CeldaBinaria elemNuevo, CeldaBinaria elemPadre){
        boolean hecho=false;
        if (hecho) {
            
        }
        return hecho;
    }
}