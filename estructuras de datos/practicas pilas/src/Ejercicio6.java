import java.util.Scanner;

public class Ejercicio6 {
    public void ejecutar(){
        Scanner scan = new Scanner(System.in);
        Pila p = new Pila();
        for(int i=0; i<8; i++){
            p.apilar((int) (Math.random() * 10));
        }
        p.mostrar();
        capicua(p);
        p.mostrar();
    }

    private void capicua(Pila p){

    }
}
