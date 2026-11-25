package Modulo4;

import java.util.Scanner;

public class Ejecutar4 {
    public void ejecutar(){

        Scanner sc = new Scanner(System.in);

        boolean seguir=true;

        while (seguir){

            System.out.print("Elige la opción:\n" +
                    "\t1-Parte 1\n" +
                    "\t2-Parte 2\n" +
                    "\t3-Parte 3\n" +
                    "\t\t Otro-Salir\n\n\n" +
                    "Opción: ");

            try {
                int x = sc.nextInt();

                switch (x){
                    case 1:
                        A1Ejecutar a1Ejecutar = new A1Ejecutar();
                        a1Ejecutar.ejecutar();
                        break;
                    case 2:
                        B1Ejecutar b1Ejecutar = new B1Ejecutar();
                        b1Ejecutar.ejecutar();
                        break;
                    case 3:
                        C1Ejecutar c1Ejecutar = new C1Ejecutar();
                        c1Ejecutar.ejecutar();
                        break;
                    default:
                        seguir=false;
                        break;
                }
            }catch (Exception e){
                System.out.println("Error de usuario pendejo");
                sc.nextLine();
            }
        }
    }
}
