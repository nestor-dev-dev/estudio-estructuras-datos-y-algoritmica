public class Ejercicio2 {
    public void ejecutar(){
        Cola c = new Cola();
        for (int i=0; i<10; i++){
            c.encolar((int) (Math.random() * 9) +1);
        }
        c.mostrar();

        int res = pos(c, (int) (Math.random() * 9)+1);
        System.out.println(res);

        c.mostrar();
    }

    private int pos(Cola c, int n){
        System.out.println("Buscamos el valor "+n);
        int res=-1;
        for(int i=0; i<c.getNumElementos(); i++){
            int aux = c.desencolar();
            if(aux == n){
                res = i+1;
            }
            c.encolar(aux);
        }
        return res;
    }
}
