package clases;

public class noEmpleado extends personas {

	public noEmpleado(String nombre, String primerApellido, String segundoApellido, String dni, citas cita) {
		super(nombre, primerApellido, segundoApellido, dni, cita);
	}

	public String empresa;

	public String oficio;

	public void cambiarOficio() {
	}

}