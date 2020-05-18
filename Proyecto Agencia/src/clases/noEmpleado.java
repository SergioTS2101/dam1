package clases;

/**
 * 
 * Una clase referida a las personas que son ajenas a la empresa.
 *
 */

public class noEmpleado extends persona {
	
	/**
	 * Empresa a la que pertenece
	 */
	
	private String empresa;
	
	/**
	 * Cargo que se posee dentro de la empresa
	 */

	private String oficio;
	
	/**
	 * 
	 * @param empresa Empresa a la que pertenece
	 * 
	 * @param oficio  Cargo que se posee dentro de la empresa
	 * 
	 * El resto de parametros son propios de persona.
	 */

	public noEmpleado(String empresa, String oficio, String nombre, String primerApellido, String segundoApellido,
			String dni, citas[] cita) {
		super(nombre, primerApellido, segundoApellido, dni, cita);
		this.empresa = empresa;
		this.oficio = oficio;
	}
	
	/**
	 * Metodo que nos permite cambiar la informacion del cargo de un objeto noEmpleado, dando cabida asi a posibilidad de ascenso u otras situaciones.
	 * 
	 * @param nuevooficio Se introduce la nueva posicion de dicha persona dentro de la empresa.
	 */

	public void cambiarOficio(String nuevooficio) {
		noEmpleado e = null;
		e.oficio=nuevooficio;
	}

}