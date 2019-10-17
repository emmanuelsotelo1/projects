package tfi01;

public class Empleados extends Personas {

	public double sueldo;
	
	public Empleados(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Empleados() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	


	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+this.getNombre()+" Edad:"+this.edad;
	}
	
}
