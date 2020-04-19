package arraylist;

// simulacion de la clase array list
public class ArrayListManual {

	private Object[] datosElemento;

	private int i = 0;

	
	/**
	 * Constructor que indica el tamaño del array 
	 * @param z = Entero, indica tamaño
	 */
	public ArrayListManual(int z) {
		datosElemento = new Object[z];
	}

	/**
	 * Getter que devuelve un elemento que recibe por parametro
	 * @param i = entero, funciona como index
	 * @return = elemento indicado en el index
	 */
	public Object get(int i) {
		return datosElemento[i];
	}
	/**
	 * Setter, almacena un objeto en un index, y por contador, en los subsiguientes.
	 * @param o = Recibe un objeto en general.
	 */
	public void add(Object o) {
		datosElemento[i] = o;
		i++;
	}
}
