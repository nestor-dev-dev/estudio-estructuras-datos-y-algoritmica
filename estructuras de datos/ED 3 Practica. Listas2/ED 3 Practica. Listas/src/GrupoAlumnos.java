public class GrupoAlumnos {

	private String nombre;
	private ListaCalificada listaAlumnos;

	public GrupoAlumnos(String nombre) {
		this.nombre = nombre;
		listaAlumnos = new ListaCalificada();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void nuevoAlumno(Alumno alumno) {
		listaAlumnos.insertar(alumno);
	}

	public int getNumAlumnos() {
		return listaAlumnos.getNumElementos();
	}

	public Alumno getAlumno(int matricula) {
		return listaAlumnos.getElemento(matricula);
	}

	public double porcentajeAprobados(String nombreAsignatura) {
		int numAprobados=0;
		double resultado;
		IteradorListaCalificada it = listaAlumnos.getIterador();

		while(it.hasNext()){
			if(it.next().estaAprobado(nombreAsignatura)){
				numAprobados++;
			}
		}
		resultado =  Math.round((double)numAprobados/getNumAlumnos()*100);
		return resultado;
	}
}