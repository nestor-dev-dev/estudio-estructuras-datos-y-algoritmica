import java.util.Scanner;

public class Ejercicio9 {
    public void ejecutar(){
        Scanner scan = new Scanner(System.in);
        Pila p = new Pila();
        for(int i=0; i<8; i++){
            p.apilar((int) (Math.random() * 10));
        }
        p.mostrar();

        Pila p2 = noPares(p);

        p.mostrar();
        p2.mostrar();
    }

    private Pila noPares(Pila p){
        Pila p2 = new Pila();
        noPares2(p, p2, 1);
        return p2;
    }

    private int noPares2(Pila p, Pila p2, int cont){
        if(!p.vacia()){
            int x = p.desapilar();
            cont = 1+noPares2(p, p2, cont);
            if(cont%2 == 0){
                p2.apilar(x);
            }else{
                p.apilar(x);
            }
        }
        return cont;
    }
}
