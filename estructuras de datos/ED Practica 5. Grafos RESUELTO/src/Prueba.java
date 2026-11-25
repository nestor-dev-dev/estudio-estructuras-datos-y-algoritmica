
public class Prueba {
    public static void main (String [] args) {
        final int numeroContactos = 10;
        Persona persona1 = new Persona("Juan", "111111", "Nadie");
        Persona persona2 = new Persona("Jose", "222222", "Cuervo");
        Persona persona3 = new Persona("Eva", "333333", "Adan");
        Persona persona4 = new Persona("Alicia", "777777", "Maravillas");
        Persona persona5 = new Persona("Alan", "999999", "Turing");
        Persona persona6 = new Persona("Guillermo", "159267", "Tell");
        Persona persona7 = new Persona("Julio", "123456", "Catedrales");
        Persona persona8 = new Persona("Lucas", "231465", "Pato");
        Persona persona9 = new Persona("Paula", "654321", "Vázquez");
        Persona persona10 = new Persona("Clara", "123654", "Oscuro");

        Persona[] contactos = new Persona[numeroContactos];
        contactos[0] = persona1;
        contactos[1] = persona2;
        contactos[2] = persona3;
        contactos[3] = persona4;
        contactos[4] = persona5;
        contactos[5] = persona6;
        contactos[6] = persona7;
        contactos[7] = persona8;
        contactos[8] = persona9;
        contactos[9] = persona10;

        Seguir_AETSISI g = new Seguir_AETSISI(numeroContactos,contactos);
        g.insertaRelacion(0, 1);
        g.insertaRelacion(0, 5);
        g.insertaRelacion(0, 3);
        g.insertaRelacion(1, 5);
        g.insertaRelacion(1, 4);
        g.insertaRelacion(3, 0);
        g.insertaRelacion(4, 5);
        g.insertaRelacion(5, 0);
        g.insertaRelacion(5, 4);
        g.insertaRelacion(6, 8);
        g.insertaRelacion(8, 6);
        g.insertaRelacion(2, 9);
        g.insertaRelacion(2, 7);
        g.insertaRelacion(7, 9);
        g.insertaRelacion(9, 7);
        // Completar con todas las pruebas de los métodos del apartado 2.2.

        System.out.println("Apartado 2.2.1. Numero de grupos:");
        System.out.println("    Hay " + g.contarGrupos() + " grupos.");

        System.out.println("\nApartado 2.2.2. Mostrar seguidos por Guillermo directamente:");
        g.mostrarSeguidosPorADirectamente("Guillermo");

        System.out.println("\nApartado 2.2.3. Mostrar seguidores directos de Juan:");
        g.mostrarSeguidoresDirectoDe("Juan");

        System.out.println("\nApartado 2.2.4. pertenecen al mismo Grupo.");
        g.sonDelMismoGrupo(persona8, persona10);

        System.out.println("\nApartado 2.2.5. Mostrar personas mismo Grupo de Clara 9");
        g.motrarMiembrosGrupo(persona10);

        System.out.println("\nApartado 2.2.6. Mostrar personas seguidas directa o indirectamente por Guillermo 5");
        g.motrarSeguidosPor(persona6);

        System.out.println("\n Apartado 2.2.7. Juan 0 sigue a Alicia 3");
        System.out.println(g.mostrarEsSeguidaPor("Juan", "Alicia"));

        System.out.println("\nApartado 2.2.8. Seguidores de alicia");
        g.mostrarSeguidoresDe("Alicia");
    }
}
