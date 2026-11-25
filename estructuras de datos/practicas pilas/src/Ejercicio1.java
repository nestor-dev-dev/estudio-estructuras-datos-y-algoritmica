import java.util.*;

public class Ejercicio1 {
    Scanner scan = new Scanner(System.in);
    public void ejecutar(){
        Pila p1 = new Pila();
        for (int i=3; i>0; i--){
            p1.apilar(i);
        }
        p1.mostrar();

        System.out.println("Dame una data numérica: ");
        int n = scan.nextInt();

        System.out.println("\nTRANSFORMACIOOOOON\n");

        p1 = multiplicar(p1, n);

        p1.mostrar();
    }

    private Pila multiplicar(Pila p, int n){
        int x = 0;
        if(!p.vacia()){
            x = p.desapilar();
            multiplicar(p, n);
            for (int i=0; i<n; i++){
                p.apilar(x);
            }
        }
        return p;
    }
}
