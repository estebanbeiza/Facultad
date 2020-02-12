package PEjercio4;

public class PersonalServicio extends Persona{

	private int aņoCorporacion;
	private int numeroDespacho;
	private String seccion;
	
	PersonalServicio (int aņoCorporacion, int numeroDespacho,String seccion){
		this.aņoCorporacion = aņoCorporacion;
		this.numeroDespacho = numeroDespacho;
		this.seccion = seccion;
			
	}

	public int getAņoCorporacion() {
		return aņoCorporacion;
	}

	public void setAņoCorporacion(int aņoCorporacion) {
		this.aņoCorporacion = aņoCorporacion;
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
		System.out.println("Aņo"+ aņoCorporacion);
		System.out.println("Nunero"+ numeroDespacho);
		System.out.println("Seccion"+ seccion);
	}
}
