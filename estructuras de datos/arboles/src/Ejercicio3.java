public class Ejercicio3 {
    public void ejecutar(){
        Arbol a1 = new Arbol(2);
        Arbol a2 = new Arbol(5);
        a1.insertarIzquierdo(3);
        a1.insertarDerecho(4);
        a2.insertarIzquierdo(6);
        a2.insertarDerecho(7);
        Arbol a = new Arbol(1, a1, a2);

        a.preOrden();
        a.mostrar();

        System.out.println("El numero de hojas es "+a.numHojas());
    }
}
