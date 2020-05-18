package clases;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Esta clase indica al usuario el día, mes y año en el cual quiere tener la
 * cita con la empresa.
 * 
 * @author: Sergio Tomeo Samuel
 * @since: 18/05/2020
 */
public class fecha {

	// Atributos

	/**
	 * Día, mes y año de la fecha de la cita
	 */
	private Date fecha;

	/**
	 * Array con las citas
	 */
	private citas[] citas;

	// Constructores

	/**
	 * Constructor con 2 parámetros
	 * 
	 * @param fecha fecha completa de la cita solicitada.
	 * @param citas array con las citas que se han solicitado.
	 */
	public fecha(Date fecha, citas[] citas) {
		this.fecha = fecha;
		this.citas = null;
	}

	// Metodos

	/**
	 * 
	 */
	public void ocuparFecha() {

	}

	/**
	 * Este método permite recorrer el array de citas que almacena la clase fecha y
	 * nos muestra las citas que hay en cada fecha.
	 */
	public void verCitas() {
		fecha f = null;
		for (citas citas : f.citas) {
			System.out.println(f.citas.toString());
		}
	}

	/**
	 * Este método le pide al usuario que introduzca una fecha nueva para la cita
	 * que quiere pedir. Si la fecha introducida no existe salta la excepción que
	 * indica que la fecha no es válida.
	 */
	public void cambiarFecha() {
		fecha fecha = new fecha(null, null);
		System.out.println("Introduzca la nueva fecha en la que desee tener la cita");
		Scanner sc = new Scanner(System.in);
		String nuevaFecha = sc.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/YYYY");
		Date testDate = null;
		String date = nuevaFecha;
		try {
			testDate = df.parse(date);
			System.out.println(testDate);
		} catch (Exception e) {
			System.out.println("Introduzca un formato de fecha válido");
		}

		if (!df.format(testDate).equals(date)) {
			System.out.println(testDate);
		} else {
			System.out.println("Fecha nueva introducida.");
		}
		fecha.setFecha(nuevaFecha);
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public citas[] getCitas() {
		return citas;
	}

	public void setCitas(citas[] citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "La fecha seleccionada es " + fecha;
	}

}
