public class Conjunto {
    private static final int MAXIMO_DEFECTO = 10;

    private int[] datos;
    private final int MAXIMO;
    private int numElementos;

    public Conjunto(int maximo) {
        this.MAXIMO = maximo;
        datos = new int[MAXIMO];
        numElementos = 0;
    }

    public Conjunto() {
        this(MAXIMO_DEFECTO);
    }

    public boolean vacio() {
        return numElementos == 0;
    }

    public int cardinalidad() {
        return numElementos;
    }

    public boolean contiene(int valor) {
        int posicion = 0;
        while (posicion < numElementos && datos[posicion] < valor) {
            posicion++;
        }
        return posicion < numElementos && datos[posicion] == valor;
    }

    public boolean insertar(int valor) {
        if (numElementos < MAXIMO) {
            int posicion = 0;
            while (posicion < numElementos && datos[posicion] < valor) {
                posicion++;
            }
            if (posicion == numElementos || datos[posicion] > valor) {  // Insertar en posicion
                for (int i = numElementos - 1; i >= posicion; i--) {
                    datos[i + 1] = datos[i];
                }
                datos[posicion] = valor;
                numElementos++;
                return true;
            } else {   // Elemento repetido
                return false;
            }
        } else {  // No cabe en el array
            return false;
        }
    }

    public int insertar(int[] vector) {
        int numInsertados = 0;
        for (int i = 0; i < vector.length; i++) {
            if (this.insertar(vector[i])) {
                numInsertados++;
            }
        }
        return numInsertados;
    }

    public boolean eliminar(int valor) {
        int posicion = 0;
        while (posicion < numElementos && datos[posicion] < valor) {
            posicion++;
        }
        if (posicion < numElementos && datos[posicion] == valor) {
            for (int i = posicion + 1; i < numElementos; i++) {
                datos[i - 1] = datos[i];
            }
            numElementos--;
            return true;
        } else {
            return false;
        }
    }

    public void mostrar() {
        System.out.print("[");
        for(int i = 0; i < numElementos - 1; i++) {
            System.out.print(datos[i] + ", ");
        }
        if (numElementos > 0) {
            System.out.print(datos[numElementos - 1]);
        }
        System.out.println("]");
    }

    public int getElemento(int posicion) {
        return datos[posicion];
    }

    public Conjunto copia(){
        Conjunto resultado = new Conjunto(MAXIMO);
        for (int i = 0; i < numElementos; i++) {
            resultado.insertar(datos[i]);
        }
        return resultado;
    }

    public void unir(Conjunto conjunto) {
        for (int i = 0; i < conjunto.cardinalidad(); i++) {
            this.insertar(conjunto.getElemento(i));
        }
    }

    public Conjunto union(Conjunto conjunto) {
        Conjunto resultado = new Conjunto(MAXIMO + conjunto.MAXIMO);
        for (int i = 0; i < numElementos; i++) {
            resultado.insertar(datos[i]);
        }
        for (int i = 0; i < conjunto.cardinalidad(); i++) {
            resultado.insertar(conjunto.getElemento(i));
        }
        return resultado;
    }

    public boolean iguales(Conjunto conjunto) {
        if (this.cardinalidad() != conjunto.cardinalidad()) {
            return false;
        } else {
            int posicion = 0;
            boolean iguales = true;
            while (posicion < numElementos &&
                    this.getElemento(posicion) == conjunto.getElemento(posicion)) {
                posicion++;
            }
            return posicion == numElementos;
        }
    }

    public Conjunto interseccion(Conjunto conjunto){
        Conjunto resultado = new Conjunto(Math.min(MAXIMO, conjunto.MAXIMO));
        for (int i = 0; i < numElementos; i++) {
            if (conjunto.contiene(datos[i])) {
                resultado.insertar(datos[i]);
            }
        }
        return resultado;
    }

    public boolean contiene(Conjunto conjunto) {
        return this.interseccion(conjunto).cardinalidad() ==
                conjunto.cardinalidad();
    }

    public boolean iguales2(Conjunto conjunto) {
        return this.contiene(conjunto) && conjunto.contiene(this);
    }

    public boolean iguales3(Conjunto conjunto) {
        return this.union(conjunto).cardinalidad() ==
                 this.interseccion(conjunto).cardinalidad();
    }

    public Conjunto diferencia(Conjunto conjunto) {
        Conjunto resultado = this.copia();
        for (int i = 0; i < conjunto.cardinalidad(); i++) {
            resultado.eliminar(conjunto.getElemento(i));
        }
        return resultado;
    }


}
