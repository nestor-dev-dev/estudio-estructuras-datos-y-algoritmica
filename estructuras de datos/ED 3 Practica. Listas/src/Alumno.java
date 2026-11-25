public class Alumno {

	private String nombre;
	private int matricula;
	private ListaOrdinal expediente;//listaOrdinal evaluaciones

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
		ListaOrdinal aprobadas = new ListaOrdinal();
		IteradorListaOrdinal it = expediente.getIterador();
		Evaluacion ev;
		for (int i=0; i<expediente.getNumElementos(); i++){
			ev = it.next();
			if(ev.getNota() >= 5){
				aprobadas.insertar(ev);
			}
		}
		return aprobadas;
	}

	public double mediaAprobadas() {
		double res=0;
		ListaOrdinal aprobadas = asignaturasAprobadas();
		IteradorListaOrdinal it = aprobadas.getIterador();
		for(int i=0; i<aprobadas.getNumElementos(); i++){
			res+=it.next().getNota();
		}
		res/=aprobadas.getNumElementos();
		return res;
	}

	public int getNumAprobadas() {
		return asignaturasAprobadas().getNumElementos();
	}

	public void mostrar() {
		IteradorListaOrdinal it = expediente.getIterador();

		System.out.println(this.nombre+". Matricula: "+this.matricula);
		if(it.hasNext()){
			int numEv=0;
			for(int i=0; i<expediente.getNumElementos(); i++){
				System.out.print("	");
				it.next().mostrar();
				numEv++;
			}
			System.out.println(numEv+" evaluaciones y "+getNumAprobadas()+" asignaturas aprobadas" +
					" con califiación media "+mediaAprobadas());
		}else{
			System.out.println("No ha realizado ninguna evaluación");
		}
	}

}


