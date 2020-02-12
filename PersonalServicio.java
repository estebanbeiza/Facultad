package EjercicioD;

public class PersonalServicio extends Persona{

	private int anoCorporacion;
	private int numeroDespacho;
	private String seccion;
	
	PersonalServicio (int anoCorporacion, int numeroDespacho,String seccion){
		this.anoCorporacion = anoCorporacion;
		this.numeroDespacho = numeroDespacho;
		this.seccion = seccion;
			
	}

	public int getAnoCorporacion() {
		return anoCorporacion;
	}

	public void setAnoCorporacion(int anoCorporacion) {
		this.añoCorporacion = anoCorporacion;
	}

	public int getNumeroDespacho() {
		return numeroDespacho;
	}

	public void setNumeroDespacho(int numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public void reasignacionDespacho(int numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}
	
	public void trasladoSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public void imprimir() {
		System.out.println("Año"+ anoCorporacion);
		System.out.println("Nunero"+ numeroDespacho);
		System.out.println("Seccion"+ seccion);
	}
}
