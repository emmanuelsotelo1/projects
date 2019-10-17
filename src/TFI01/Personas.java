package tfi01;

public abstract class Personas {
	
	public String nombre;
	public int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract String getTipo();
	public abstract String toString();
	

}
