import jdk.jshell.spi.SPIResolutionException;

import java.util.ArrayDeque;

public class Arbol {
    private NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public Arbol(int dato) {
        raiz = new NodoArbol(dato);
    }

    public Arbol(int dato, Arbol izquierdo, Arbol derecho) {
        NodoArbol nodoIzq = null;
        NodoArbol nodoDer = null;
        if (izquierdo != null) {
            nodoIzq = izquierdo.raiz;
        }
        if (derecho != null) {
            nodoDer = derecho.raiz;
        }
        raiz = new NodoArbol(dato, nodoIzq, nodoDer);
    }

    /**
     * Recorrido en preorden
     */
    public void preOrden() {
        System.out.print("Preorden: ");
        this.preOrdenRec(raiz);
        System.out.println();
    }

    private void preOrdenRec(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + "  ");
            this.preOrdenRec(nodo.getIzquierdo());
            this.preOrdenRec(nodo.getDerecho());
        }
    }

    /**
     * Recorrido en orden central
     */
    public void ordenCentral() {
        System.out.print("Orden Central: ");
        this.ordenCentralRec(raiz);
        System.out.println();
    }

    private void ordenCentralRec(NodoArbol nodo) {
        if (nodo != null) {
            this.ordenCentralRec(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + "  ");
            this.ordenCentralRec(nodo.getDerecho());
        }
    }

    /**
     * Recorrido en postorden
     */
    public void postOrden() {
        System.out.print("Postorden: ");
        this.postOrdenRec(raiz);
        System.out.println();
    }

    private void postOrdenRec(NodoArbol nodo) {
        if (nodo != null) {
            this.postOrdenRec(nodo.getIzquierdo());
            this.postOrdenRec(nodo.getDerecho());
            System.out.print(nodo.getDato() + "  ");
        }
    }

    /**
     * Recorrido en amplitud con una cola de nodos del árbol
     */
    public void amplitud() {
        Cola cola = new Cola();
        System.out.print("Amplitud: ");
        if (raiz != null) {
            cola.encolar(raiz);
            while (!cola.vacia()) {
                NodoArbol nodo = cola.desencolar();
                System.out.print(nodo.getDato() + "  ");
                if (nodo.getIzquierdo() != null) {
                    cola.encolar(nodo.getIzquierdo());
                }
                if (nodo.getDerecho() != null) {
                    cola.encolar(nodo.getDerecho());
                }
            }
        }
        System.out.println();
    }

    /**
     * Recorrido en amplitud con una cola proporcionada por la clase ArrayDeque
     */
    public void amplitud2() {
        ArrayDeque<NodoArbol> cola = new ArrayDeque<NodoArbol>();
        System.out.print("Amplitud: ");
        if (raiz != null) {
            cola.add(raiz);
            while (!cola.isEmpty()) {
                NodoArbol nodo = cola.remove();
                System.out.print(nodo.getDato() + "  ");
                if (nodo.getIzquierdo() != null) {
                    cola.add(nodo.getIzquierdo());
                }
                if (nodo.getDerecho() != null) {
                    cola.add(nodo.getDerecho());
                }
            }
        }
        System.out.println();
    }

    /**
     * Ejemplo: método que recorre el árbol para determinar si contiene un dato.
     */
    public boolean contiene(int dato) {
        return this.contieneRec(raiz, dato);
    }

    private boolean contieneRec(NodoArbol nodo, int dato) {
        // Búsqueda por preorden
        boolean resul;
        if (nodo == null) {
            resul = false;
        } else if (nodo.getDato() == dato) {
            resul = true;
        } else {
            resul = this.contieneRec(nodo.getIzquierdo(), dato);
            if (!resul) {
                resul = this.contieneRec(nodo.getDerecho(), dato);
            }
        }
        return resul;
    }


    public int suma() {
        return this.sumaRec(raiz);
    }

    private int sumaRec(NodoArbol nodo) {
        if (nodo == null) {
            return 0;
        } else {
            return nodo.getDato() + this.sumaRec(nodo.getIzquierdo()) + this.sumaRec(nodo.getDerecho());
        }
    }


    public void preOrdenNivel() {
        System.out.println("Preorden con niveles: ");
        preOrdenNivelRec(raiz, 1);
    }

    private void preOrdenNivelRec(NodoArbol nodo, int nivel) {
        if (nodo != null) {
            System.out.println(nodo.getDato() + " en el nivel " + nivel);
            preOrdenNivelRec(nodo.getIzquierdo(), nivel + 1);
            preOrdenNivelRec(nodo.getDerecho(), nivel + 1);
        }
    }

    // ------------------------------------------------------------------------
    // 2.3
    private int pasarAEntero(char c) {
        return Character.getNumericValue(c);
    }

    private boolean esOperador(char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
            default:
                return false;
        }
    }

    private boolean esDigito(char c) {
        return (c >= '0' && c <= '9');
    }

    // ------------------------------------------------------------------------
    // TODO 2.3
    public Arbol(String cadena) {
    }

    // ------------------------------------------------------------------------
    // TODO 2.4
    public void mostrarExpresion() {

    }

    // ------------------------------------------------------------------------
    // TODO 2.5
    public double calcularValor() {
        return 0.0;
    }

    //MIS MIERDAS-------------------------------------------------------------------------------

    public void insertarDerecho(int n){
        NodoArbol a = new NodoArbol(n);
        raiz.setDerecho(a);
        raiz.setNumElementos(raiz.getNumElementos()+1);
    }

    public void insertarIzquierdo(int n){
        NodoArbol a = new NodoArbol(n);
        raiz.setIzquierdo(a);
        raiz.setNumElementos(raiz.getNumElementos()+1);
    }


    public int getNumElementos(){
        return raiz.getNumElementos();
    }

    public boolean contieneEnHoja(int dato){
        boolean res=false;
        if(raiz != null){
            res = contieneEnHojaRec(dato, raiz);
        }
        return res;
    }

    private boolean contieneEnHojaRec(int dato, NodoArbol nodo){
        boolean res=false;
        if(nodo != null){
            if(nodo.getDerecho() == null && nodo.getIzquierdo() == null){
                //estamos en una hoja
                if(nodo.getDato() == dato){
                    res=true;
                }
            }else{
                res = contieneEnHojaRec(dato, nodo.getIzquierdo());
                if(res == false){
                    res = contieneEnHojaRec(dato, nodo.getDerecho());
                }
            }
        }
        return res;
    }

    public int numHojas(){
        return numHojasRec(raiz);
    }

    private int numHojasRec(NodoArbol nodo){
        if(nodo.getDerecho() == null && nodo.getIzquierdo() == null){
            //estamos en hoja
            return 1;
        }else {
            return numHojasRec(nodo.getDerecho())+numHojasRec(nodo.getIzquierdo());
        }
    }

    public int sumaDatosImparesConDosHijos(){
        return sumaDatosImparesConDosHijosRec(raiz);
    }

    private int sumaDatosImparesConDosHijosRec(NodoArbol nodo){
        if(nodo.getDerecho() != null && nodo.getIzquierdo() != null){
            //tiene dos hijos
            int res=0;
            if(nodo.getDato()%2 != 0){
                //es impar
                res=nodo.getDato();
            }
            return res;
        }else {
            if(nodo.getIzquierdo() == null){
                return sumaDatosImparesConDosHijosRec(nodo.getDerecho());
            }else if(nodo.getDerecho() == null){
                return sumaDatosImparesConDosHijosRec(nodo.getIzquierdo());
            }else{
                return sumaDatosImparesConDosHijosRec(nodo.getIzquierdo())
                        +sumaDatosImparesConDosHijosRec(nodo.getDerecho());
            }
        }
    }

    public boolean igual(Arbol a){
        return igualRec(raiz, a.raiz);
    }

    private boolean igualRec(NodoArbol n1, NodoArbol n2){
        if(n1 != null && n2 != null){
            if(n1.getDato() == n2.getDato()){
                return (igualRec(n1.getDerecho(), n2.getDerecho()) &&
                        igualRec(n1.getIzquierdo(), n2.getIzquierdo()));
            }else {
                return false;
            }
        }else if(n1 != null){//n2 es nulo pero n1 no
            return false;
        }else if(n2 != null){//n1 es nulo pero n2 no
            return false;
        }else{
            //ambos nodos apuntan a null
            return true;
        }
    }

    public int sumaDatosNivel(int nivel){
        return sumaDatosNivelRec(nivel, raiz, 1);
    }

    private int sumaDatosNivelRec(int nivel, NodoArbol nodo, int x){
        int suma=0;
        if(nodo != null){
            if(x == nivel){
                suma=nodo.getDato();
            }else{
                suma = sumaDatosNivelRec(nivel, nodo.getIzquierdo(), x+1)+
                        sumaDatosNivelRec(nivel, nodo.getDerecho(), x+1);
            }
        }
        return suma;
    }

    public void mostrar(){
        int x = raiz.getNumElementos();

        int n=ajustarNumElementos(x, 0);
        //formulas extraídas mediante análisis matemático
        int ancho = (n-1)/2+1;
        int alto = (int)(Math.log(ancho)/Math.log(2)+1);

        int[][] matriz = new int[alto][ancho];
        inicializar(matriz, alto, ancho);

        insertarDatosNivel(matriz, raiz, ancho, alto);

        mostrarMatriz(matriz, alto, ancho);
    }

    private int ajustarNumElementos(int n, int iteracon){
        int res;
        //formula extraida mediante analisi matemático
        res=1+(int)Math.pow(2, iteracon);
        if(n == res){
            return res;
        }else if(n > res){
            res=ajustarNumElementos(n, iteracon+1);

            return res;
        }else{
            //n<res
            return res;
        }
    }

    private void insertarDatosNivel(int[][] matriz, NodoArbol nodo, int ancho, int alto){
        if(nodo == raiz){
            matriz[0][0] = sacarDato(raiz);
            insertarDatosNivelRec(matriz, nodo.getIzquierdo(), 1, ancho-1, alto-1);
            insertarDatosNivelRec(matriz, nodo.getDerecho(), 1, ancho-1, alto-1);
        }

    }

    private void insertarDatosNivelRec(int[][] matriz, NodoArbol nodo, int fila, int colLimite, int filaLimite){
        //averiguar donde va la siguente columna
        int cont=0;
        int columna=0;
        boolean seguir=true;
        while (seguir){
            if(cont == colLimite){
                columna=colLimite;
                seguir=false;
            }else{
                if(matriz[fila][cont] == -9999){
                    seguir=false;
                    columna=cont;
                }else{
                    cont++;
                }
            }
        }

        matriz[fila][columna]=sacarDato(nodo);

        if(fila != filaLimite){
            if(nodo.getIzquierdo() != null){
                insertarDatosNivelRec(matriz, nodo.getIzquierdo(), fila+1, colLimite, filaLimite);
            }else{
                insertarNulo(matriz, fila+1, colLimite);
                NodoArbol aux = new NodoArbol(-9998);
                nodo=aux;
            }

            if(nodo.getDerecho() != null){
                insertarDatosNivelRec(matriz, nodo.getDerecho(), fila+1, colLimite, filaLimite);
            }else{
                insertarNulo(matriz, fila+1, colLimite);
                NodoArbol aux = new NodoArbol(-9998);
                nodo=aux;
            }

        }

    }

    private void insertarNulo(int[][] matriz, int fila, int colLimite){
        //averiguar donde va la siguente columna
        int cont=0;
        int columna=0;
        boolean seguir=true;
        while (seguir){
            if(cont == colLimite){
                columna=colLimite;
                seguir=false;
            }else{
                if(matriz[fila][cont] == -9999){
                    seguir=false;
                    columna=cont;
                }else{
                    cont++;
                }
            }
        }

        matriz[fila][columna]=-9998;
    }

    private void inicializar(int[][] matriz, int alto, int ancho){
        for(int i=0; i<alto; i++){
            for(int j=0; j<ancho; j++){
                matriz[i][j] = -9999;
            }
        }
    }

    private void mostrarMatriz(int[][] matriz, int alto, int ancho){
        for(int i=0; i<alto; i++){
            for(int j=0; j<ancho; j++){
                if(matriz[i][j] == -9999){
                    System.out.print("  ");
                }else if(matriz[i][j] == -9998){
                    System.out.print("X ");
                }else{
                    System.out.print(matriz[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }



    private int sacarDato(NodoArbol nodo){
        if(nodo == null) {
            return -9998;
        }else{
            return nodo.getDato();
        }
    }

    public void altura(){
        System.out.println("La altura del arbol es: "+alturaRec(raiz));
    }

    private int alturaRec(NodoArbol nodo){
        if(nodo.getIzquierdo() == null && nodo.getDerecho() == null){
            return 1;
        }else{
            int x=0, y=0;
            if(nodo.getIzquierdo() != null){
                x=alturaRec(nodo.getIzquierdo())+1;
            }

            if(nodo.getDerecho() != null){
                x=alturaRec(nodo.getDerecho())+1;
            }

            int res;
            if(x > y){
                res=x;
            }else{
                res=y;
            }

            return res;
        }
    }

    public void completar2Hijos(){
        completar2HijosRec(raiz, 1);
    }

    private void completar2HijosRec(NodoArbol nodo, int nivel){
        //localizar nodo a completar
        if((nodo.getDerecho() == null && nodo.getIzquierdo() != null) || (nodo.getDerecho() != null && nodo.getIzquierdo() == null)){
            NodoArbol nuevo = new NodoArbol(nivel);
            if(nodo.getDerecho() == null){
                nodo.setDerecho(nuevo);
                completar2HijosRec(nodo.getIzquierdo(), nivel+1);
            }else{
                nodo.setIzquierdo(nuevo);
                completar2HijosRec(nodo.getDerecho(), nivel+1);
            }
        }else{
            if(nodo.getIzquierdo() != null && nodo.getDerecho() != null){
                completar2HijosRec(nodo.getIzquierdo(), nivel+1);
                completar2HijosRec(nodo.getDerecho(), nivel+1);
            }
        }
    }

    public int sumHojNiv(int n){
        return sumHojNivRec(n, raiz, 1);
    }

    private int sumHojNivRec(int n, NodoArbol nodo, int nivel){
        int res=0;
        if(nivel == n){
            if(nodo != null){
                //comprobar si es hoja
                if(nodo.getDerecho() == null && nodo.getIzquierdo() == null){
                    res=nodo.getDato();
                }
            }
        }else{
            if(nodo != null){
                res+=sumHojNivRec(n, nodo.getIzquierdo(), nivel+1);
                res+=sumHojNivRec(n, nodo.getDerecho(), nivel+1);
            }
        }
        return res;
    }
}
