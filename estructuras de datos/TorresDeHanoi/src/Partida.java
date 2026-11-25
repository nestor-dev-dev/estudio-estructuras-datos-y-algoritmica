import java.util.Scanner;

public class Partida {
    public void ejecutar(){
        int n=5;

        Scanner sc = new Scanner(System.in);

        boolean error = true;
        while (error){
            System.out.print("introduzca el numero de fichas: ");
            n=sc.nextInt();
            if(n > 0){
                error=false;
            }else{
                System.out.println("Error, no puedes tener 0 fichas o fichas negativas");
            }
        }


        Juego j = new Juego(n);

        j.mostrar();

        System.out.println("Comienza el juego:");

        boolean seguir=true;

        while (seguir){
            System.out.println("\n\n\nSi quieres rendirte selecciona 0   0");
            System.out.print("Columna de donde sacamos la pieza: ");
            int n1 = sc.nextInt();

            System.out.print("Columna de destino: ");
            int n2 = sc.nextInt();

            if(n1 == 0 && n2 == 0){
                seguir=false;
                System.out.println("Has perdido");
            }else{
                j.mover(n1, n2);

                j.mostrar();

                if(j.victoria()){
                    System.out.println("Ganaste puto");
                    seguir = false;
                }

            }
        }
    }
}
