package p2;

public class Estudiante extends Persona {

	public Estudiante(String nombre, String apellido, int legajo) {
		super(nombre, apellido, legajo);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void modificarDatos() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + ", getNombre()="
				+ getNombre() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
