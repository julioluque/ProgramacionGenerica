package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {
	public static void main(String[] args) {
		Empleado listaEmpleados[] = new Empleado[3];
		listaEmpleados[0] = new Empleado("Juan",45,2500);
		listaEmpleados[1] = new Empleado("Ana",55,2000);
		listaEmpleados[2] = new Empleado("Luis",25,2600);
			
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