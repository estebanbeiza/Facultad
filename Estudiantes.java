package Ej10;

public class Estudiantes extends Personas{
	
	private String curso;
	
	
	public Estudiantes(String _nombre, String _apellido, String _rut, String _estadocivil, String curso) {
		super(_nombre, _apellido, _rut, _estadocivil);
		this.curso=curso;
		
	}
	public void imprimir() {
		System.out.println("Datos del Estudiante: ");
		super.imprimir();
	}
	
	

	@Override
	public String toString() {
		return "Estudiantes "+super.toString()+"[curso=" + curso + "]";
	}




	public String getCurso() {
		return curso;
	}




	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	

}
