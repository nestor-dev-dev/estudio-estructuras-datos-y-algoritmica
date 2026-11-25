
public class Seguir_AETSISI {
    //NÉSTOR MATO COMPTE. IW.SI-T11
    private GrafoMA miREd;
    private Persona[] contactos;


    public Seguir_AETSISI(int n, Persona[] contactos) { //construye una matriz de nxn sin aristas
        miREd = new GrafoMA(n, true);
        this.contactos = contactos;
    }

    public int getNumPersonas() {
        return miREd.getNumVertices();
    }


    // MÉTODOS PARA INSERTAR Y ELIMINAR ARISTAS

    // ------------------------------------
// método que inserta una relación de seguir_a directa (una arista en el grafo)
    public void insertaRelacion(int o, int d) {
        miREd.insertarArista(o, d);
    }

    // método que elimina una relación de seguir_a directa (una arista en el grafo)
    public void eliminaRelacion(int o, int d) {
        miREd.eliminarArista(o, d);
    }

    // método que indica si existe una relación de seguir_a directa (una arista en el grafo)
    public boolean existeRelacion(int o, int d) {
        return miREd.existeArista(o, d);
    }

    //Metodo que compara dos cadenas que representan dos nombres ignorando mayusculas y minusculas
    private boolean nombresIguales(String cad1, String cad2) {
        return (cad1.equalsIgnoreCase(cad2));
    }


    // encuentra la posición asociado a un nombre de persona en la tabla de contactos que
    // ademas se corresponde con el vertice que le representa en el grafo

    public int devuelvePosNombre(String nombre) {
        int i = 0;
        boolean encontrado = false;
        while (i < contactos.length && !encontrado) {
            encontrado = nombresIguales(nombre, contactos[i].getNombre());
            if (!encontrado) i++;
        }
        // if (!miREd.verticeEnRango(i)) i=-1;//si ha salido por i= contactos.length no esta el nombre en la tabla
        if (!encontrado) i = -1;
        return i;
    }

    // Imprime la Matriz del relaciones( Matriz de adyacencia del grafo) por consola
    public void imprimirRelaciones() {
        System.out.println("Contenido de la matriz: ");
        System.out.print("  ");
        for (int i = 0; i < miREd.getNumVertices(); i++) {
            if (i < 10) System.out.print(" " + i + " ");
            else System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < miREd.getNumVertices(); i++) {
            if (i < 10) System.out.print(" " + i);
            else System.out.print(i);
            for (int j = 0; j < miREd.getNumVertices(); j++) {
                if (miREd.existeArista(i, j)) System.out.print(" S ");
                else System.out.print(" N ");
            }
            System.out.println();
        }
    }

    //Imprime la información de la red y la matriz de Relaciones por consola
    public void mostrarRed() {
        System.out.println("Existen " + miREd.getNumVertices() + " contactos: \n");
        for (int i = 0; i < miREd.getNumVertices(); i++)
            System.out.println(i + ": " + contactos[i].getNombre());
        imprimirRelaciones();
        System.out.println();
    }

// ------------------------------------

    // MÉTODOS A COMPLETAR

    // ------------------------------------


    public void mostrar() {
        miREd.mostrar();
    }


    // Apartado 2.2.1 Primer método


    public int contarGrupos() {
        int resul = 0;
        boolean[] visitados = new boolean[getNumPersonas()];
        for (int i = 0; i < getNumPersonas(); i++) {
            if (!visitados[i]) {
                miREd.recorridoEnProfundidad(i, visitados);
                resul++;
            }
        }
        return resul;
    }

    // Apartado 2.2.2 Segundo método
    public void mostrarSeguidosPorADirectamente(String nombre) {
        if (existeContacto(nombre)) {
            int j = 0;
            int posicion = devuelvePosNombre(nombre);
            boolean[] visitados = new boolean[getNumPersonas()];
            miREd.recorridoEnProfundidad(posicion, visitados);
            System.out.println("Seguidos por " + nombre + " (" + posicion + ")");
            for (int i = 0; i < getNumPersonas(); i++) {
                if (visitados[i] && miREd.existeArista(posicion, i)) {
                    System.out.println(j + ". " + contactos[i].getNombre());
                    j++;
                }
            }
        }

    }

