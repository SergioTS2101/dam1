package clases;

public class personas {

	private String nombre;

	private String primerApellido;

	private String segundoApellido;

	private String dni;

	private citas cita;

	public personas(String nombre, String primerApellido, String segundoApellido, String dni, citas cita) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.dni = dni;
		this.cita = cita;
	}

	public void verCitas() {
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

	public citas getCita() {
		return cita;
	}

	public void setCita(citas cita) {
		this.cita = cita;
	}

}