package clases;

/**
 * 
 * Clase persona, nos sirve de padre de las clases empleado y noEmpleado dotandoles de una serie de atributos y metodos comunes.
 *
 */

public class persona {
	
	/**
	 * Nombre de la persona
	 */

	private String nombre;
	
	/** 
	 * Primer apellido de la persona
	 */

	private String primerApellido;
	
	/**
	 * Segundo apellido de la persona
	 */

	private String segundoApellido;
	
	/**
	 * DNI de la persona
	 */

	private String dni;
	
	/**
	 * Array de citas que ha tenido la persona
	 */

	private citas[] citas;
	
	/**
	 * 
	 * @param nombre nombre de la persona
	 * @param primerApellido primer apellido de la persona 
	 * @param segundoApellido segundo apellido de la persona
	 * @param dni DNI de la persona
	 * @param cita almacena las citas que ha tenido cada persona.
	 */

	public persona(String nombre, String primerApellido, String segundoApellido, String dni, citas[] cita) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.dni = dni;
		this.citas = null;
	}
	
	/**
	 * Nos permite recorrer el array de citas que almacena cada persona, y nos
	 * devuelve la informacion de las citas que ha tenido dicha persona.
	 */
	
	public void verCitas() {
		persona p = null;
		for (citas citas : p.citas) {
			System.out.println(p.citas.toString());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public citas[] getCitas() {
		return citas;
	}

	public void setCitas(citas[] citas) {
		this.citas = citas;
	}

	
}
