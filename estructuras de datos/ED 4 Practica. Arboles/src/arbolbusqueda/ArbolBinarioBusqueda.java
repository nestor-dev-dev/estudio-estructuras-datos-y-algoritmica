package arbolbusqueda;

public class ArbolBinarioBusqueda {

    private NodoArbol raiz;
    private int numElementos;

    public ArbolBinarioBusqueda() {
        raiz = null;
        numElementos = 0;
    }

    public boolean vacia() {
        return raiz == null;
    }


    public Alumno getElemento(int clave) {
        return this.getElementoRec(raiz, clave);
    }

    private Alumno getElementoRec(NodoArbol nodo, int clave) {
        if (nodo == null) {    // No encontrado
            return null;
        } else if (clave == nodo.getClave()) {    // Encontrado
            return nodo.getDato();
        } else if (clave < nodo.getClave()) {     // Subárbol izquierdo
            return this.getElementoRec(nodo.getIzquierdo(), clave);
        } else {        // Subárbol izquierdo
            return this.getElementoRec(nodo.getDerecho(), clave);
        }
    }

    public boolean insertar(Alumno dato) {
        int previousNumElementos = numElementos;
        raiz = this.insertarRec(raiz, dato);
        return (previousNumElementos < numElementos);
    }

    private NodoArbol insertarRec(NodoArbol nodo, Alumno dato) {
        if (nodo == null) {
            nodo = new NodoArbol(dato);   // Crear nuevo nodo
            numElementos++;
        } else if (dato.getMatricula() < nodo.getClave()) {    // Subárbol izquierdo
            NodoArbol nuevoIzq = this.insertarRec(nodo.getIzquierdo(), dato);
            nodo.setIzquierdo(nuevoIzq);
        } else if (dato.getMatricula() > nodo.getClave()) {    // Subárbol derecho
            NodoArbol nuevoDer = this.insertarRec(nodo.getDerecho(), dato);
            nodo.setDerecho(nuevoDer);
        } else {
            System.out.println("Error inserción. La clave " + dato.getMatricula() + " ya existe");
            nodo = null;
        }
        return nodo;
    }


    public boolean contiene(int clave) {
        return this.getElemento(clave) != null;
    }

    public boolean borrar(int clave) {
        int previousNumElementos = numElementos;
        raiz = this.borrarRec(raiz, clave);
        return (numElementos < previousNumElementos);
    }

