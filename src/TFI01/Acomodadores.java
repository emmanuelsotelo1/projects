package tfi01;

public class Acomodadores extends Empleados implements ParaAcomodadores {

	

	public Acomodadores(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	private Salas sala;

	

	@Override
	public Salas getSala() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSala(Salas sala) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Nombre: "+this.nombre+", Edad: "+this.edad+" Sueldo: "+this.sueldo;
	}
	
	
	
	
}
