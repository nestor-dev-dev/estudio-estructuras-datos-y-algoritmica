package Modulo4;

public class A3Mochila {
    public void ejecutar(){
        //esto es mierda de prueba
        int [][] si = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                si[i][j] = i+j;
            }
        }

        for (int i=0; i< si.length; i++){
            System.out.print(si[i][i]+" ");
        }
    }
}
