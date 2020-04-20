package clases_propias;

public class HerenciaGenerica {

	public static void main(String[] args) {

//		Ejemplo de una herencia de clases clasica
		Empleado DesarrolladorJava = new Empleado("Julio", 35, 60000);
		Empleado Seguridad = new Empleado("Jose", 52, 45000);
		Jefe GerenteDesarrollo = new Jefe("Hernan", 45, 150000);

		Empleado LejagoBancario1 = Seguridad;
		Empleado LegajoBancario2 = GerenteDesarrollo;
		Empleado LegajoBancario3 = DesarrolladorJava;

//		Ejemplo de herencia generica, demuestra que no funciona igual.
		Pareja<Empleado> DesarrolladorReact = new Pareja<Empleado>();
		Pareja<Jefe> GerenteFinanzas = new Pareja<Jefe>();

//		Error Type mismatch: Cannot convert from Pareja<Jefe> to Pareja<Empleado> 
//		Pareja<Empleado> LegajoBancario4 = GerenteFinanzas;

//		Admite herencia generica agregando tipos comodin en el metodo imprimirTrabajador
		Pareja.imprimirTrabajador(DesarrolladorReact);
		Pareja.imprimirTrabajador(GerenteFinanzas);

	}

}
