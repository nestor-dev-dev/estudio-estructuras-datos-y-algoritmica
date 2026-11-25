public class SorteoPrimitiva {

    public static void main(String[] args) {
        final int NUMEROS_PRIMITIVA = 6;
        final int MAXIMO_PRIMITIVA = 49;
        Conjunto primitiva = new Conjunto(NUMEROS_PRIMITIVA);
        while (primitiva.cardinalidad() < NUMEROS_PRIMITIVA) {
            int numero = (int) (Math.random() * MAXIMO_PRIMITIVA) + 1;
            primitiva.insertar(numero);
        }
        System.out.print("Resultado de la primitiva: ");
        primitiva.mostrar();
        if (primitiva.contiene(MAXIMO_PRIMITIVA)) {
            System.out.println("Contiene el número mayor");
        }
        Conjunto copia = primitiva.copia();
        copia.eliminar(copia.getElemento(0));
        System.out.print("En la copia borramos al menor: ");
        copia.mostrar();
        System.out.print("Pero la primitiva original sigue igual: ");
        primitiva.mostrar();
    }
}
