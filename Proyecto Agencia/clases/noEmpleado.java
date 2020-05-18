package clases;

public class noEmpleado extends personas {
	private String empresa;

	private String oficio;

	public noEmpleado(String empresa, String oficio, String nombre, String primerApellido, String segundoApellido,
			String dni, citas cita) {
		super(nombre, primerApellido, segundoApellido, dni, cita);
		this.empresa = empresa;
		this.oficio = oficio;
	}

	public void cambiarOficio() {
	}

}