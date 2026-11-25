package arbolbusqueda;

public class Pruebas {

    // Pruebas ------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("-------------- Arbol binario de busqueda ------------");

        ArbolBinarioBusqueda arbolBinarioBusqueda = new ArbolBinarioBusqueda();

        arbolBinarioBusqueda.insertar(new Alumno("Alicia Blazquez Martín", 5622, 10.0));
        arbolBinarioBusqueda.insertar(new Alumno("Pedro Jimenez del Pozo", 8510, 3.0));
        arbolBinarioBusqueda.insertar(new Alumno("Adriana Torres", 2345, 7.0));
        arbolBinarioBusqueda.insertar(new Alumno("Felipe Garcia", 1253, 5.3));
        arbolBinarioBusqueda.insertar(new Alumno("Eduardo Parra Martín", 8765, 6.7));
        arbolBinarioBusqueda.insertar(new Alumno("Diego Perez Gonzalez", 8135, 8.0));
        arbolBinarioBusqueda.insertar(new Alumno("Mar Hernando Lopez", 8217, 6.3));

        arbolBinarioBusqueda.aLista().mostrar();

        System.out.println("\n El alumno con la calificacion maxima cuya matricula esta comprendida entre 5000 y 8500 es:");
        if (arbolBinarioBusqueda.getCalificacionMaxima(5000, 8500) == null) {
            System.out.println("NUll");
        } else {
            arbolBinarioBusqueda.getCalificacionMaxima(5000, 8500).mostrar();
        }

        System.out.println("La calificación media de los alumnos cuya matricula esta comprendida entre 5000 y 8500 es:");
        System.out.println(arbolBinarioBusqueda.getCalificacionMedia(5000, 8500));

        System.out.println("\n El alumno con la calificacion maxima cuya matricula esta comprendida entre 500 y 1000 es:");
        if (arbolBinarioBusqueda.getCalificacionMaxima(500, 1000) == null) {
            System.out.println("NUll");
        } else {
            arbolBinarioBusqueda.getCalificacionMaxima(500, 1000).mostrar();
        }

        System.out.println("La calificación media de los alumnos cuya matricula esta comprendida entre 500 y 1000 es:");
        System.out.println(arbolBinarioBusqueda.getCalificacionMedia(500, 1000));

        System.out.println("¿El arbol es equilibrado? " + arbolBinarioBusqueda.esEquilibrado());

    }
}
