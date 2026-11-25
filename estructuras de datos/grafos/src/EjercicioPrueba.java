public class EjercicioPrueba {
    public void ejecutar(){
        GrafoMA g = new GrafoMA(3, true);

        g.inicializaMA();
        g.mostrar();
        g.insertarArista(0, 0);
        g.insertarArista(0, 1);
        g.insertarArista(0, 2);
        g.insertarArista(1, 1);
        g.insertarArista(1, 2);
        g.mostrar();
        g.profundidadDesdeVertice(0);
        g.profundidadDesdeVertice(1);
    }
}
