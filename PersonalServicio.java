package PEjercio4;

public class PersonalServicio extends Persona{

	private int a�oCorporacion;
	private int numeroDespacho;
	private String seccion;
	
	PersonalServicio (int a�oCorporacion, int numeroDespacho,String seccion){
		this.a�oCorporacion = a�oCorporacion;
		this.numeroDespacho = numeroDespacho;
		this.seccion = seccion;
			
	}

	public int getA�oCorporacion() {
		return a�oCorporacion;
	}

	public void setA�oCorporacion(int a�oCorporacion) {
		this.a�oCorporacion = a�oCorporacion;
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
		System.out.println("A�o"+ a�oCorporacion);
		System.out.println("Nunero"+ numeroDespacho);
		System.out.println("Seccion"+ seccion);
	}
}
