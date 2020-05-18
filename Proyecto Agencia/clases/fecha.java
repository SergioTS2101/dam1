package clases;

import java.util.Date;

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
	 * Día de la fecha de la cita
	 */
	private Date dia;
	/**
	 * Mes de la fecha de la cita
	 */
	private Date mes;
	/**
	 * Año de la fecha de la cita
	 */
	private Date anio;
	/**
	 * Array con las citas
	 */
	private citas citas;

	//Constructores
	
	/**
	 * Constructor con 4 parámetros
	 * @param dia
	 * @param mes
	 * @param 
	 * @param
	 */
	public fecha(Date dia, Date mes, Date anio, citas citas) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.citas = citas;
	}

	public void insertarDia() {
		System.out.println("Introduzca el día para el cual desea pedir la cita/mm/yyyy");
		Scanner sc = new Scanner(System.in);
		String fecha = sc.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date testDate = null;
		String date = fecha;
		try {
			testDate = df.parse(date);
			System.out.println("Ahora hemos creado un objeto date con la fecha indicada, " + testDate);
		} catch (Exception e) {
			System.out.println("invalid format");
		}

		if (!df.format(testDate).equals(date)) {
			System.out.println("invalid date!!");
		} else {
			System.out.println("valid date");
		}

	}

	public void insertarMes() {

	}

	public void insertarAnio() {

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

	public int getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(Date mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
	}

	public citas getCitas() {
		return citas;
	}

	public void setCitas(citas citas) {
		this.citas = citas;
	}

}
