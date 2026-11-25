public class AlgoritmosCola {

    public void mostrarGrupo (Cola grupo) {
        Alumno a;
        System.out.println("El grupo tiene "+grupo.getNumElementos()+" alumnos:\n");
        for(int i = 0; i<grupo.getNumElementos(); i++){
            a= grupo.desencolar();
            System.out.print(i+1+". "+a.getNombre());
            grupo.encolar(a);
            System.out.println();
        }
    }

    public Cola alumnosAprobados (Cola grupo) {
        System.out.println("\n\n\nAlumnos aprobados: \n");
        Cola c = new Cola();
        for(int i=0; i< grupo.getNumElementos(); i++){
            Alumno a = grupo.desencolar();
            if(a.getCalificacionMedia() >= 5){
                c.encolar(a);
            }
            grupo.encolar(a);
        }
        return c;
    }

    public double calificaciónMedia (Cola grupo) {
        double resultado = 0;
        Alumno a;
        for(int i=0; i<grupo.getNumElementos(); i++){
            a=grupo.desencolar();
            resultado += a.getCalificacionMedia();
            grupo.encolar(a);
        }
        return resultado/ grupo.getNumElementos();
    }
}
