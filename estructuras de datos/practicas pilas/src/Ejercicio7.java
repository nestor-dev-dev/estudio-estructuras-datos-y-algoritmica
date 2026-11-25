import java.util.Scanner;

public class Ejercicio7 {
    public void ejecutar(){
        Scanner scan = new Scanner(System.in);
        Pila p = new Pila();
        for(int i=0; i<8; i++){
            p.apilar((int) (Math.random() * 10));
        }
        p.mostrar();
        int x=(int) (Math.random() * 10);
        System.out.println("Eliminamos el dato "+x);
        eliminar(p, x);
        p.mostrar();
    }

    private void eliminar(Pila p, int n){
        if(!p.vacia()){
            int x = p.desapilar();
            eliminar(p, n);
            if(x != n){
                p.apilar(x);
            }
        }
    }
}
