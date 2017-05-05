package ejercicio10Java;

import ejemplosCursoJava.*;
import java.util.Date;

class Empleado extends Persona {
	int id;
	Date fechaAlta;
	
	public void presentarse() {
		super.presentarse();
		System.out.println("Hola, soy un empleado y mi id es: " + this.id);
	}
	
}

public class ejercicio10 {
		public static void main(String args[]) {
			Empleado e = new Empleado();
			e.id = 100;
			e.fechaAlta = new Date();
			e.nombreyApellido = "José Delgado";
			e.sexo = 'M';
			e.edad = 31;
			e.domicilio = "Manoteras 32 Madrid";
			
			System.out.println(e.id);
			System.out.println(e.fechaAlta);
			
			System.out.println(e.nombreyApellido);
			
			e.presentarse();

		}
}
