public class EjerciciosExamen {
    public void ejecutar(){
        Pila p1 = new Pila();
        Pila p2 = new Pila();

        p1.apilar(6);
        p1.apilar(4);
        p1.apilar(2);
        p1.apilar(1);

        p2.apilar(4);
        p2.apilar(8);
        p2.apilar(3);
        p2.apilar(2);

        p1.mostrar();
        p2.mostrar();

        System.out.println(comprobarOrientacion(p1)+"\n"+comprobarOrientacion(p2));
    }

    private boolean comprobarOrientacion(Pila p){
        return orientacion(p, Integer.MIN_VALUE);
    }

    private boolean orientacion(Pila p, int n){
        boolean b=true;
        if(!p.vacia()){
            int x = p.desapilar();
            b=orientacion(p, x);
            if(b){
                if(n >= x){
                    b=false;
                }
            }
            p.apilar(x);
        }
        return b;
    }
}
