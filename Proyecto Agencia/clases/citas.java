package clases;

import java.util.Date;

public class citas {

	private String motivo;

	private Date horaComienzo;

	private Date horaFin;

	private String codigo;

	private fecha fecha;

	private personas persona;

	public citas(String motivo, Date horaComienzo, Date horaFin, String codigo, clases.fecha fecha, personas persona,
			) {
		this.motivo = motivo;
		this.horaComienzo = horaComienzo;
		this.horaFin = horaFin;
		this.codigo = codigo;
		this.fecha = fecha;
		this.persona = persona;
	}

	public void crearCita() {
	}

	public void modificarCita() {
	}

	public void verFecha() {
	}

	public void verPersonas() {
	}

	public void verInformacion() {
	}

	public void cambiarPersonas() {
	}

	public void cambiarDatos() {
	}

	public void cambiarFecha() {
	}

	public void borrarPersonas() {
	}

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

	public fecha getFecha() {
		return fecha;
	}

	public void setFecha(fecha fecha) {
		this.fecha = fecha;
	}

	public personas getPersona() {
		return persona;
	}

	public void setPersona(personas persona) {
		this.persona = persona;
	}

}