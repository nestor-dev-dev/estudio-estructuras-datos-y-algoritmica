package Modulo2;

public class ArgoritmosOrdenacion {
    public VectorAleatorio seleccion(VectorAleatorio vector){
        int[] v = vector.getVector();

        for (int i=0; i<v.length; i++) {
            int aux = i;
            for (int j=i+1; j<v.length; j++) {
                if (v[j] < v[aux]) aux=j;
            }
            swap(v, i, aux);
        }

        vector.setVector(v);

        return vector;
    }

    public VectorAleatorio insercion(VectorAleatorio vector){
        int[] v = vector.getVector();

        for(int i=1; i<v.length; i++){
            int aux=v[i];
            int pos=i;
            while (pos>0 && v[pos-1] > aux){
                v[pos] = v[pos-1];
                pos--;
            }
            v[pos] = aux;
        }

        vector.setVector(v);

        return vector;
    }

    public VectorAleatorio burbuja(VectorAleatorio vector){
        int[] v = vector.getVector();


        int posFinal = v.length-1;
        for(int i=0; i<v.length; i++){
            for (int j=1; j<=posFinal; j++){
                if(v[j-1] > v[j]){
                    swap(v, j-1, j);
                }
            }
            posFinal--;
        }

        /*La opción de los profes:

        for (int j=v.length-1; j>=0; j--){
            for (int i=0; i<j; i++) {
                if (v[i]>v[i+1]) {
                    int aux=v[i]; v[i]=v[i+1]; v[i+1]=aux;
                }
            }
        }*/

        vector.setVector(v);

        return vector;
    }

    public VectorAleatorio combSort(VectorAleatorio vector){
        int[] v = vector.getVector();

        vector.setVector(v);
/*está mal
        int gap=v.length-1;
        final double CONTANTE = 1.3;

        int cont;

        do {
            cont=0;

            while (gap < v.length){
                if(v[cont] > v[gap]){
                    swap(v, cont, gap);
                }
                cont++;
                gap++;
            }
            gap-=cont;
            gap = (int) Math.floor(gap/CONTANTE);
        }while (gap>1);*/


        boolean ordenado=false;
        int gap=v.length-1;
        if (v[0]>v[gap]) {
            swap(v, gap, 0);
        }
        while (!ordenado || gap>=1) {
            if (gap>1){
                gap=(int) Math.floor(gap/1.3);
            }
            ordenado=true;
            int i=0;
            while (i+gap < v.length) {
                if (v[i]>v[i+gap]) {
                    swap(v, i, i+gap);
                    ordenado=false;
                }
                i++;
            }
        }


        return vector;
    }

    public VectorAleatorio heapSort(VectorAleatorio vector){
        int[] v = vector.getVector();

        vector.setVector(v);

        return vector;
    }

    public VectorAleatorio QuickSort(VectorAleatorio vector){
        int[] v = vector.getVector();

        QuickSort2(v, 0, v.length-1);

        vector.setVector(v);

        return vector;
    }

    private void QuickSort2(int[] v, int i0, int in){

        if (i0 >= in) {
            //nada
        }else{
            int i = ordenarPorPivote(v, i0, in);
            QuickSort2(v, i0, i-1);
            QuickSort2(v, i+1, in);
        }
    }

    private int ordenarPorPivote(int[] v, int i0, int in){
        int pivote=v[in];
        int i=i0;
        int j=in-1;

        while (i<j){
            while (v[i] <= pivote && i<j) {
                i++;
            }
            while (v[j] > pivote && i<j) {
                j--;
            }
            swap(v, i, j);
        }

        if(v[i] > pivote){
            swap(v, in, i);
            return i;
        }else{
            return in;
        }
    }

    public VectorAleatorio MergeSort(VectorAleatorio vector){
        int[] v = vector.getVector();

        MergeSort2(v, 0, v.length-1);

        vector.setVector(v);

        return vector;
    }

    private void MergeSort2(int[] v, int i0, int in){
        if(i0 >= in){
            //no hacemos ni madre
            return;
        }else{
            int medio = (i0+in)/2;
            MergeSort2(v, i0, medio);
            MergeSort2(v, medio+1, in);
            ordenarPorMergeSort(v, i0, medio, in);
        }
    }

    private void ordenarPorMergeSort(int[] v, int i0, int medio, int in){
        int[] aux = new int[in-i0+1];//puesto que el i0 = 0, hay que sumar 1
        int posAux=0;
        int posIzquierda=i0;
        int posDerecha=medio+1;//debido a que posIzquierda irá hasta medio incluido

        while (posIzquierda <= medio && posDerecha <= in){
            if(v[posIzquierda] <= v[posDerecha]){
                aux[posAux] = v[posIzquierda];
                posIzquierda++;
            }else{
                aux[posAux] = v[posDerecha];
                posDerecha++;
            }
            posAux++;
        }//este while finaliza cuando ya se sacaron todos los elementos de el lado izquierdo o el derecho, luego falta comppletar los elementos del lado contrario

        //en caso de que falte la parte izquierda
        for(int i=posIzquierda; i<=medio; i++){/*si no es el de la izquieda, se realizarán 0 iteraciones en el for*/
            aux[posAux] = v[i];
            posAux++;
        }

        //en caso de que falte la parte derecha
        for (int i=posDerecha; i<=in; i++){
            aux[posAux] = v[i];
            posAux++;
        }

        //por último, el aux se copiará en el vector v
        for(int i=0; i<aux.length; i++){
            v[i0+i]=aux[i];
        }

    }

    private void swap(int[] v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
