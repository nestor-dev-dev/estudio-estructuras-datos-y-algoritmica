public class Pruebas {

    public static void main(String[] args) {
        final int NUM_CONJUNTOS = 5;
        final int TAMAÑO = 10;
        Conjunto[] conjuntos = new Conjunto[NUM_CONJUNTOS];

        conjuntos[0] = new Conjunto(TAMAÑO);
        conjuntos[0].insertar(new int[] {6, 3, 16, 6, 4});

        conjuntos[1] = new Conjunto(TAMAÑO);
        conjuntos[1].insertar(new int[] {4, 4, 1, 9});

        conjuntos[2] = new Conjunto(TAMAÑO);
        conjuntos[2].insertar(new int[] {3, 98, 14, 4, 9});

        conjuntos[3] = conjuntos[0].copia();
        conjuntos[3].insertar(new int[] {2, 3});

        conjuntos[4] = conjuntos[1].copia();
        conjuntos[4].insertar(new int[] {4, 9});

        for (int i = 0; i <NUM_CONJUNTOS; i++) {
            System.out.print("El conjunto " + i + " es: ");
            conjuntos[i].mostrar();
        }
        System.out.println("----------------------------");

        Conjunto todosJuntos = new Conjunto(NUM_CONJUNTOS * TAMAÑO);
        for (int i = 0; i < NUM_CONJUNTOS; i++) {
            todosJuntos.unir(conjuntos[i]);
        }
        System.out.print("Al juntarlos todos con el método unir se obtiene: ");
        todosJuntos.mostrar();

        todosJuntos = new Conjunto();
        for (int i = 0; i < NUM_CONJUNTOS; i++) {
            todosJuntos = todosJuntos.union(conjuntos[i]);
        }
        System.out.print("Al juntarlos todos con el método union se obtiene: ");
        todosJuntos.mostrar();

        System.out.println("Son iguales 3 y 0: " + conjuntos[3].iguales(conjuntos[0]));
        System.out.println("Son iguales 4 y 1: " + conjuntos[4].iguales(conjuntos[1]));

        Conjunto comunes = conjuntos[2].interseccion(conjuntos[3]);
        System.out.print("Intersección de los conjuntos 2 y 3: ");
        comunes.mostrar();

        System.out.println("El conjunto 3 incluye al 0: " +
                conjuntos[3].contiene(conjuntos[0]));

        System.out.println("Son iguales 3 y 0: " + conjuntos[3].iguales2(conjuntos[0]));
        System.out.println("Son iguales 4 y 1: " + conjuntos[4].iguales2(conjuntos[1]));
        System.out.println("Son iguales 3 y 0: " + conjuntos[3].iguales3(conjuntos[0]));
        System.out.println("Son iguales 4 y 1: " + conjuntos[4].iguales3(conjuntos[1]));

        Conjunto diferencia = conjuntos[2].diferencia(conjuntos[1]);
        System.out.print("Diferencia entre el conjunto 2 y el 1: ");
        diferencia.mostrar();

        System.out.println("Son iguales 4 y 1: " + conjuntos[4].iguales2(conjuntos[1]));

    }
}