    private NodoArbol borrarRec(NodoArbol nodo, int clave) {
        if (nodo == null) {
            System.out.println("la clave buscada no existe");
        } else if (nodo.getClave() > clave) {  // Buscar en subarbol izquierdo
            NodoArbol nuevoIzq = this.borrarRec(nodo.getIzquierdo(), clave);
            nodo.setIzquierdo(nuevoIzq);
        } else if (nodo.getClave() < clave) {  // Buscar en subarbol derecho
            NodoArbol nuevoDer = this.borrarRec(nodo.getDerecho(), clave);
            nodo.setDerecho(nuevoDer);
        } else {  // Borrar elemento en nodo
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
                nodo = null;  // Caso 1
            } else if (nodo.getDerecho() == null) {  // Caso 2
                nodo = nodo.getIzquierdo();
            } else if (nodo.getIzquierdo() == null) {  // Caso 2
                nodo = nodo.getDerecho();
            } else {    // Caso 3
                NodoArbol nuevoIzq = this.cambiarPorMenor(nodo, nodo.getIzquierdo());
                nodo.setIzquierdo(nuevoIzq);
            }
            numElementos--;
        }
        return nodo;
    }

    private NodoArbol cambiarPorMenor(NodoArbol nodoBorrar, NodoArbol nodoMenor) {
        if (nodoMenor.getDerecho() != null) {   // Seguir en subárbol derecho
            NodoArbol nuevoDer = this.cambiarPorMenor(nodoBorrar, nodoMenor.getDerecho());
            nodoMenor.setDerecho(nuevoDer);
            return nodoMenor;
        } else {  // Encontrado nodo menor inmediato
            nodoBorrar.setDato(nodoMenor.getDato()); // Cambiar datos de nodos
            return nodoMenor.getIzquierdo();  // Devolver subarbol izquierdo de menor inmediato
        }
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void preOrdenNivel() {
        System.out.println("Preorden con niveles: ");
        preOrdenNivelRec(raiz, 1);
    }

    private void preOrdenNivelRec(NodoArbol nodo, int nivel) {
        if (nodo != null) {
            System.out.println("Clave " + nodo.getClave() + ". En el nivel " + nivel);
            preOrdenNivelRec(nodo.getIzquierdo(), nivel + 1);
            preOrdenNivelRec(nodo.getDerecho(), nivel + 1);
        }
    }

    // ------------------------------------------------------------------------
    // TODO 3.2
    public ListaOrdinalAlumnos aLista() {
        ListaOrdinalAlumnos lista = new ListaOrdinalAlumnos();
        aLista(raiz, lista);
        return lista;
    }

    private void aLista(NodoArbol nodoArbol, ListaOrdinalAlumnos lista) {
        if (nodoArbol != null) {
            aLista(nodoArbol.getIzquierdo(), lista);
            lista.insertar(nodoArbol.getDato());
            aLista(nodoArbol.getDerecho(), lista);
        }
    }

    // ------------------------------------------------------------------------
    // TODO 3.3
    public Alumno getCalificacionMaxima(int minimaMat, int maximaMat) {
        Alumno alumno = null;
        return getCalificacionMaxima(alumno, minimaMat, maximaMat, raiz);
    }

    private Alumno getCalificacionMaxima(Alumno resultado, int min, int max, NodoArbol nodo) {
        if (nodo != null) {
            resultado = getCalificacionMaxima(resultado, min, max, nodo.getIzquierdo());
            if (nodo.getDato().getMatricula() >= min && nodo.getDato().getMatricula() <= max) {
                if (resultado != null) {
                    if (nodo.getDato().getCalificacion() > resultado.getCalificacion()) {
                        resultado = nodo.getDato();
                    }
                } else {
                    resultado = nodo.getDato();
                }
            }
            resultado = getCalificacionMaxima(resultado, min, max, nodo.getDerecho());
        }
        return resultado;
    }

    // ------------------------------------------------------------------------
    // TODO 3.4
    public double getCalificacionMedia(int minimaMat, int maximaMat) {
        double resultado = 0.0;
        int numAlumnos = contador(minimaMat, maximaMat, 0, raiz);
        return getCalificacionMedia(minimaMat, maximaMat, resultado, raiz, numAlumnos);
    }

    private double getCalificacionMedia(int minimaMat, int maximaMat, double resultado, NodoArbol nodo, int numAlumnos) {
        if (nodo != null) {
            resultado = getCalificacionMedia(minimaMat, maximaMat, resultado, nodo.getIzquierdo(), numAlumnos);
            if (nodo.getDato().getMatricula() >= minimaMat && nodo.getDato().getMatricula() <= maximaMat) {
                resultado += nodo.getDato().getCalificacion();
            }
            resultado = getCalificacionMedia(minimaMat, maximaMat, resultado, nodo.getDerecho(), numAlumnos);
        }
        if (nodo == raiz && resultado != 0.0) {
            resultado = resultado / numAlumnos;
        }
        return resultado;
    }

    private int contador(int minimaMat, int maximaMat, int contador, NodoArbol nodo) {
        if (nodo != null) {
            contador = contador(minimaMat, maximaMat, contador, nodo.getIzquierdo());
            if (nodo.getDato().getMatricula() >= minimaMat && nodo.getDato().getMatricula() <= maximaMat) {
                contador++;
            }
            contador = contador(minimaMat, maximaMat, contador, nodo.getDerecho());
        }
        return contador;
    }

    // ------------------------------------------------------------------------
    // TODO 3.5
    public boolean esEquilibrado() {
        int aIzq = getAltura(raiz.getIzquierdo(), 0);
        int aDer = getAltura(raiz.getDerecho(), 0);
        int valor = aIzq - aDer;
        return (valor == 0 || valor == 1 || valor == -1);
    }

    private int getAltura(NodoArbol nodo, int altura) {
        if (nodo != null) {
            if (nodo.getIzquierdo() != null || nodo.getDerecho() != null) {

            }
            if (nodo.getIzquierdo() == null && nodo.getDerecho() != null) {
                altura = getAltura(nodo.getDerecho(), altura);
            } else if (nodo.getDerecho() == null && nodo.getIzquierdo() != null) {
                altura = getAltura(nodo.getIzquierdo(), altura);
            } else if (nodo.getIzquierdo() != null && nodo.getDerecho() != null) {
                altura = getAltura(nodo.getDerecho(), altura) + getAltura(nodo.getIzquierdo(), altura);
            }
            altura++;
        }
        return altura;
    }

}
