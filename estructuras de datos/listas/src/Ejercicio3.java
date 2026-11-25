public class Ejercicio3 {
    public void ejectar(){
        ListaOrdinal l = new ListaOrdinal();
        for(int i=0; i<10; i++){
            l.insertar((int) (Math.random()*10)+1);
        }
        l.mostrar();

        int n=(int) (Math.random()*10)+1;
        System.out.println(n);
        l.borrarDuplicar(n);

        l.mostrar();
    }
}
