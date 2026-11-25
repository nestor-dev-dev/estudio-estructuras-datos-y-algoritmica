public class ListaOrdinal {
    private NodoListaOrdinal inicio, fin;
    private int numElementos;

    public ListaOrdinal() {
        inicio = null;
        fin = null;
        numElementos = 0;
    }

    public boolean vacia() {
        return inicio == null;
    }

    /**
     * Inserta el dato en la última posición de la lista
     */
    public void insertar(int dato) {
        NodoListaOrdinal nuevo = new NodoListaOrdinal(dato, null);
        if (this.vacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        numElementos++;
    }


    /**
     * Busca el dato que ocupa la posición recibida como parámetro,
     * en caso de existir.
     */
    public int getElemento(int posicion) {
        NodoListaOrdinal actual;
        if ((posicion > numElementos - 1) || (posicion < 0)) {
            System.out.println("No existe la posición " + posicion);
            return -1;
        } else {
            actual = inicio;
            for (int i = 0; i < posicion; i++) {
                actual = actual.getSiguiente();
            }
            return actual.getDato();
        }
    }

    public int borrarPosicion(int posicion){
        NodoListaOrdinal actual=null, anterior=null;
        int res;
        if ((posicion > numElementos - 1) || (posicion < 0)) {
            System.out.println("No existe la posición " + posicion);
            res = -1;
        } else {
            actual = inicio;
            anterior=null;
            for (int i = 0; i < posicion; i++) {
                anterior=actual;
                actual = actual.getSiguiente();
            }
            res = actual.getDato();
        }

        //eliminar actual
        if(res != -1){//la posición exisite
            if(anterior == null){//eliminamos la primera posición
                inicio=actual.getSiguiente();
            }else{
                anterior.setSiguiente(actual.getSiguiente());
            }
            if (actual == fin) {  // se borra el último
                fin = anterior;
            }
            numElementos--;
        }

        return res;
    }

    /**
     * Borra el primer elemento de la lista cuyo dato coincide con el
     * parámetro recibido.
     */
    public void borrar(int dato) {
        NodoListaOrdinal actual = inicio;
        NodoListaOrdinal anterior = null;
        boolean borrado = false;
        while (actual != null && !borrado) {
            if (actual.getDato() == dato) {  // Borrar actual
                if (actual != inicio) {
                    anterior.setSiguiente(actual.getSiguiente());
                } else {
                    inicio = actual.getSiguiente();
                }
                if (actual == fin) {  // se borra el último
                    fin = anterior;
                }
                numElementos--;
                borrado = true;
            } else {
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }
    }

    /**
     * Devuelve la primera posición en la que se encuentra el dato,
     * en caso de existir. En caso contrario, devuelve -1
     */

    public int posicion(int dato) {
        NodoListaOrdinal actual = inicio;
        int pos = 0;
        while (actual != null && actual.getDato() != dato) {
            actual = actual.getSiguiente();
            pos++;
        }
        if (actual != null) {
            return pos;
        } else {
            return -1;
        }
    }

    public void mostrar(){
        if(!this.vacia()){
            NodoListaOrdinal actual = inicio;
            boolean seguir = true;
            while (seguir){
                if(actual != fin){
                    System.out.print(actual.getDato()+" ");
                    actual=actual.getSiguiente();
                }else{
                    System.out.println(actual.getDato()+" FIN");
                    seguir=false;
                }
            }
        }
        else{
            System.out.println("Lista vacía.");
        }
    }

    /**
     * Determina si el dato recibido como parámetro existe en la lista.
     */
    public boolean contiene(int dato) {
        return this.posicion(dato) >= 0;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public IteradorListaOrdinal getIterador() {
        return new IteradorListaOrdinal(inicio);
    }

    public int numConvocatorias(String nombreAsignatura) {
        return 0; // Eliminar esta líne al codificar el método
    }

    public void duplicarParesQuitarImpares(){
        NodoListaOrdinal actual=inicio, anterior=null;
        if(!this.vacia()){
            boolean seguir = true;
            while (seguir){
                if(actual != fin){
                    if(actual.getDato()%2 == 0){//es par
                        NodoListaOrdinal nuevo = new NodoListaOrdinal(actual.getDato(), actual.getSiguiente());
                        actual.setSiguiente(nuevo);
                        anterior=nuevo;
                        actual=nuevo.getSiguiente();
                    }else{//es impar
                        if(anterior==null){
                            inicio=actual.getSiguiente();
                        }else{
                            anterior.setSiguiente(actual.getSiguiente());
                        }
                        actual=actual.getSiguiente();
                    }
                }else{
                    seguir=false;
                    if(actual.getDato()%2 == 0){//es par
                        NodoListaOrdinal nuevo = new NodoListaOrdinal(actual.getDato(), fin);
                        actual.setSiguiente(nuevo);
                    }else{//es impar
                        fin=anterior;
                    }
                }
            }
        }
    }

    public void eliminarRepetidos(int n){
        boolean encontrado = false;
        NodoListaOrdinal actual=inicio, anterior=inicio;

        while (actual != null){
            if(actual.getDato() == n){
                if(!encontrado){
                    encontrado=true;
                }else{
                    //es imposible que coincida en inicio
                    anterior.setSiguiente(actual.getSiguiente());
                }
            }
            //movimiento de actual y anterior
            if(actual == inicio){
                actual = actual.getSiguiente();
            }else{
                anterior=actual;
                actual=actual.getSiguiente();
            }
        }
    }

    public void borrarDuplicar(int n){
        if(!this.vacia()){
            boolean encontrado=false;
            NodoListaOrdinal actual = inicio, anterior=null;
            while (actual != fin){
                if(actual.getDato() != n){
                    anterior=actual;
                    actual=actual.getSiguiente();
                }else{
                    //lo hemos encontrado
                    if(!encontrado){
                        //borrar
                        if(anterior == null){
                            inicio=actual.getSiguiente();
                        }else{
                            anterior.setSiguiente(actual.getSiguiente());
                        }
                        actual=actual.getSiguiente();
                        encontrado=true;
                    }else{
                        //duplicar
                        NodoListaOrdinal nuevo = new NodoListaOrdinal(actual.getDato(), actual.getSiguiente());
                        actual.setSiguiente(nuevo);
                        anterior=nuevo;
                        actual=nuevo.getSiguiente();
                    }
                }
            }
        }
    }

    public void moverAlFinal(int dato){
        NodoListaOrdinal actual = inicio, anterior = null, aux = null;
        boolean encontrado = false;

        while (actual != fin){
            if(encontrado){
                actual=fin;
            }else{
                if(actual.getDato() == dato){
                    encontrado=true;
                    aux=actual;

                    if(anterior == null){
                        inicio = actual.getSiguiente();
                    }else{
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                }
                anterior=actual;
                actual=actual.getSiguiente();
            }
            if(aux != null){
                actual.setSiguiente(aux);
                aux.setSiguiente(null);
                fin=aux;
            }
        }
    }
}
