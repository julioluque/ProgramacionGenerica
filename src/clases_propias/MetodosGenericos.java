package clases_propias;

import arraylist.*;

public class MetodosGenericos {

	public static void main(String[] args) {

		String[] nombres = { "juan", "luis", "martin"};
		String elementos = MisMatrices.getELementos(nombres);
		System.out.println(elementos);

		Empleado misEmpleados[] = { 
			new Empleado("Julio", 23, 54433), 
			new Empleado("Julio", 23, 54433),
			new Empleado("Julio", 23, 54433), 
			new Empleado("Julio", 23, 54433) 
		};
		System.out.println(MisMatrices.getELementos(misEmpleados));
		
		
	}

}

class MisMatrices {

	public static <T> String getELementos(T[] t) {
		return "El array tiene " + t.length + " elementos.";
	}

}
