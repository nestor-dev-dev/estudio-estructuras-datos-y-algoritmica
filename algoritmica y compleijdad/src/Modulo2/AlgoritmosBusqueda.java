package Modulo2;

public class AlgoritmosBusqueda {
    public boolean busquedaBinaria(VectorAleatorio vector, int n){
        int[] v = vector.getVector();

        return busquedaBinaria2(v, n, 0, v.length-1);
    }

    private boolean busquedaBinaria2(int[] v, int n, int i0, int iN){

        if(i0 == iN){
            return (v[i0] == n);
        }else{
            int x = (iN+i0)/2;
            if(n == v[x]){
                return true;
            }else if(n < v[x]){
                return busquedaBinaria2(v, n, i0, x-1);
            }else {
                return busquedaBinaria2(v, n, x+1, iN);
            }
        }
    }

    public int maximoSubarray(VectorAleatorio vector){

        int[] v = vector.getVector();

        return maximoSubarray2(v, 0, v.length-1);
    }

    private int maximoSubarray2(int[] v, int i0, int in){
        if(i0 == in){
            return v[i0];
        }else{
            int x = (i0+in)/2;
            int inferior = maximoSubarray2(v, i0, x);
            int superior = maximoSubarray2(v, x+1, in);
            int medio = maximoSubarrayMedio(v, i0, x, in);

            return Math.max(inferior, Math.max(superior, medio));
        }
    }

    private int maximoSubarrayMedio(int[] v, int i0, int pivote, int in){
        //buscamos el maximo subarray de pibote hacia abajo

        int suma=0;
        int max=Integer.MIN_VALUE;

        for (int i=pivote; i>=i0; i--){
            suma+=v[i];
            if(suma > max){
                max=suma;
            }
        }

        //a ese maximo subarray le sumamaos el posible maximo desde el medio hacia arriba

        suma=max;

        for (int i=pivote+1; i<=in; i++){
            suma+=v[i];
            if(suma > max){
                max=suma;
            }
        }

        return max;
    }

    public int maximoElementoSinDyV(VectorAleatorio vector){
        int[] v = vector.getVector();
        //complejidad N

        int max = Integer.MIN_VALUE;
        for (int i=0; i<v.length; i++){
            if(v[i] > max){
                max=v[i];
            }
        }
        return max;
    }

    public int maximoElementoConDyV(VectorAleatorio vector){
        int[] v = vector.getVector();
        //complejidad N, nos hemos complicado la vida para nada

        return maximoElementoConDyV2(v, 0, v.length-1);
    }

    private int maximoElementoConDyV2(int[] v, int i0, int in){
        if(i0 == in){
            return v[i0];
        }else{
            int x = (i0+in)/2;
            int izquierda = maximoElementoConDyV2(v, i0, x);
            int derecha = maximoElementoConDyV2(v, x+1, in);
            return Math.max(izquierda, derecha);
        }
    }

    private int[][] vectorToMatriz(int[] v){
        int lado = (int) Math.sqrt(v.length);

        int[][] matriz = new int[lado][lado];

        int cont=0;
        for (int i=0; i<lado; i++){
            for (int j=0; j<lado; j++){
                matriz[i][j] = v[cont];
                cont++;
            }
        }

        return matriz;
    }

    public void trasponerMatrizSinDyV(VectorAleatorio vector){
        int[][] matriz = trasponerMatrizSinDyV2(vector);
        System.out.print("Tras trasponer la matriz:\n"+imprimirMatriz(matriz));
    }

    private int[][] trasponerMatrizSinDyV2(VectorAleatorio vector){
        int[] v = vector.getVector();
        int lado = (int) Math.sqrt(v.length);

        int[][] matriz = vectorToMatriz(v);

        System.out.print("Tras convertir el vector en matriz nos queda así:\n"+imprimirMatriz(matriz)+"\n");

        for (int i=0; i<lado; i++){
            for (int j=i; j<lado; j++){
                int aux=matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        return matriz;
    }

    private String imprimirMatriz(int[][] m){
        String res="";
        int lado = m.length;
        for (int i=0; i<lado; i++){
            res+="[ ";
            for(int j=0; j<lado; j++){
                res += m[i][j]+" ";
            }
            res+="]\n";
        }
        return res;
    }

    public void trasponerMatrizConDyV(VectorAleatorio vector){
        //tremenda fumada capo
    }
}
