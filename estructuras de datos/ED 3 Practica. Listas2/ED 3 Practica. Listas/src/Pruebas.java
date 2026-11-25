public class Pruebas {

    public static void main(String[] args) {
        System.out.println("Practica ED 3 Listas de: " + "Néstor Mato Compte");
        System.out.println("Numero Matricula: " + "br0350");
        System.out.println("********** PRUEBAS **********");
        Evaluacion ev1 = new Evaluacion("ED","Junio 19",4.5);
        Evaluacion ev2 = new Evaluacion("ED","Julio 19",-1);
        Evaluacion ev3 = new Evaluacion("ED","Junio 20",7.4);
        Evaluacion ev4 = new Evaluacion("Álgebra","Junio 18",6.4);
        ListaOrdinal evaluaciones = new ListaOrdinal();
        evaluaciones.insertar(ev1);
        evaluaciones.insertar(ev2);
        evaluaciones.insertar(ev3);
        evaluaciones.insertar(ev4);

        Alumno a1 = new Alumno("Felipe García Gómez",1253);
        Alumno a2 = new Alumno("Alicia Blázquez Martín",5622);

        a1.nuevaEvaluacion(ev1);
        a1.nuevaEvaluacion(ev2);
        a1.nuevaEvaluacion(ev3);
        a1.nuevaEvaluacion(ev4);
        System.out.println("----------- Asignaturas aprobadas por "+ a1.getNombre()+" ---------- ");

        IteradorListaOrdinal it = a1.asignaturasAprobadas().getIterador();
        while (it.hasNext()){
            Evaluacion evaluacion = it.next();
            System.out.println(evaluacion.getNombreAsignatura() + " (" + evaluacion.getConvocatoria() + ") :" + evaluacion.getNota());
        }

        System.out.println("----------- Asignaturas aprobadas por "+ a2.getNombre()+" ---------- :");

        IteradorListaOrdinal it2 = a2.asignaturasAprobadas().getIterador();
        while (it2.hasNext()){
            Evaluacion evaluacion2 = it2.next();
            System.out.println(evaluacion2.getNombreAsignatura() + " (" + evaluacion2.getConvocatoria() + ") :" + evaluacion2.getNota());
        }

        System.out.println("----------- MOSTRAR LOS ALUMNOS ------------");
        a1.mostrar();
        a2.mostrar();

        //LINKEDLIST

        AlumnoBib b1 = new AlumnoBib("Eduardo Parra Martín",8765);
        AlumnoBib b2 = new AlumnoBib("Sonia Torres Pardo",2345);

        b1.nuevaEvaluacion(ev1);
        b1.nuevaEvaluacion(ev2);
        b1.nuevaEvaluacion(ev3);
        b1.nuevaEvaluacion(ev4);

        System.out.println("----------- MOSTRAR LOS ALUMNOS BIBLIOTECA ------------");
        b1.mostrar();
        b2.mostrar();


        //PRUEBAS 4.1
        Alumno alumno1 = new Alumno("Pedro Jiménez del Pozo",8510);
        Evaluacion evaluacion1 = new Evaluacion("Fundamentos de Programación","Enero 19", 8.8);
        alumno1.nuevaEvaluacion(evaluacion1);
        ListaCalificada listaCalificada = new ListaCalificada();
        listaCalificada.insertar(alumno1);
        listaCalificada.insertar(a1);
        listaCalificada.insertar(a2);

        System.out.println("------------ ALUMNOS EN LA LISTA -------------");
        IteradorListaCalificada iteradorListaCalificada = listaCalificada.getIterador();
        while(iteradorListaCalificada.hasNext()){
            Alumno alumno = iteradorListaCalificada.next();
            alumno.mostrar();
        }

        //4.2.3
        System.out.println("---------- Borramos las claves menores a 6000------------");
        listaCalificada.borrarMenores(6000);
        IteradorListaCalificada itC2 = listaCalificada.getIterador();
        while(itC2.hasNext()){
            Alumno alumno = itC2.next();
            alumno.mostrar();
        }
        System.out.println("---------- Borramos las claves menores a 9000------------");
        System.out.println();
        listaCalificada.borrarMenores(9000);
        IteradorListaCalificada itC3 = listaCalificada.getIterador();
        while(itC3.hasNext()){
            Alumno alumno = itC3.next();
            alumno.mostrar();
        }
        listaCalificada.insertar(alumno1);
        listaCalificada.insertar(a1);
        listaCalificada.insertar(a2);

        System.out.println("----- Metemos todos los alumnos y borramos las claves mayores a 7000 ------");
        listaCalificada.borrarMayores(7000);
        IteradorListaCalificada itC4 = listaCalificada.getIterador();
        while(itC4.hasNext()){
            Alumno alumno = itC4.next();
            alumno.mostrar();
        }

        System.out.println("---------- Borramos las claves mayores a 10000------------");
        System.out.println();
        listaCalificada.borrarMayores(10000);
        IteradorListaCalificada itC5 = listaCalificada.getIterador();
        while(itC5.hasNext()){
            Alumno alumno = itC5.next();
            alumno.mostrar();
        }

        //5.5
        System.out.println("------------ CREADO EL GRUPO GX11------------");
        GrupoAlumnos grupo = new GrupoAlumnos("GX11");

        grupo.nuevoAlumno(alumno1);
        grupo.nuevoAlumno(a1);
        grupo.nuevoAlumno(a2);

        System.out.println("El grupo "+grupo.getNombre()+" tiene "+grupo.getNumAlumnos()+" alumnos");
        System.out.println("------------ Grupo GX11. Alumno con matrícula 8510 ------------");
        grupo.getAlumno(8510).mostrar();
        System.out.println("Porcentaje de aprobados en ED el grupo "+grupo.getNombre()+": "+grupo.porcentajeAprobados("ED")+"%");
    }
}
