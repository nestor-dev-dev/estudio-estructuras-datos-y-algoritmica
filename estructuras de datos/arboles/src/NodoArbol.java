class NodoArbol {

    private int dato, numElementos=0;
    private NodoArbol izquierdo, derecho;

    public NodoArbol(int dato) {
        this.dato = dato;
        this.izquierdo = this.derecho = null;
        numElementos++;
    }

    public NodoArbol(int dato, NodoArbol izquierdo, NodoArbol derecho) {
        this.dato = dato;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        numElementos=izquierdo.numElementos+derecho.numElementos+1;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public int getNumElementos(){
        return numElementos;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }

}
