public class Ejercicio1 {
    public void ejecutar(){
        Cola c = new Cola();
        for (int i=0; i<10; i++){
            c.encolar((int) (Math.random() * 9) +1);
        }
        c.mostrar();

        invertir(c);

        c.mostrar();

        invertir2(c);

        c.mostrar();
    }

    private void invertir(Cola c){
        int n=c.getNumElementos();
        int aux[] = new int[n];
        for(int i=0; i<n; i++){
            aux[i]=c.desencolar();
        }

        for(int i=n-1; i>=0; i--){
            c.encolar(aux[i]);
        }
    }

    private void invertir2(Cola c){
        if(!c.vacia()){
            int x = c.desencolar();
            invertir2(c);
            c.encolar(x);
        }
    }
}