    private boolean existeContacto(String nombre) {
        for (int i = 0; i < getNumPersonas(); i++) {
            if (nombresIguales(nombre, contactos[i].getNombre())) {
                return true;
            }
        }
        System.out.println("Contacto inexistente, pruebe con otro nombre.");
        return false;
    }

    // Apartado 2.2.3 Tercer método
    public void mostrarSeguidoresDirectoDe(String nombre) {
        if (existeContacto(nombre)) {
            int posicion = devuelvePosNombre(nombre);
            boolean[] visitados = new boolean[getNumPersonas()];
            miREd.recorridoEnProfundidad(posicion, visitados);
            System.out.println("Seguidos por " + nombre + " (" + posicion + ")");
            for (int i = 0; i < getNumPersonas(); i++) {
                if (visitados[i] && miREd.existeArista(i, posicion)) {
                    System.out.println(i + ". " + contactos[i].getNombre());
                }
            }
        }
    }

    // Apartado 2.2.4 Cuarto método
    public boolean sonDelMismoGrupo(Persona p, Persona p1) {
        int posicionP = devuelvePosNombre(p.getNombre());
        int posicionP1 = devuelvePosNombre(p1.getNombre());
        boolean[] visitados = new boolean[getNumPersonas()];
        miREd.recorridoEnProfundidad(posicionP, visitados);
        for (int i = 0; i < visitados.length; i++) {
            if (posicionP1 == i) {
                System.out.println(p.getNombre() + " (" + posicionP + ") es del mismo grupo que " + p1.getNombre() + " (" + posicionP1 + ")");
                return true;
            }
        }
        System.out.println(p.getNombre() + " (" + posicionP + ") no es del mismo grupo que " + p1.getNombre() + " (" + posicionP1 + ")");
        return false;
    }

    // Apartado 2.2.5 Quinto método
    public void motrarMiembrosGrupo(Persona p) {
        int posicionP = devuelvePosNombre(p.getNombre());
        boolean[] visitados = new boolean[getNumPersonas()];
        if (existeContacto(p.getNombre())) {
            miREd.recorridoEnProfundidadCadena(posicionP, visitados);
            for (int i = 0; i < getNumPersonas(); i++) {
                if (visitados[i] && !contactos[i].getNombre().equals(p.getNombre())) {
                    System.out.println(i + ". " + contactos[i].getNombre());
                }
            }
        }
    }

    // Apartado 2.2.6 sexto método
    public void motrarSeguidosPor(Persona p) {
        if (existeContacto(p.getNombre())) {
            int posicion = devuelvePosNombre(p.getNombre());
            boolean[] visitados = new boolean[getNumPersonas()];
            miREd.recorridoEnProfundidad(posicion, visitados);
            System.out.println("Seguidos por " + p.getNombre() + " (" + posicion + ")");
            for (int i = 0; i < getNumPersonas(); i++) {
                if (visitados[i] && !contactos[i].getNombre().equals(p.getNombre())) {
                    System.out.println(i + ". " + contactos[i].getNombre());
                }
            }
        }
    }

    // Apartado 2.2.7 séptimo método
    public boolean mostrarEsSeguidaPor(String nombre1, String nombre2) {
        boolean resul = false;
        if(existeContacto(nombre1) && existeContacto(nombre2)){
            int posicion1 = devuelvePosNombre(nombre1);
            int posicion2 = devuelvePosNombre(nombre2);
            boolean[] visitados = new boolean[getNumPersonas()];
            miREd.recorridoEnProfundidad(posicion1, visitados);
            for (int i = 0; i < visitados.length; i++) {
                if(i == posicion2){
                    return !resul;
                }
            }
        }
        return resul;
    }


    // Apartado 2.2.8 octavo método (opcional)
    public void mostrarSeguidoresDe(String nombre1) {
        if (existeContacto(nombre1)) {
            int posicion = devuelvePosNombre(nombre1);
            boolean[] visitados = new boolean[getNumPersonas()];
            miREd.recorridoEnProfundidad(posicion, visitados);
            System.out.println("Seguidos por " + nombre1 + " (" + posicion + ")");
            for (int i = 0; i < getNumPersonas(); i++) {
                if (visitados[i] && !contactos[i].getNombre().equals(nombre1)){
                    System.out.println(i + ". " + contactos[i].getNombre());
                }
            }
        }
    }
}
	  




