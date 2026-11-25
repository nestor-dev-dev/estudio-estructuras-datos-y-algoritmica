import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir){
            System.out.println("Elige la opción:\n" +
                    "   1-Ejercicio 1\n" +
                    "   2-Ejercicio 2\n" +
                    "   3-Ejercicio 3\n" +
                    "   4-Ejercicio 4\n" +
                    "   5-Ejercicio 5\n" +
                    "   6-Ejercicio 6\n" +
                    "   7-Ejercicio 7\n" +
                    "   8-Ejercicio 8\n" +
                    "   9-Ejercicio 9\n" +
                    "   10-Ejercicio 10\n" +
                    "   11-Ejercicio 11\n" +
                    "   12-Ejercicio 12\n" +
                    "   13-Ejercicio 13\n" +
                    "   14-Ejercicio 14\n" +
                    "   15-Ejercicio 15\n" +
                    "   16-Ejercicio 16\n" +
                    "   17-Ejercicio 17\n" +
                    "   18-Ejercicio 18\n" +
                    "   19-Ejercicios de examen\n" +
                    "       Otro-Salir\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("Opción: ");
            int sw = sc.nextInt();

            switch (sw){
                case 1:
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    ejercicio1.ejectar();
                    break;
                case 2:
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.ejectar();
                    break;
                case 3:
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    ejercicio3.ejectar();
                    break;
                case 4:
                    Ejercicio4 ejercicio4 = new Ejercicio4();
                    ejercicio4.ejectar();
                    break;
                case 5:
                    Ejercicio5 ejercicio5 = new Ejercicio5();
                    ejercicio5.ejectar();
                    break;
                case 6:
                    Ejercicio6 ejercicio6 = new Ejercicio6();
                    ejercicio6.ejectar();
                    break;
                case 7:
                    Ejercicio7 ejercicio7 = new Ejercicio7();
                    ejercicio7.ejectar();
                    break;
                case 8:
                    Ejercicio8 ejercicio8 = new Ejercicio8();
                    ejercicio8.ejectar();
                    break;
                case 9:
                    Ejercicio9 ejercicio9 = new Ejercicio9();
                    ejercicio9.ejectar();
                    break;
                case 10:
                    Ejercicio10 ejercicio10 = new Ejercicio10();
                    ejercicio10.ejectar();
                    break;
                case 11:
                    Ejercicio11 ejercicio11 = new Ejercicio11();
                    ejercicio11.ejectar();
                    break;
                case 12:
                    Ejercicio12 ejercicio12 = new Ejercicio12();
                    ejercicio12.ejectar();
                    break;
                case 13:
                    Ejercicio13 ejercicio13 = new Ejercicio13();
                    ejercicio13.ejectar();
                    break;
                case 14:
                    Ejercicio14 ejercicio14 = new Ejercicio14();
                    ejercicio14.ejectar();
                    break;
                case 15:
                    Ejercicio15 ejercicio15 = new Ejercicio15();
                    ejercicio15.ejectar();
                    break;
                case 16:
                    Ejercicio16 ejercicio16 = new Ejercicio16();
                    ejercicio16.ejectar();
                    break;
                case 17:
                    Ejercicio17 ejercicio17 = new Ejercicio17();
                    ejercicio17.ejectar();
                    break;
                case 18:
                    Ejercicio18 ejercicio18 = new Ejercicio18();
                    ejercicio18.ejectar();
                    break;
                case 19:
                    EjerciciosExamen ejerciciosExamen = new EjerciciosExamen();
                    ejerciciosExamen.ejecutar();
                    break;
                default:
                    System.out.println("Chúpame el nabo");
                    seguir=false;
                    break;
            }
        }
    }
}
