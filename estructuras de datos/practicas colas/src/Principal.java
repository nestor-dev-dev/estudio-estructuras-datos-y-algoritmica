import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        boolean ejec=true;
        while (ejec){
            System.out.println("Elige la opción:\n" +
                    "   1-Ejercicio 1\n" +
                    "   2-Ejercicio 2\n" +
                    "   3-Ejercicio 3\n" +
                    "   4-Ejercicio 4\n" +
                    "   5-Ejercicio 5\n" +
                    "   6-Ejercicio 6\n" +
                    "   7-Ejercicio 7\n" +
                    "OTRO-Salir");
            System.out.println("Opción: ");
            Scanner scan = new Scanner(System.in);
            int sw = scan.nextInt();
            switch (sw){
                case 1:
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    ejercicio1.ejecutar();
                    break;
                case 2:
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.ejecutar();
                    break;
                case 3:
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    ejercicio3.ejecutar();
                    break;
                case 4:
                    Ejercicio4 ejercicio4 = new Ejercicio4();
                    ejercicio4.ejecutar();
                    break;
                case 5:
                    Ejercicio5 ejercicio5 = new Ejercicio5();
                    ejercicio5.ejecutar();
                    break;
                case 6:
                    Ejercicio6 ejercicio6 = new Ejercicio6();
                    ejercicio6.ejecutar();
                    break;
                case 7:
                    Ejercicio7 ejercicio7 = new Ejercicio7();
                    ejercicio7.ejecutar();
                    break;
                default:
                    System.out.println("A tomar por culo.");
                    ejec=false;
                    break;
            }
        }
    }
}
