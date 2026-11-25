public class Ejercicio7 {
    public void ejecutar(){
        Arbol b1 = new Arbol(4);
        Arbol b2 = new Arbol(5);
        Arbol c1 = new Arbol(6);
        Arbol c2 = new Arbol(7);

        b1.insertarIzquierdo(8);
        b1.insertarDerecho(9);
        b2.insertarIzquierdo(10);
        b2.insertarDerecho(11);
        c1.insertarIzquierdo(12);
        c1.insertarDerecho(13);
        c2.insertarIzquierdo(14);
        c2.insertarDerecho(15);


        Arbol a1 = new Arbol(2, b1, b2);
        Arbol a2 = new Arbol(3, c1, c2);
        Arbol a = new Arbol(1, a1, a2);

        a.mostrar();
        a.altura();
    }
}
