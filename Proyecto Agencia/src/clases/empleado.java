package clases;

public class empleado extends persona {
	private String id_empleado;

	public empleado(String id_empleado, String nombre, String primerApellido, String segundoApellido, String dni,
			citas[] cita) {
		super(nombre, primerApellido, segundoApellido, dni, cita);
		this.id_empleado = id_empleado;
	}

}
