import Modulo2.Ejecutar2;
import Modulo3.Ejecutar3;
import Modulo4.Ejecutar4;
import Modulo5.Ejecutar5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;

        while (seguir){
            System.out.print("\nElige el tema que deseas practicar\n\n" +
                    "\t2-Módulo 2\n" +
                    "\t3-Módulo 3\n" +
                    "\t4-Módulo 4\n" +
                    "\t5-Módulo 5\n" +
                    "\t\tOtro-Salir\n\n" +
                    "Opción: ");

            int respuesta=1;

            try {
                respuesta = sc.nextInt();
            }catch (Exception e){
                System.out.println("ERROR: Escribe un número entero");
            }
            sc.nextLine();//limpiar buffer

            switch (respuesta){
                case 2:
                    Ejecutar2 e2 = new Ejecutar2();
                    e2.ejecutar();
                    break;
                case 3:
                    Ejecutar3 e3 = new Ejecutar3();
                    e3.ejecutar();
                    break;
                case 4:
                    Ejecutar4 e4 = new Ejecutar4();
                    e4.ejecutar();
                    break;
                case 5:
                    Ejecutar5 e5 = new Ejecutar5();
                    e5.ejecutar();
                    break;
                default:
                    seguir=false;
                    break;

            }
        }
    }
}
