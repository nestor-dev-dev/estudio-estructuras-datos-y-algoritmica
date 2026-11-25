import java.util.Iterator;
import java.util.LinkedList;

public class AlumnoBib {

    private String nombre;
    private int matricula;
    private  LinkedList<Evaluacion> expediente = new LinkedList<Evaluacion>();


    public AlumnoBib(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
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
        expediente.add(evaluacion);
    }

    public boolean estaAprobado(String nombreAsig) {
        boolean aprobado = false;
        Iterator<Evaluacion> it =expediente.iterator();
        while (it.hasNext() && !aprobado) {
            Evaluacion evaluacion = it.next();
            if (evaluacion.getNombreAsignatura().equals(nombreAsig) &&
                    evaluacion.getNota() >= 5.0) {
                aprobado = true;
            }
        }
        return aprobado;
    }

    public LinkedList<Evaluacion> asignaturasAprobadas() {
        Iterator<Evaluacion> it =expediente.iterator();
        LinkedList<Evaluacion> nueva = new LinkedList<Evaluacion>();
        while (it.hasNext()) {
            Evaluacion evaluacion = it.next();
            if (evaluacion.getNota() >= 5) {
                nueva.add(evaluacion);

            }
        }
        return nueva;
    }

    public double mediaAprobadas() {
        double media = 0.0;
        int numAsignaturas = 0;
        Iterator<Evaluacion> it =asignaturasAprobadas().iterator();

        while (it.hasNext()) {
            numAsignaturas++;
            Evaluacion evaluacion = it.next();
            media = (media + evaluacion.getNota()) / numAsignaturas;
        }

        return media;
    }

    public int getNumAprobadas() {
        return asignaturasAprobadas().size();
    }

    public void mostrar() {
        Iterator<Evaluacion> it =expediente.iterator();
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
        if (getNumAprobadas() > 1) {
            System.out.println(expediente.size() + " evaluaciones y " + getNumAprobadas() + " asignaturas aprobadas con calificacion media " + mediaAprobadas());
            System.out.println("------------------------------");
        } else {
            System.out.println("No ha realizado ninguna evaluacion.");
            System.out.println("------------------------------");

        }
    }

}


