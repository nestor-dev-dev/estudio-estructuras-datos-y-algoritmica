import java.util.Scanner;

public class Ejercicio5 {
    public void ejecutar(){
        Scanner scan = new Scanner(System.in);
        Pila p = new Pila();
        for(int i=0; i<8; i++){
            p.apilar((int) (Math.random() * 10));
        }
        p.mostrar();
        mover(p);
    }
    private void mover(Pila p){
        System.out.println("Opción 1:");
        int x = mover2(p, 0);
        p.apilar(x);
        p.mostrar();
        System.out.println("Opción 2:");
        x = mover3(p);
        p.apilar(x);
        p.mostrar();
    }

    private int mover2(Pila p, int res){
        if(!p.vacia()){
            int x = p.desapilar();
            res = mover2(p, 0);
            if(res == Integer.MIN_VALUE){
                res=x;
            }else{
                p.apilar(x);
            }
        }else{
            res=Integer.MIN_VALUE;
        }
        return res;
    }

    public int mover3(Pila p){
        int res=0;
        if(!p.vacia()){
            res=p.desapilar();
            if(!p.vacia()){
                int x=res;
                res=mover3(p);
                p.apilar(x);
            }
        }
        return res;
    }

}
