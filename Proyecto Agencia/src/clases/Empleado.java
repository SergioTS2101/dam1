package clases;

public class Empleado extends Persona {
	private String id_empleado;

	public Empleado(String id_empleado, String nombre, String primerApellido, String segundoApellido, String dni,
			Citas[] cita) {
		super(nombre, primerApellido, segundoApellido, dni, cita);
		this.id_empleado = id_empleado;
	}

}
