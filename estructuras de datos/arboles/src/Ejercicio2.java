import java.util.Scanner;

public class Ejercicio2 {
    public void ejecutar(){
        Arbol a1 = new Arbol(4);
        Arbol a2 = new Arbol(5);
        Arbol a = new Arbol(3, a1, a2);

        a.preOrden();
        a.mostrar();

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int x = sc.nextInt();

        if(a.contieneEnHoja(x)){
            System.out.println("El dato esta contenido en hoja");
        }else{
            System.out.println("El dato no esta contenido en hoja");
        }
    }
}
