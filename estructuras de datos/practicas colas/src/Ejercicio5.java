public class Ejercicio5 {
    public void ejecutar(){
        Cola c1 = new Cola();
        for (int i=0; i<10; i++){
            c1.encolar((int) (Math.random() * 9) +1);
        }
        Cola c2 = new Cola();
        for (int i=0; i<5; i++){
            c2.encolar((int) (Math.random() * 9) +1);
        }
        c1.mostrar();
        c2.mostrar();

        Cola c3 = menores(c1, c2);

        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
    }

    public Cola menores(Cola c1, Cola c2){
        Cola c3 = new Cola();

        boolean seguir = true;
        int cont1=c1.getNumElementos(), cont2=c2.getNumElementos(), a=0, b=0;
        while (seguir){
            if(a == cont1 && b == cont2){
                seguir = false;
            }else{
                int aux1=Integer.MIN_VALUE, aux2=Integer.MIN_VALUE;
                if(a != cont1){
                    aux1=c1.desencolar();
                    a++;
                }

                if(b != cont2){
                    aux2=c2.desencolar();
                    b++;
                }

                if(aux1 == Integer.MIN_VALUE && aux2 == Integer.MIN_VALUE){
                    seguir = false;
                }else if(aux1 == Integer.MIN_VALUE){
                    c2.encolar(aux2);
                }else if(aux2 == Integer.MIN_VALUE){
                    c1.encolar(aux1);
                }else{
                    if(aux1<=aux2){
                        c3.encolar(aux1);
                        c2.encolar(aux2);
                    }else {
                        c3.encolar(aux2);
                        c1.encolar(aux1);
                    }
                }
            }
        }

        return c3;
    }
}
