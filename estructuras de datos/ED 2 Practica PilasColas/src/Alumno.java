public class Alumno {
    private String nombre, matricula;
    private double calificacionMedia=0;
    private int numAsignaturas;
    private Pila asignatura = new Pila();

    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getCalificacionMedia() {
        return calificacionMedia/numAsignaturas;
    }

    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public Pila getAsignatura() {
        return asignatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCalificacionMedia(double calificacionMedia) {
        this.calificacionMedia = calificacionMedia;
    }

    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }

    public void setAsignatura(Pila asignatura) {
        this.asignatura = asignatura;
    }

    public void anadirAsignatura(Asignatura asignatura){
        //añadir asignatura
        this.asignatura.apilar(asignatura);

        //recalcular nota media
        numAsignaturas++;

        calificacionMedia += asignatura.getNota();
    }

    public void mostrarAlumno(){
        if(!this.asignatura.vacia()){
            System.out.println(this.nombre+". Matr: "+this.matricula+" ("+getCalificacionMedia()+")");
            this.asignatura.mostrar();
        }else{
            System.out.println("No está matriculado en ninguna asignatura");
        }
    }
}
