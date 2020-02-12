package EjercicioD;
import java.time.LocalDate;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiantes estudiante1=new Estudiantes ("juan", "rojas", "78936732-0", "casado", "filosofia");
		estudiante1.imprimir();
		System.out.println("");
		
		//reasignar Curso de estudiante
		estudiante1.setCurso("antropologia");
		estudiante1.imprimir();
		System.out.println("");
		
		LocalDate fec = LocalDate.of(2010, 4, 5);
		
		Profesores profe2 = new Profesores("franklin", "soto", "2334435345-7", "soltero", "filosofia", fec, 22);
		profe2.imprimir();
		
		//Reasignar despacho de profesor
		profe2.setDespacho(23);
		
		System.out.println("");
		profe2.cambiarDepartamento("sociologia");
		profe2.imprimir();
		System.out.println("");
		
		PersonalServicio aux1=new PersonalServicio("juan", "perez", "73532729-0", "casado", 1990, 34,  "administracion");
		aux1.imprimir();
		System.out.println("");
		aux1.cambiarSeccion("biblioteca");
		aux1.imprimir();
	}
}
