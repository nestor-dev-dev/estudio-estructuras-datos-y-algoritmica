public class Ejercicio4 {
    public void ejecutar(){
        Cola c = new Cola();
        for (int i=0; i<10; i++){
            c.encolar((int) (Math.random() * 9) +1);
        }
        c.mostrar();

        segmentosImpares(c);

        c.mostrar();
    }

    private void segmentosImpares(Cola c){
        boolean par=false;
        int x = c.getNumElementos();
        int n;
        int suma=0;
        for(int i=0; i<x; i++){
            n = c.desencolar();
            if(par == false){
                if(n%2 == 0){
                    //es par
                    par=true;
                    if(suma != 0){
                        c.encolar(suma);
                    }
                    c.encolar(n);
                }else{
                    //encontramos impar
                    suma+=n;
                }
            }else {
                c.encolar(n);
            }
        }
    }
}
