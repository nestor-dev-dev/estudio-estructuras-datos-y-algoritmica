public class NodoPila {
    private Cola2 dato;
    private NodoPila siguiente;

    public NodoPila(Cola2 dato, NodoPila sig) {
        this.dato = dato;
        this.siguiente = sig;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    public Cola2 getDato() {
        return dato;
    }

    public void setDato(Cola2 dato) {
        this.dato = dato;
    }
}
