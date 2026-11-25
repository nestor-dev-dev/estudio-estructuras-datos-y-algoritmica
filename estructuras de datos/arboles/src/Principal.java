import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir=true;

        while (seguir){
            System.out.println("Selecciona la opcion:\n" +
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
                    "   11-Ejercicio 11:\n" +
                    "   12-Ejercicio 12:\n" +
                    "   13-Ejercicio 13:\n" +
                    "   14-Ejercicio 14:\n" +
                    "   15-Ejercicio 15:\n" +
                    "   16-Ejercicio 16:\n" +
                    "   17-Ejercicio 17:\n" +
                    "   18-Ejercicio 18:\n" +
                    "   19-Ejercicio 19:\n" +
                    "   20-Ejercicio 20:\n" +
                    "   21-Ejercicio extra:\n" +
                    "       Otro-Salir");

            int sw = sc.nextInt();

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
                    Ejercicio11 ejercicio11 = new Ejercicio11();
                    ejercicio11.ejecutar();
                    break;
                case 12:
                    Ejercicio12 ejercicio12 = new Ejercicio12();
                    ejercicio12.ejecutar();
                    break;
                case 13:
                    Ejercicio13 ejercicio13 = new Ejercicio13();
                    ejercicio13.ejecutar();
                    break;
                case 14:
                    Ejercicio14 ejercicio14 = new Ejercicio14();
                    ejercicio14.ejecutar();
                    break;
                case 15:
                    Ejercicio15 ejercicio15 = new Ejercicio15();
                    ejercicio15.ejecutar();
                    break;
                case 16:
                    Ejercicio16 ejercicio16 = new Ejercicio16();
                    ejercicio16.ejecutar();
                    break;
                case 17:
                    Ejercicio17 ejercicio17 = new Ejercicio17();
                    ejercicio17.ejecutar();
                    break;
                case 18:
                    Ejercicio18 ejercicio18 = new Ejercicio18();
                    ejercicio18.ejecutar();
                    break;
                case 19:
                    Ejercicio19 ejercicio19 = new Ejercicio19();
                    ejercicio19.ejecutar();
                    break;
                case 20:
                    Ejercicio20 ejercicio20 = new Ejercicio20();
                    ejercicio20.ejecutar();
                    break;
                case 21:
                    EjercicioExtra ejercicioExtra = new EjercicioExtra();
                    ejercicioExtra.ejecutar();
                    break;
                default:
                    seguir=false;
                    break;
            }
        }
    }
}