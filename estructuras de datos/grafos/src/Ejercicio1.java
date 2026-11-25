public class Ejercicio1 {
    public void ejecutar(){
        GrafoMA g = new GrafoMA(5, false);
        g.insertarArista(0, 1);
        g.insertarArista(0, 4);
        g.insertarArista(1, 2);
        g.insertarArista(1, 3);
        g.insertarArista(3, 4);
        g.mostrar2();

        System.out.println("Invertido");

        GrafoMA g1 = complementario(g);
        g1.mostrar2();
    }

    private GrafoMA complementario(GrafoMA g){
        GrafoMA res = new GrafoMA(g.getNumVertices(), g.getDirigido());

        int n= g.getNumVertices();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i != j){
                    if(!g.existeArista(i, j)) {
                        res.insertarArista(i, j);
                    }
                }
            }
        }
        return res;
    }
}
