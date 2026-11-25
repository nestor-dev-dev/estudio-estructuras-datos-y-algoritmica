public class Examen1 {
    public void ejecutar() {
        //ED Examen Final Julio 2021
        GrafoMA g = new GrafoMA(12, false);
        g.insertarArista(0, 7);
        g.insertarArista(11, 8);
        g.insertarArista(8, 9);
        g.insertarArista(9, 10);
        g.insertarArista(10, 5);
        g.insertarArista(6, 3);
        g.insertarArista(3, 3);
        g.insertarArista(1, 3);
        g.insertarArista(1, 4);
        g.insertarArista(2, 3);
        g.insertarArista(2, 4);
        g.insertarArista(4, 3);
        g.mostrar2();

        System.out.println("nodos conectados al 6: " + numeroVerticesComponenteConexa(g, 6));
        System.out.println("nodos conectados al 8: " + numeroVerticesComponenteConexa(g, 8));
        System.out.println("nodos conectados al 0: " + numeroVerticesComponenteConexa(g, 0));
        System.out.println("nodos conectados al 7: " + numeroVerticesComponenteConexa(g, 7));
    }


    private int numeroVerticesComponenteConexa(GrafoMA g, int v){
        boolean[] visitados = new boolean[g.getNumVertices()];
        for(int i=0; i<g.getNumVertices(); i++){
            visitados[i] = false;
        }
        g.recorridoEnProfundidadCadena(v, visitados);
        int cont=0;
        for (int i=0; i<g.getNumVertices(); i++){
            if(visitados[i] == true){
                cont++;
            }
        }
        return cont;
    }
}
