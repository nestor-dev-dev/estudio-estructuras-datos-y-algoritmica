public class Alumno {

    private String nombre;
    private int matricula;
    private ListaOrdinal expediente;

    public Alumno(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        expediente = new ListaOrdinal();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void nuevaEvaluacion(Evaluacion evaluacion) {
        expediente.insertar(evaluacion);
    }

    public boolean estaAprobado(String nombreAsig) {
        boolean aprobado = false;
        IteradorListaOrdinal it = expediente.getIterador();
        while (it.hasNext() && !aprobado) {
            Evaluacion evaluacion = it.next();
            if (evaluacion.getNombreAsignatura().equals(nombreAsig) &&
                    evaluacion.getNota() >= 5.0) {
                aprobado = true;
            }
        }
        return aprobado;
    }

    public ListaOrdinal asignaturasAprobadas() {
        IteradorListaOrdinal it = expediente.getIterador();
        ListaOrdinal nueva = new ListaOrdinal();
        while (it.hasNext()) {
            Evaluacion evaluacion = it.next();
            if (evaluacion.getNota() >= 5) {
                nueva.insertar(evaluacion);

            }
        }
        return nueva;
    }

    public double mediaAprobadas() {
        double media = 0.0;
        int numAsignaturas = 0;
        IteradorListaOrdinal it = asignaturasAprobadas().getIterador();
        while (it.hasNext()) {
            numAsignaturas++;
            Evaluacion evaluacion = it.next();
            media = (media + evaluacion.getNota()) / numAsignaturas;
        }

        return media;  // Eliminar esta línea al codificar el método
    }

    public int getNumAprobadas() {
        return asignaturasAprobadas().getNumElementos();
    }

    public void mostrar() {
        IteradorListaOrdinal it = expediente.getIterador();
        System.out.println(nombre + ".Matricula: " + matricula);
        while (it.hasNext()) {
            Evaluacion evaluacion = it.next();
            if(evaluacion.getNota() >= 0){
                System.out.println(evaluacion.getNombreAsignatura() + " (" + evaluacion.getConvocatoria() + ") :" + evaluacion.getNota());
            }else{//SI es -1 es NP
                System.out.println(evaluacion.getNombreAsignatura() + " (" + evaluacion.getConvocatoria() + ") : NP");

            }
            //System.out.println();
        }
        if (getNumAprobadas() >= 1) {
            System.out.println(expediente.getNumElementos() + " evaluaciones y " + getNumAprobadas() + " asignaturas aprobadas con calificacion media " + mediaAprobadas());
            System.out.println("------------------------------");
        } else {
            System.out.println("No ha realizado ninguna evaluacion.");
            System.out.println("------------------------------");

        }
    }

}


