package p2;

public abstract class Persona implements Comparable {
	
	public String nombre;
	public String apellido;
	public int legajo;
	
	
	
	
	public Persona(String nombre, String apellido, int legajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
	}

	public abstract void modificarDatos();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
