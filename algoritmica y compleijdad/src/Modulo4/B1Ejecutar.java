package Modulo4;

import java.util.Scanner;

public class B1Ejecutar {
    public void ejecutar(){
        Scanner sc = new Scanner(System.in);

        boolean seguir=true;

        while (seguir){

            System.out.print("Elige la opción:\n" +
                    "\t1-\n" +
                    "\t2-\n" +
                    "\t3-\n" +
                    "\t\t Otro-Salir\n\n\n" +
                    "Opción: ");

            try {
                int x = sc.nextInt();

                switch (x){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

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
