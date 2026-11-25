public class Pila2 {
    private NodoPila cima;
    private int numElementos;

    public Pila2() {
        cima = null;
        numElementos = 0;
    }

    public boolean vacia() {
        return cima == null;
    }

    public void apilar(Cola2 dato) {
        NodoPila nuevo = new NodoPila(dato, cima);
        cima = nuevo;
        numElementos++;
    }

    public Cola2 desapilar() {
        Cola2 valor;
        if (this.vacia()) {
            System.out.println("Error, la pila está vacía");
            valor = null;
        } else {
            valor = cima.getDato();
            cima = cima.getSiguiente();
            numElementos--;
        }
        return valor;
    }

    public Cola2 getCima() {
        Cola2 valor;
        if (this.vacia()) {
            System.out.println("Error, la pila está vacía");
            valor = null;
        } else valor = cima.getDato();
        return valor;
    }

    public void quitarCima() {
        if (this.vacia())
            System.out.println("Error, la pila está vacía");
        else {
            cima = cima.getSiguiente();
            numElementos--;
        }
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void mostrar() {
        NodoPila auxiliar = cima;
        System.out.println("Contenido de la pila:");
        while (auxiliar != null) {
            auxiliar.getDato().mostrar();
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("FIN");
    }
}
