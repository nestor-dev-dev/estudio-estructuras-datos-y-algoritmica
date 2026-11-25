import java.util.Queue;

public class Ejercicio9 {
    public void ejecutar(){
        Arbol b2 = new Arbol(5);
        Arbol b1 = new Arbol(4);
        Arbol a2 = new Arbol(3, b1, b2);
        Arbol a1 = new Arbol(2);
        Arbol a = new Arbol(1, a1, a2);

        a.mostrar();
        a.preOrden();
        System.out.println("Valor de las hojas por encima de nivel 2 "+ a.sumHojNiv(2));
        System.out.println("Valor de las hojas por encima de nivel 3 "+ a.sumHojNiv(3));
        System.out.println("Valor de las hojas por encima de nivel 9 "+ a.sumHojNiv(9));


    }
}
