public class Pruebas {

    public static void main(String[] args) {
        System.out.println("********** PRUEBAS **********");

        Evaluacion e1 = new Evaluacion("ED", "Junio 19", 4.5);
        Evaluacion e2 = new Evaluacion("ED", "Junio 19", -1);
        Evaluacion e3 = new Evaluacion("ED", "Junio 20", 7.4);
        Evaluacion e4 = new Evaluacion("Algebra", "Junio 18", 6.4);

        ListaOrdinal evaluaciones = new ListaOrdinal();
        evaluaciones.insertar(e1);
        evaluaciones.insertar(e2);
        evaluaciones.insertar(e3);
        evaluaciones.insertar(e4);

        //mostrar
        IteradorListaOrdinal itEv = evaluaciones.getIterador();
        for(int i=0; i<evaluaciones.getNumElementos(); i++){
            Evaluacion actual = itEv.next();
            actual.mostrar();
        }

        System.out.println("Convocatioria en ED: "+evaluaciones.numConvocatorias("ED"));
        System.out.println("Convocatioria en Algebra : "+evaluaciones.numConvocatorias("Algebra"));
        System.out.println("Convocatioria en Fundamentos de Programación : "+evaluaciones.numConvocatorias("FP"));


        Alumno felipe = new Alumno("Felipe García Gómez", 1253);
        Alumno alicia = new Alumno("Alicia Blázquez Martín", 5622);
        felipe.nuevaEvaluacion(e1);
        felipe.nuevaEvaluacion(e2);
        felipe.nuevaEvaluacion(e3);
        felipe.nuevaEvaluacion(e4);

        System.out.println("Asignaturas aprobadas de Felipe: ");
        IteradorListaOrdinal it = felipe.asignaturasAprobadas().getIterador();
        while (it.hasNext()){
            it.next().mostrar();
        }

        System.out.println("Asignaturas aprobadas de Alicia: ");//alicia no tiene ninguna asignatura
        IteradorListaOrdinal it1 = alicia.asignaturasAprobadas().getIterador();
        while (it1.hasNext()){
            it1.next().mostrar();
        }

        System.out.println("\n\n");
        felipe.mostrar();
        alicia.mostrar();


    }
}
