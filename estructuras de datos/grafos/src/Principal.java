import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir =true;

        while (seguir){
            System.out.println("Elige la opcion:\n" +
                    "\t0-Ejercicio de preueba\n" +
                    "\t1-Ejercicio 1\n" +
                    "\t2-Ejercicio 2\n" +
                    "\t16-Examen 1\n" +
                    "\t17-Examen 2\n" +
                    "\t\tOTRO-Salir\n");

            int x = sc.nextInt();

            switch (x){
                case 0:
                    EjercicioPrueba ejercicioPrueba = new EjercicioPrueba();
                    ejercicioPrueba.ejecutar();
                    break;
                case 1:
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    ejercicio1.ejecutar();
                    break;
                case 2:
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.ejecutar();
                    break;
                case 16:
                    Examen1 examen1 = new Examen1();
                    examen1.ejecutar();
                    break;
                case 17:
                    Examen2 examen2 = new Examen2();
                    examen2.ejecutar();
                    break;
                default:
                    System.out.println("Bai bai madafaka");
                    seguir=false;
                    break;
            }
        }
    }
}
