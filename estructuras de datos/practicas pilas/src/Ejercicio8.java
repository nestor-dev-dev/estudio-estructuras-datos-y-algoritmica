import java.util.Scanner;

public class Ejercicio8 {
    public void ejecutar(){

        Scanner scan = new Scanner(System.in);
        Pila p = new Pila();
        for(int i=0; i<8; i++){
            p.apilar((int) (Math.random() * 10));
        }
        p.mostrar();

        int n = mayor(p);
        System.out.println("Mayor: "+n);

    }

    private int mayor(Pila p){
        int res=Integer.MIN_VALUE;
        if(!p.vacia()){
            int x = p.desapilar();
            res=mayor(p);
            if(x > res){
                res = x;
            }
            p.apilar(x);
        }
        return res;
    }
}
