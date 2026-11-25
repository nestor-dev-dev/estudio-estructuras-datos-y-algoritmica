public class NodoPila {

    private Asignatura dato;
    private NodoPila siguiente;

    public NodoPila(Asignatura dato, NodoPila siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    public Asignatura getDato() {
        return dato;
    }

    public double verNota(){
        return dato.getNota();
    }

    public String verNombre(){
        return dato.getNom();
    }

    public void setDato(Asignatura dato) {
        this.dato = dato;
    }
}

