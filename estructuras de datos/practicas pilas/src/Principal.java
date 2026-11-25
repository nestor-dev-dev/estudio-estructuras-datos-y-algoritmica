import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        boolean b = true;
        while (b){
            System.out.println("\n\nELIGE LA OPCIÓN:\n" +
                    "   1-Ejercicio 1:\n" +
                    "   2-Ejercicio 2:\n" +
                    "   3-Ejercicio 3:\n" +
                    "   4-Ejercicio 4:\n" +
                    "   5-Ejercicio 5:\n" +
                    "   6-Ejercicio 6:\n" +
                    "   7-Ejercicio 7:\n" +
                    "   8-Ejercicio 8:\n" +
                    "   9-Ejercicio 9:\n" +
                    "   10-Ejercicio 10:\n" +
                    "   11-Ejercicio de examen\n" +
                    "       Otro-Salir\n" +
                    "\nOpción: ");
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
                case 8:
                    Ejercicio8 ejercicio8 = new Ejercicio8();
                    ejercicio8.ejecutar();
                    break;
                case 9:
                    Ejercicio9 ejercicio9 = new Ejercicio9();
                    ejercicio9.ejecutar();
                    break;
                case 10:
                    Ejercicio10 ejercicio10 = new Ejercicio10();
                    ejercicio10.ejecutar();
                    break;
                case 11:
                    EjerciciosExamen ejerciciosExamen = new EjerciciosExamen();
                    ejerciciosExamen.ejecutar();
                    break;
                default:
                    System.out.println("Vayase a la mierda");
                    b = false;
                    break;
            }
        }
    }
}
