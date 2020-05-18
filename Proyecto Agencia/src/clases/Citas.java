package clases;

import java.sql.Date;

/**
 * 
 * Esta clase contiene la información de las citas
 *
 */
public class Citas {

	/**
	 * Motivo de la cita
	 */
	private String motivo;

	/**
	 * Hora y fecha a la que COMIENZA la cita
	 */
	private Date horaComienzo;

	/**
	 * Hora y fecha a la que TERMINA la cita
	 */
	private Date horaFin;

	/**
	 * Código identificador de la cita
	 */
	private String codigo;

	/**
	 * Personas implicadas en la cita
	 */
	private Persona[] persona;

	/**
	 * Array de tipo fecha
	 */
	private Fecha[] fechas;

	/**
	 * Constructor vacío
	 */
	public Citas() {

	}

	/**
	 * 
	 * @param motivo
	 * @param horaComienzo
	 * @param horaFin
	 * @param codigo
	 * @param fecha
	 * @param persona
	 * @param myfecha      Constructor al cual se le pasan todos los parámetros
	 */
	public Citas(String motivo, Date horaComienzo, Date horaFin, String codigo, Fecha[] fecha, Persona[] persona,
			Citas myfecha) {
		this.motivo = motivo;
		this.horaComienzo = horaComienzo;
		this.horaFin = horaFin;
		this.codigo = codigo;
		this.persona = persona;
		this.fechas = fecha;
	}

	/**
	 * 
	 * @param copia Constructor de copia
	 */
	public Citas(Citas copia) {
		this.motivo = copia.motivo;
		this.horaComienzo = copia.horaComienzo;
		this.horaFin = copia.horaFin;
		this.codigo = copia.codigo;
		this.persona = copia.persona;
		this.fechas = copia.fechas;
	}

	// Métodos de la clase

	/**
	 * 
	 * Método para crear la frase (no está terminado)
	 */
	public void crearCita(Citas citaACrear) {
//			citas cita = new citas(citaACrear);
	}

	/**
	 * 
	 * @param horaComienzo
	 * @param horaFin      Cambia la hora de comienzo y final de la cita por las
	 *                     pasadas por parámetro
	 */
	public void modificarCita(Date horaComienzo, Date horaFin) {
		this.setHoraComienzo(horaComienzo);
		this.setHoraFin(horaFin);
	}

	/**
	 * Método para ver la fecha en la que comienza la cita
	 * 
	 * @return String
	 */
	public String verFicha() {
		return this.getHoraComienzo().toString();
	}

	/**
	 * Método para ver el array de las personas (no está terminado)
	 */
	public void verPersonas() {
//			for (personas personas : f.)
	}

	/**
	 * Devuelve el motivo de la cita
	 * 
	 * @return String
	 */
	public String verInformacion() {
		return this.getMotivo().toString();
	}

	/**
	 * Cambia las personas de la cita por las pasadas por parámetro
	 * 
	 * @param personaNueva
	 */
	public void cambiarPersonas(Persona[] personasNueva) {
		this.setPersona(personasNueva);
	}

	/**
	 * Cambia los datos (el motivo) de la cita por los pasados por parámetro
	 * 
	 * @param nuevoMotivo
	 */
	public void cambiarDatos(String nuevoMotivo) {
		this.setMotivo(nuevoMotivo);
	}

//		public void cambiarFecha(fecha fecha) {
//			this.setFecha(fecha);
//		}

	/**
	 * Borra las personas de la cita
	 */
	public void borrarPersonas() {
		this.setPersona(null);
	}

	// Getters y Setters
	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Date getHoraComienzo() {
		return horaComienzo;
	}

	public void setHoraComienzo(Date horaComienzo) {
		this.horaComienzo = horaComienzo;
	}

	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Persona getPersona() {
		return getPersona();
	}

	public void setPersona(Persona[] persona) {
		this.persona = persona;
	}

	public Fecha[] getfechas() {
		return fechas;
	}

	public void setfechas(Citas myfecha) {
		this.fechas = fechas;
	}

}