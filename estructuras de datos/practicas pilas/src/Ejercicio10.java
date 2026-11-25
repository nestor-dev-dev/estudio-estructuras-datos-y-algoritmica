import java.util.Scanner;

public class Ejercicio10 {
    public void ejecutar(){
        Scanner scan = new Scanner(System.in);
        Pila p = new Pila();
        for(int i=0; i<8; i++){
            p.apilar((int) (Math.random() * 10));
        }
        p.mostrar();

        diferenciaMaxMin(p);

        p.mostrar();
    }

    private void diferenciaMaxMin(Pila p){
        int max = maximo(p);
        System.out.println(max);

        int min = minimo(p);
        System.out.println(min);

        apilarFondo(p, max-min);
    }

    private int maximo(Pila p){
        int max=Integer.MIN_VALUE;
        if(!p.vacia()){
            int x = p.desapilar();
            max=maximo(p);
            if(x>max){
                max=x;
            }
            p.apilar(x);
        }
        return max;
    }

    private int minimo(Pila p){
        int min = Integer.MAX_VALUE;
        if(!p.vacia()){
            int x = p.desapilar();
            min=minimo(p);
            if(x<min){
                min=x;
            }
            p.apilar(x);
        }
        return min;
    }

    private void apilarFondo(Pila p, int n){
        if(!p.vacia()){
            int x = p.desapilar();
            apilarFondo(p, n);
            if(p.vacia()){
                p.apilar(n);
            }
            p.apilar(x);
        }
    }
}

