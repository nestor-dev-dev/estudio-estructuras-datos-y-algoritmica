

public class AlgoritmosPila {

    public Asignatura asignaturaNotaMáxima(Pila asignaturas) {
        Asignatura resultado = null;
        //Completar
        if(!asignaturas.vacia() && asignaturas != null){
            resultado = asignaturas.desapilar();
            Asignatura aux = asignaturaNotaMáxima(asignaturas);
            asignaturas.apilar(resultado);

            if(aux != null){
                if(resultado.getNota() < aux.getNota()){
                    resultado=aux;
                }
            }
        }
        return resultado;
    }

    public double notaMínima(Pila asignaturas) {
        double resultado = 0;
        //Completar
        if(!asignaturas.vacia()){
            resultado = notaM2(asignaturas);
        }
        return resultado;
    }

    private double notaM2(Pila asignaturas){
        double resultado = 10;
        //Completar
        if(!asignaturas.vacia()){
            Asignatura as = asignaturas.desapilar();
            resultado = as.getNota();

            double aux = notaM2(asignaturas);

            if(aux < resultado){
                resultado = aux;
            }

            asignaturas.apilar(as);
        }
        return resultado;
    }


    public void mostrarAprobadas(Pila asignaturas) {
        //Completar
        if(!asignaturas.vacia()){
            Asignatura as = asignaturas.desapilar();
            mostrarAprobadas(asignaturas);

            if(as.getNota() >= 5){
                System.out.println(as.mostrar());
            }

            asignaturas.apilar(as);
        }
    }

}
