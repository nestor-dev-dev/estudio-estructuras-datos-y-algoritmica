public class Ejercicio5 {
    public void ejecutar(){
        Arbol a1 = new Arbol(2);
        Arbol a2 = new Arbol(5);
        a1.insertarIzquierdo(3);
        a1.insertarDerecho(4);
        a2.insertarIzquierdo(6);
        a2.insertarDerecho(7);
        Arbol a = new Arbol(1, a1, a2);

        System.out.println("Arbol 1:");
        a.preOrden();
        a.mostrar();

        Arbol b1 = new Arbol(2);
        Arbol b2 = new Arbol(5);
        b1.insertarIzquierdo(3);
        b1.insertarDerecho(4);
        b2.insertarIzquierdo(6);
        b2.insertarDerecho(7);
        Arbol b = new Arbol(1, b1, b2);

        System.out.println("Árbol 2:");
        b.preOrden();
        b.mostrar();

        Arbol c1 = new Arbol(2);
        Arbol c2 = new Arbol(5);
        c1.insertarIzquierdo(3);
        c1.insertarDerecho(4);
        c2.insertarIzquierdo(6);
        Arbol c = new Arbol(1, c1, c2);

        System.out.println("Arbol 3:");
        c.preOrden();
        c.mostrar();

        System.out.println("¿Los arboles 1 y 2 son iguales?: "+a.igual(b));
        System.out.println("¿Los arboles 1 y 3 son iguales?: "+a.igual(c));
        System.out.println("¿Los arboles 2 y 3 son iguales?: "+b.igual(c));

    }
}
