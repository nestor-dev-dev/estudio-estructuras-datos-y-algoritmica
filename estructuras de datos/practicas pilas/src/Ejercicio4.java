import java.util.Scanner;

public class Ejercicio4 {
    public void ejecutar(){
        Scanner scan = new Scanner(System.in);
        Pila p = new Pila();
        for(int i=0; i<8; i++){
            p.apilar((int) (Math.random() * 10));
        }
        p.mostrar();
        System.out.println("Teclea un número: ");
        int n = scan.nextInt();
        eliminar(p, n);
        p.mostrar();
    }

    private void eliminar(Pila p, int n){
        eliminar2(p, n, 0);
    }

    private int eliminar2(Pila p, int n, int cont){
        if(!p.vacia()){
            int x;
            x=p.desapilar();
            cont = 1 + eliminar2(p, n, cont);
            if(cont != n){
                p.apilar(x);
            }
        }
        return cont;
    }
}
