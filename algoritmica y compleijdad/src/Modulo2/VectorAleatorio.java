package Modulo2;

public class VectorAleatorio {
    private int numElementos;
    private int[] vector;


    public VectorAleatorio(int numElementos){
        this.numElementos = numElementos;
        this.vector = new int[numElementos];
        for(int i=0; i<numElementos; i++){
            this.vector[i] = 0;
        }
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    private static int aleatorio(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return (int) x;
    }

    public String imprimir(){
        if(vector != null){
            String res = "[";
            for (int i=0; i<numElementos; i++){
                res +=  vector[i];
                if(i != numElementos-1){
                    res+=", ";
                }
            }
            res += "]";
            return res;
        }else{
            return "vector vacío";
        }
    }

    public int[] generarAleatorio(int minimo, int maximo){
        for (int i=0; i<vector.length; i++){
            vector[i] = aleatorio(minimo, maximo);
        }
        return vector;
    }

    public int[] generarAleatorioOrdenadoNormalizada(int minimo, int maximo){
        double limite = maximo / numElementos;
        maximo = (int) limite;
        for(int i=0; i<vector.length; i++){
            vector[i] = aleatorio(minimo, maximo);
            minimo = vector[i];
            maximo += limite;
        }
        return vector;
    }

    public int[] generarAleatorioOrdenadoBruto(int minimo, int maximo){
        maximo = maximo-vector.length;

        for(int i=0; i<vector.length; i++){
            vector[i] = aleatorio(minimo, maximo);
            minimo = vector[i];
            maximo++;
        }
        return vector;
    }

    public boolean ordenado(){
        int menor=Integer.MIN_VALUE;
        boolean res=true;
        for (int item : vector){
            if(menor <= item){
                menor = item;
            }else{
                res=false;
            }
        }
        return res;
    }
}
