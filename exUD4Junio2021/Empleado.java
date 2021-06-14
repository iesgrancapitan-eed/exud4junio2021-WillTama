package exUD4Junio2021;

/**
 * Representa empleados con sus características
 * @author hetag
 *
 */
public class Empleado implements Comparable<Empleado> {
    /**
     * Nombre del empleado
     */
	public String nombre;
	/**
	 * Apellido del empleado
	 */
	public String apellido;
	/**
	 * Edad del empleado
	 */
	public int edad;
	/**
	 * Salario del empleado
	 */
	public double salario;

	/**
	 * Crea empleados
	 * @param nombre nombre del empleado
	 * @param apellido apellido del empleado
	 * @param edad edad del empleado
	 * @param salario salario del empleado
	 * @throws EdadIncorrectaException controla edades incorrectas
	 */
	public Empleado(String nombre, String apellido, int edad, double salario) throws EdadIncorrectaException {
		this.nombre = nombre;
		this.apellido = apellido;
		setEdad(edad);
		this.salario = salario;
	}

	/**
	 * Añade una edad al empleado
	 * @param edad edad del empleado
	 * @throws EdadIncorrectaException controla edades incorrectas
	 */
	private void setEdad(int edad) throws EdadIncorrectaException {
		if (edad <= 1 || edad >= 100) {
			throw new EdadIncorrectaException("La edad debe ser un valor entre 1 y 100");
		}
		this.edad = edad;
	}

	/**
	 * Devuelve el nombre del empelado
	 * @return nombre del empelado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el apellido del empelado
	 * @return apellido del empelado
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Devuelve la edad del empelado
	 * @return edad del empleado
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Devuelve el salario del empleado
	 * @return salario del empleado
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * 
	 * @param sueldoPlus añade plus al salario
	 * @return true si el empleado tiene más de 40 años, false si es menor
	 */
	public boolean plus(double sueldoPlus) {
		if (edad < 40)
			return false;

		salario += sueldoPlus;
		return true;
	}

	/**
	 * Devuelve el empleado en forma de cadena con sus atributos
	 */
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}

	/**
	 * Compara un empleado con otro, teniendo en cuenta la edad
	 */
	@Override
	public int compareTo(Empleado other) {
		if (this.edad == other.getEdad())
			return 0;
		if (this.edad > other.getEdad())
			return 1;
		return -1; // if(this.edad < other.getEdad()) return 1;
	}

}
