package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {
	public static void main(String[] args) {
//		Empleado listaEmpleados[] = new Empleado[3];
//		listaEmpleados[0] = new Empleado("Juan",45,2500);
//		listaEmpleados[1] = new Empleado("Ana",55,2000);
//		listaEmpleados[2] = new Empleado("Luis",25,2600);

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
		
		//Insertando en una posicion especifica. metodo set
		listaEmpleados.set(2, new Empleado("Zabala",25,2600));
		
		System.out.println(listaEmpleados.get(1).dameDatos());
		listaEmpleados.trimToSize();
		System.out.println(listaEmpleados.size());

		System.out.println("\n----------- Bucle for convencional ---------------------");
		for (int i=0; i<listaEmpleados.size(); i++) {
			Empleado e  = listaEmpleados.get(i);
			System.out.println(i + "-" + e.dameDatos());
		}
		
		System.out.println("\n----------- Bucle for each ---------------------");
		for(Empleado e:listaEmpleados) {
			System.out.println(e.dameDatos());
		}

		System.out.println("\n----------- Conversion de arrayList a Array y Bucle for convencional ---------------------");
		Empleado arrayEmpleado[] = new Empleado[listaEmpleados.size()];
		listaEmpleados.toArray(arrayEmpleado);
		for(int i = 0; i<arrayEmpleado.length;i++) {
			System.out.println(arrayEmpleado[i].dameDatos());
		}
		
		
		System.out.println("\n----------- Bucle iterador ---------------------");
		Iterator <Empleado> iter = listaEmpleados.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().dameDatos());
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