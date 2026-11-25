public class Ejercicio3 {
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

        Cola c3 = mezclar(c1, c2);
      //  Cola c4 = mezclar2(c1, c2);

        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
     //   c4.mostrar();
    }

    private Cola mezclar(Cola c1, Cola c2){
        Cola c3 = new Cola();

        boolean seguir = true;
        while (seguir){
            if(!c1.vacia()){
                c3.encolar(c1.desencolar());
            }

            if(!c2.vacia()){
                c3.encolar(c2.desencolar());
            }

            if(c1.vacia() && c2.vacia()){
                seguir=false;
            }
        }

        return c3;
    }

    private Cola mezclar2(Cola c1, Cola c2){
        Cola c4 = new Cola();
        int cont = 0;
        while (!c1.vacia() && !c2.vacia()){
            if(cont%2 == 0){
                c4.encolar(c1.desencolar());
            }else{
                c4.encolar(c2.desencolar());
            }
            cont++;
        }

        if(c1.vacia()){
            while (!c2.vacia()){
                c4.encolar(c2.desencolar());
            }
        }else{
            while (!c1.vacia()){
                c4.encolar(c1.desencolar());
            }
        }

        return c4;
    }
}
