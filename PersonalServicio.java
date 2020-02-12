package PEjercio4;

public class PersonalServicio extends Persona{

	private int añoCorporacion;
	private int numeroDespacho;
	private String seccion;
	
	PersonalServicio (int añoCorporacion, int numeroDespacho,String seccion){
		this.añoCorporacion = añoCorporacion;
		this.numeroDespacho = numeroDespacho;
		this.seccion = seccion;
			
	}

	public int getAñoCorporacion() {
		return añoCorporacion;
	}

	public void setAñoCorporacion(int añoCorporacion) {
		this.añoCorporacion = añoCorporacion;
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
		System.out.println("Año"+ añoCorporacion);
		System.out.println("Nunero"+ numeroDespacho);
		System.out.println("Seccion"+ seccion);
	}
}
