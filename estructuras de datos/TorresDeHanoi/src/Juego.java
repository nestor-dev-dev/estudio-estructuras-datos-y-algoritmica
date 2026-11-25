import jdk.jshell.spi.SPIResolutionException;

public class Juego {
    private Pila p1 = new Pila();
    private Pila p2 = new Pila();
    private Pila p3 = new Pila();
    private int num;

    public Juego(int num){
        this.num = num;
        int x=num;
        for (int i=0; i<num; i++){
            p1.apilar(x);
            x--;
        }
    }

    public void mostrar(){
        System.out.println("Columna 1:");
        mostrarRec(p1);
        System.out.println("\nColumna 2:");
        mostrarRec(p2);
        System.out.println("\nColumna 3:");
        mostrarRec(p3);
    }

    private void mostrarRec(Pila p){
        if(!p.vacia()){
            int n=p.desapilar();
            for(int i=0; i<n; i++){
                System.out.print("-");
            }System.out.println("");
            mostrarRec(p);
            p.apilar(n);
        }
    }

    public void mover(int n1, int n2){
        if(n1 == n2){
            System.out.println("Tu eres tonto o te lo haces?");
        }else if(n1 == 1){
            if(n2 == 2){
                moverPrivado(p1, p2);
            }else if(n2 == 3){
                moverPrivado(p1, p3);
            }else{
                System.out.println("Chupame la verga mamawebo");
            }
        }else if(n1 == 2){
            if(n2 == 1){
                moverPrivado(p2, p1);
            }else if(n2 == 3){
                moverPrivado(p2, p3);
            }else{
                System.out.println("Chupame la verga mamawebo");
            }
        }else if(n1 == 3){
            if(n2 == 1){
                moverPrivado(p3, p1);
            }else if(n2 == 2){
                moverPrivado(p3, p2);
            }else{
                System.out.println("Chupame la verga mamawebo");
            }
        }else{
            System.out.println("Chupame la verga mamawebo");
        }
    }

    private void moverPrivado(Pila p1, Pila p2){
        if(p1.vacia()){
            System.out.println("Error, la columna origen esta vacia");
        }else if(p2.vacia()){
            p2.apilar(p1.desapilar());
        }else{
            int n1 = p1.desapilar();
            int n2 = p2.desapilar();

            if(n1>n2){
                System.out.println("Error, no se puede colocar una pieza grande sobre una pequenia");
                p2.apilar(n2);
                p1.apilar(n1);
            }else{
                p2.apilar(n2);
                p2.apilar(n1);
            }
        }
    }

    public boolean victoria(){
        boolean res = false;
        if(!p3.vacia()){
            res = victoriaRec(1);
        }
        return res;
    }

    private boolean victoriaRec(int n){
        boolean res;
        if(!p3.vacia()){
            int x = p3.desapilar();
            res = victoriaRec(n+1);
            p3.apilar(x);
            if(n != x){
                res=false;
            }
        }else if(n != this.num+1){
            res=false;
        }else{
            res=true;
        }
        return res;
    }
}
