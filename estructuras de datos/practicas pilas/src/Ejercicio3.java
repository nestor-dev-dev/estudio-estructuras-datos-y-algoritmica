import java.util.Scanner;

public class Ejercicio3 {
    public void ejecutar(){
        Pila p = new Pila();
        p.apilar(8);
        p.apilar(1);
        p.apilar(3);
        p.apilar(4);
        p.apilar(3);
        p.apilar(1);
        p.apilar(9);
        p.apilar(8);

        p.mostrar();

        int x = resultado(p);
        System.out.println(x);
    }

    private int resultado(Pila p){
        int res=0, var, var2;
        if(!p.vacia()){
            var = resultado2(p);
            var2 = ultimaPosicion(p, 0);
            System.out.println(var+" "+var2);
            if(var == var2){
                res=0;
            }else if(var2 < var){
                res=-1;
            }else{
                res=1;
            }
        }
        return res;
    }

    private int ultimaPosicion(Pila p, int res){
        int x=0;
        if(!p.vacia()){
            x = p.desapilar();
            res = ultimaPosicion(p, res);
            if(res == Integer.MIN_VALUE){
                res=x;
            }
            p.apilar(x);
        }else{
            res=Integer.MIN_VALUE;
        }
        return res;
    }

    private int resultado2(Pila p){
        int cont=0;
        if(!p.vacia()){
            int x = p.desapilar();
            cont = 1 + resultado2(p);
            p.apilar(x);
        }
        return cont;
    }
}
