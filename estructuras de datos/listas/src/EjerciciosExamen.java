public class EjerciciosExamen {
    public void ejecutar(){
        ListaOrdinal l = new ListaOrdinal();
        l.insertar(3);
        l.insertar(5);
        l.insertar(1);
        l.insertar(7);
        l.insertar(9);
        l.insertar(4);
        l.mostrar();

        int x=7;
        System.out.println(x);

        l.moverAlFinal(x);
        l.mostrar();
    }
}
