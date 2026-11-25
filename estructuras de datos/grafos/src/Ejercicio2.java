public class Ejercicio2 {
    public void ejecutar(){
        GrafoMA g = new GrafoMA(5, false);
        g.insertarArista(0, 1);
        g.insertarArista(0, 4);
        g.insertarArista(1, 2);
        g.insertarArista(1, 3);
        g.insertarArista(2, 2);
        g.insertarArista(3, 4);
        g.insertarArista(4, 4);
        g.mostrar2();

        System.out.println("Aislamos el 4: ");
        aislar(4, g);
        g.mostrar2();
    }

    private void aislar(int v, GrafoMA g){

        if(g.getNumVertices() > v && v > 0){
            for(int i=0; i<g.getNumVertices(); i++){
                if(v != i && g.existeArista(i, v)){
                    g.eliminarArista(i, v);
                }
            }

            if(g.getDirigido()){
                for(int i=0; i<g.getNumVertices(); i++){
                    if(v != i && g.existeArista(v, i)){
                        g.eliminarArista(v, i);
                    }
                }
            }
        }
    }
}
