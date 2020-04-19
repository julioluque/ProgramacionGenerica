package arraylist;

import java.io.File;

public class UsoArrayListManual {

	public static void main(String[] args) {

//		instanciamos la clase solo Strings
		ArrayListManual nombres = new ArrayListManual(4);

//		Rellenamos los 4 elementos
		nombres.add("Julio");
		nombres.add("Martin");
		nombres.add("Maria");
		nombres.add("Ana");

//		Nos obliga a hacer un casting.
		String nombre = (String) nombres.get(1);

		System.out.println(nombre);

//		Instanciamos la clase con diferentes elementos
		ArrayListManual varios = new ArrayListManual(4);
		varios.add("Julio");
		varios.add(23);
		varios.add(68.54);
		varios.add(new File("Documentacion adjunta.doc"));

//		muchos casteos
		String alumno = (String) varios.get(0);
		int edad = (int) varios.get(1);
		double peso = (double) varios.get(2);
		File legajo = (File) varios.get(3);

		System.out.println("Alumnto: " + alumno + ", edad: " + edad + ", peso: " + peso + ", legajo " + legajo);

	}

}
