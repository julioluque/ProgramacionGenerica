package clases_propias;

public class UsoParejas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pareja <String> una = new Pareja<String> ();
		una.setPrimero("Julio");
		System.out.println(una.getPrimero());
		
		Persona persona1 = new Persona("Alfredo");
		Pareja<Persona> dos = new Pareja<Persona>();
		dos.setPrimero(persona1);
		System.out.println(dos.getPrimero());
		
		
		Pareja<Persona> tres = new Pareja<Persona>();
		dos.setPrimero(new Persona("Martin"));
		System.out.println(dos.getPrimero());
	}

}

class Persona {

	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "nombre=[" + nombre + "]";
	}

}