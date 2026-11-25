import java.util.TreeSet;

public class SorteoPrimitivaBiblioteca {

    public static void main(String[] args) {
        final int NUMEROS_PRIMITIVA = 6;
        final int MAXIMO_PRIMITIVA = 49;
        TreeSet<Integer> primitiva = new TreeSet<Integer>();
        while (primitiva.size() < NUMEROS_PRIMITIVA) {
            int numero = (int)(Math.random() * MAXIMO_PRIMITIVA) + 1;
            primitiva.add(numero);
        }
        System.out.print("Resultado de la primitiva: ");
        System.out.println(primitiva.toString());
        if (primitiva.contains(MAXIMO_PRIMITIVA)) {
            System.out.println("Contiene el número mayor");
        }
    }
}
