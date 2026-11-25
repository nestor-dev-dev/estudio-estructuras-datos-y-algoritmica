package Modulo4;

import java.util.Scanner;

public class A1Ejecutar {
    public void ejecutar(){
        Scanner sc = new Scanner(System.in);

        boolean seguir=true;

        while (seguir){

            System.out.print("Elige la opción:\n" +
                    "\t1-Desglose de monedas\n" +
                    "\t2-La mochila\n" +
                    "\t3-Planificación de tareas\n" +
                    "\t\t Otro-Salir\n\n\n" +
                    "Opción: ");

            try {
                int x = sc.nextInt();

                switch (x){
                    case 1:
                        A2DesgloseDeMonedas a2DesgloseDeMonedas = new A2DesgloseDeMonedas();
                        a2DesgloseDeMonedas.ejecutar();
                        break;
                    case 2:
                        A3Mochila a3Mochila = new A3Mochila();
                        a3Mochila.ejecutar();
                        break;
                    case 3:
                        A4PLanificaionTareas a4PLanificaionTareas = new A4PLanificaionTareas();
                        a4PLanificaionTareas.ejecutar();
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
