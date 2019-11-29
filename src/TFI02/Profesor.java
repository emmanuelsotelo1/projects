package p2;

public class Profesor extends Persona {
	
	public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
		super(nombre, apellido, legajo);
		this.basico=basico;
		this.antiguedad=antiguedad;
		// TODO Auto-generated constructor stub
	}

	private double basico;
	private int antiguedad;
	

	public double calcularSueldo() {
		this.basico=((basico+basico*0.1)*antiguedad);
		return this.basico;
	}

	@Override
	public void modificarDatos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
