package estructuraLineal;

public class Lista {
    private Nodo cabecera;
    private int longitud;

    public Lista() {
        this.cabecera = null;
        this.longitud = 0;
    }

    public boolean insertar(Object elemento, int pos) {
        boolean exito = false;
        if (pos <= this.longitud + 1 && pos > 0) {
            Nodo nodito = new Nodo(elemento, null);
            if (pos == 1) {
                nodito.setEnlace(this.cabecera);
                this.cabecera = nodito;
                this.longitud++;
            } else {
                int i = 1;
                Nodo aux = this.cabecera;
                while (i < pos - 1) {
                    aux = aux.getEnlace();
                    i++;
                }
                nodito.setEnlace(aux.getEnlace());
                aux.setEnlace(nodito);
                this.longitud++;
            }
            exito = true;
        }
        return exito;
    }

    public boolean eliminar(int pos) {
        boolean exito = false;
        if (pos <= this.longitud && pos > 0) {
            if (pos == 1) {
                this.cabecera = this.cabecera.getEnlace();
                this.longitud--;
                exito = true;
            } else {
                int i = 1;
                Nodo aux = this.cabecera;
                while (!exito) {
                    if (i == pos - 1) {
                        aux.setEnlace(aux.getEnlace().getEnlace());
                        exito = true;
                        this.longitud--;
                    } else {
                        aux = aux.getEnlace();
                        i++;
                    }
                }

            }
        }
        return exito;
    }

    public Object recuperar(int pos) {
        Object elemento = null;
        if (this.longitud > 0 && pos > 0 && pos <= this.longitud && this.cabecera != null) {
            int i = 1;
            Nodo aux = this.cabecera;
            while (i < pos) {
                aux = aux.getEnlace();
                i++;
            }
            elemento = aux.getElem();
        }
        return elemento;
    }

    public int localizar(Object elemento) {
        int pos = 1;
        boolean encontrado = false;
        if (this.longitud > 0) {
            Nodo aux = this.cabecera;
            while (!encontrado && aux != null) {
                if (aux.getElem().equals(elemento)) {
                    encontrado = true;
                } else {
                    aux = aux.getEnlace();
                    pos++;
                }
            }
        }
        if (encontrado == false) {
            pos = -1;
        }
        return pos;
    }

    public int longitud() {
        return this.longitud;
    }

    public boolean esVacia() {
        return this.longitud == 0;
    }

    public void vaciar() {
        this.cabecera = null;
        this.longitud = 0;
    }

    public String toString() {
        String cadena = "[";
        if (this.longitud > 0) {
            Nodo aux = this.cabecera;
            while (aux != null) {
                cadena += aux.getElem();
                aux = aux.getEnlace();
                if (aux != null) {
                    cadena += ",";
                }
            }
        }
        cadena += "]";
        return cadena;
    }

    public Lista clone() {
        Lista unLista = new Lista();
        Nodo aux = this.cabecera;
        Nodo aux2 = new Nodo(null, null);
        if (aux != null) {
            aux2 = new Nodo(aux.getElem(), null);
            unLista.cabecera = aux2;
            unLista.longitud++;
            aux = aux.getEnlace();
            while (aux != null) {
                aux2.setEnlace(new Nodo(aux.getElem(), null));
                aux = aux.getEnlace();
                aux2 = aux2.getEnlace();
                unLista.longitud++;
            }
        }
        return unLista;
    }
}
