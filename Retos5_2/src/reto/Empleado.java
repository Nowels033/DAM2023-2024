package reto;

public class Empleado {
	
//	Empleados (superclase): nombre, sueldo, getSueldo(), toString()

	private String nombre;
	private double sueldo;
	/**
	 * @param nombre
	 * @param sueldo
	 */
	public Empleado(String nombre, double sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	
	
//	/**
//	 * @param nombre
//	 */
//	public Empleado(String nombre) {
//		this(nombre,1500);
//		this.nombre = nombre;
//	}
//


	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo el sueldo a establecer
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	@Override
	public String toString() {
		return "Empleado [Nombre =" + getNombre() + ", Sueldo =" + getSueldo() + "]";
	}
	
	
	
	
	
}
