public class Ejercicio7 {
    public void ejecutar(){
        Cola c = new Cola();
        Pila p = new Pila();
        for (int i=0; i<10; i++){
            c.encolar((int) (Math.random() * 9) +1);
        }
        c.mostrar();
        p.mostrar();

        separar(c, p);

        c.mostrar();
        p.mostrar();
    }

    private void separar(Cola c, Pila p){
        int n=c.getNumElementos();
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                //par
                c.encolar(c.desencolar());
            }else{
                //impar
                p.apilar(c.desencolar());
            }
        }
    }
}
