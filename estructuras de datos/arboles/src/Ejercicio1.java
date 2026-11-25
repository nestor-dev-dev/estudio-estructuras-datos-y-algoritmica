import java.util.Scanner;

public class Ejercicio1 {
    public void ejecutar(){
        Arbol a = new Arbol(3);
        a.insertarDerecho(4);
        a.insertarIzquierdo(5);

        a.preOrden();
        a.mostrar();

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int x = sc.nextInt();

        if(a.contiene(x)){
            System.out.println("El dato esta en el arbol");
        }else{
            System.out.println("El dato no esta en el arbol");
        }
    }
}
