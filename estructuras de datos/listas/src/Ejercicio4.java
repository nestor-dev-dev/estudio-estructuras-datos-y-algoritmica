public class Ejercicio4 {
    public void ejectar(){
        ListaOrdinal l = new ListaOrdinal();
        for(int i=0; i<5; i++){
            l.insertar((int) (Math.random()*10)+1);
        }
        l.mostrar();

        System.out.println(comprobarUltimo(l));

        l.mostrar();
    }

    public int comprobarUltimo(ListaOrdinal l){
        int res=0;
        if(!l.vacia()){
            boolean seguir=true;
            int cont=0, aux=0;
            IteradorListaOrdinal i = l.getIterador();
            while (seguir){
                if(i.hasNext()){
                    cont++;
                    aux=i.next();
                }else {
                    seguir=false;
                }
            }
            System.out.println("num elem: "+cont+"\nultimo: "+aux);
            if(cont < aux){
                res=1;
            }else if(cont > aux){
                res=-1;
            }else{
                res=0;
            }
        }
        return res;
    }
}
