package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {
	public static void main(String[] args) {

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.ensureCapacity(16);
		
		listaEmpleados.add(new Empleado("Ana",45,2500));
		listaEmpleados.add(new Empleado("Braulio",55,2000));
		listaEmpleados.add(new Empleado("Carlos",25,2600));
		listaEmpleados.add(new Empleado("David",25,2600));
		listaEmpleados.add(new Empleado("Esteban",25,2600));
		listaEmpleados.add(new Empleado("Felipe",45,2500));
		listaEmpleados.add(new Empleado("Gustavo",55,2000));
		listaEmpleados.add(new Empleado("Herminia",25,2600));
		listaEmpleados.add(new Empleado("Ines",25,2600));
		listaEmpleados.add(new Empleado("Julia",25,2600));
		listaEmpleados.add(new Empleado("Karina",45,2500));
		listaEmpleados.add(new Empleado("Luis",55,2000));
		listaEmpleados.add(new Empleado("Matias",25,2600));
		listaEmpleados.add(new Empleado("Noelia",25,2600));
		listaEmpleados.add(new Empleado("Omar",25,2600));
		
		System.out.println(listaEmpleados.size());
			
		for(Empleado e:listaEmpleados) {
			System.out.println(e.dameDatos());
		}
		
		
	}
}

class Empleado {
	
	public Empleado (String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene " + edad + " años, y un saladio de " + salario;
	}
	
	private String nombre;
	private int edad;
	private double salario;
	
}