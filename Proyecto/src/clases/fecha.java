package clases;

import java.util.Date;
import java.util.Vector;

public class fecha {

	private Date dia;

	private Date mes;

	private Date anio;

	private Vector mycitas;

	public fecha(Date dia, Date mes, Date anio, Vector mycitas) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.mycitas = mycitas;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Date getMes() {
		return mes;
	}

	public void setMes(Date mes) {
		this.mes = mes;
	}

	public Date getAnio() {
		return anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
	}

	public Vector getMycitas() {
		return mycitas;
	}

	public void setMycitas(Vector mycitas) {
		this.mycitas = mycitas;
	}

	public void modificarFecha() {
	}

	public void ocuparFecha() {
	}

	public void verCitas() {
	}

	public void cambiarDia() {
	}

	public void cambiarMes() {
	}

	public void cambiarAnio() {
	}

}
