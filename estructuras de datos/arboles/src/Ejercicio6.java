import java.util.Scanner;

public class Ejercicio6 {
    public void ejecutar(){
        Arbol a1 = new Arbol(2);
        Arbol a2 = new Arbol(5);
        a1.insertarIzquierdo(3);
        a1.insertarDerecho(4);
        a2.insertarIzquierdo(6);
        a2.insertarDerecho(7);
        Arbol a = new Arbol(1, a1, a2);

        a.preOrden();
        a.mostrar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione un nivel: ");
        int x = sc.nextInt();

        System.out.println("El resultado de la suma es: "+a.sumaDatosNivel(x));
    }
}
