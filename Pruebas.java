package EjercicioD;
import java.time.LocalDate;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiantes estudiante1=new Estudiantes ("juan", "rojas", "78936732-0", "casado", "filosofia");
		estudiante1.Imprimir();
		System.out.println("");
		estudiante1.agregarCurso("antropologia");
		estudiante1.Imprimir();
		System.out.println("");
		
		LocalDate fec = LocalDate.of(2010, 4, 5);
		
		Profesores profe2 = new Profesores("franklin", "soto", "2334435345-7", "soltero", fec , "filosofia");
		profe2.Imprimir();
		profe2.reasignarDespacho(23);
		System.out.println("");
		profe2.cambiarDepartamento("sociologia");
		profe2.Imprimir();
		System.out.println("");
		
		PersonalServicio aux1=new PersonalServicio("juan", "perez", "73532729-0", "casado", fec , "administracion");
		aux1.Imprimir();
		System.out.println("");
		aux1.cambiarSeccion("biblioteca");
		aux1.Imprimir();
	}
}
