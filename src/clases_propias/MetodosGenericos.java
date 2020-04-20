package clases_propias;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {

		String[] nombres = { "juan", "luis", "martin" };
		String elementos = MisMatrices.getELementos(nombres);
		System.out.println(elementos);

		Empleado misEmpleados[] = { new Empleado("Julio", 23, 54433), new Empleado("Julio", 23, 54433),
				new Empleado("Julio", 23, 54433), new Empleado("Julio", 23, 54433) };
		System.out.println(MisMatrices.getELementos(misEmpleados));

		String[] enOrdenAlfabetico = { "Luis", "Pedro", "Martin", "Ana", "Samuel", "Felipe" };
		System.out.println(MisMatrices.getMenor(enOrdenAlfabetico));

		Empleado Luis = new Empleado("Luis", 23, 54433);
		Empleado Pedro = new Empleado("Pedro", 23, 54433);
		Empleado Martin = new Empleado("Martin", 23, 54433);
		Empleado Ana = new Empleado("Ana", 23, 54433);
		Empleado Samuel = new Empleado("Samuel", 23, 54433);
		Empleado Felipe = new Empleado("Felipe", 23, 54433);
		Empleado listaEmpleados[] = { Luis, Pedro, Martin, Ana, Samuel, Felipe };
//		Como empleados no implementa la interfaz comparable, no aplicable. 
//		System.out.println(MisMatrices.getMenor(listaEmpleados));

		GregorianCalendar fechas[] = { new GregorianCalendar(2020, 3, 18), new GregorianCalendar(2011, 3, 18),
				new GregorianCalendar(2018, 3, 18), new GregorianCalendar(2004, 3, 18),
				new GregorianCalendar(2016, 3, 18), new GregorianCalendar(2021, 3, 18) };
		System.out.println(MisMatrices.getMenor(fechas));
	}

}

class MisMatrices {

	/**
	 * 
	 * @param o
	 * @return
	 */
	public static <T> String getELementos(T[] o) {

		return "El array tiene " + o.length + " elementos.";
	}

	/**
	 * 
	 * @param objetoGenerico
	 * @return
	 */
	public static <T extends Comparable> T getMenor(T[] objetoGenerico) {

		if (objetoGenerico == null || objetoGenerico.length == 0) {
			return null;
		}

		T elementoMenor = objetoGenerico[0];

		for (int i = 0; i < objetoGenerico.length; i++) {

			if (elementoMenor.compareTo(objetoGenerico[i]) > 0) {
				elementoMenor = objetoGenerico[i];
			}
		}

		return elementoMenor;
	}

}
