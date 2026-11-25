public class Ejercicio5 {
    public void ejectar(){
        ListaOrdinal l = new ListaOrdinal();
        for(int i=0; i<10; i++){
            l.insertar((int) (Math.random()*10)+1);
        }

        ListaOrdinal l2 = new ListaOrdinal();
        for(int i=0; i<10; i++){
            l.insertar((int) (Math.random()*10)+1);
        }

        l.mostrar();
        l2.mostrar();

       // duplicarParesQuitarImpares();

        l.mostrar();
    }

  /*  private ListaOrdinal interseccion(ListaOrdinal l1, ListaOrdinal l2){

    }*/
}
