import java.util.Scanner;

public class Ejercicio2 {
    Scanner scan = new Scanner(System.in);
    public void ejecutar(){
        Pila p = new Pila();
        for(int i=0; i<8; i++){
            p.apilar((int) (Math.random() * 10));
        }
        p.mostrar();
        System.out.println("Teclea un número: ");
        int n = scan.nextInt();
        int x = subir(p, n);
        p.apilar(x);
        p.mostrar();
    }

    private int subir(Pila p, int n){
        int res=Integer.MIN_VALUE;
        if(!p.vacia()){
            int x=p.desapilar();
            if(x == n){
                subir(p, n);
                res=x;
            }else{
                res=subir(p, n);
                p.apilar(x);
            }
        }

        return res;
    }
}
