public class Ejercicio11 {
    public void ejectar(){
        ListaOrdinal l = new ListaOrdinal();
        for(int i=0; i<10; i++){
            l.insertar((int) (Math.random()*10)+1);
        }
        l.mostrar();

        l.duplicarParesQuitarImpares();

        l.mostrar();
    }
}
