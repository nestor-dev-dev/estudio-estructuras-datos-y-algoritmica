public class EjercicioExtra {
    public void ejecutar(){
        Arbol cb = new Arbol(3);
        Arbol ca = new Arbol(3);
        Arbol bb = new Arbol(3);
        Arbol ba = new Arbol(3);
        Arbol c = new Arbol(2, ca, cb);
        Arbol b = new Arbol(2, ba, bb);
        Arbol x = new Arbol(1, b, c);

        x.preOrden();
        x.mostrar();
        x.preOrden();

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

        a.preOrden();
        a.mostrar();
        a.preOrden();


        /*
        1
        X2
        XX33
         */


        Arbol q21 = new Arbol(3);
        Arbol q22 = new Arbol(3);
        Arbol q1 = new Arbol(-9998);
        Arbol q2 = new Arbol(2, q21, q22);
        Arbol q = new Arbol(1, q1, q2);

        q.preOrden();
        q.mostrar();
        q.preOrden();
    }
}
