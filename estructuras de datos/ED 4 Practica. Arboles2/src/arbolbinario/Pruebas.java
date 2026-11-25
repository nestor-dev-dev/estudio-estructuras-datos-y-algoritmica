package arbolbinario;

public class Pruebas {

    public static void main(String[] args) {
        System.out.println("********** PRUEBAS ARBOL BINARIO DE EXPRESION **********");

        Arbol arbol = new Arbol("52+83-*4/");
        arbol.mostrarExpresion();
        System.out.println("\nEl resultado es: ");
        System.out.println(arbol.calcularValor() + "\n");

        Arbol arbol1 = new Arbol("92+3+4*");
        arbol1.mostrarExpresion();
        System.out.println("\nEl resultado es: ");
        System.out.println(arbol1.calcularValor() + "\n");

        Arbol arbol2 = new Arbol("29*37-5*+8/");
        arbol2.mostrarExpresion();
        System.out.println("\nEl resultado es: ");
        System.out.println(arbol2.calcularValor() + "\n");
    }
}

