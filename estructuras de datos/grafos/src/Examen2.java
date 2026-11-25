public class Examen2 {
    public void ejecutar(){
        //ED Examen Parcial Junio 2019
        GrafoMA g = new GrafoMA(5, true);
        g.insertarArista(0, 1);
        g.insertarArista(1, 2);
        g.insertarArista(1, 3);
        g.insertarArista(2, 2);
        g.insertarArista(3, 4);
        g.insertarArista(4, 4);
        g.mostrar2();

        System.out.println("Existe un camino entr 0 y 3: "+g.existeCaminoCorto(0, 3, 1));
        System.out.println("Existe un camino entr 0 y 4: "+g.existeCaminoCorto(0, 4, 1));
        System.out.println("Existe un camino entr 2 y 3: "+g.existeCaminoCorto(2, 3, 1));
    }
}
