package tfi01;

public class Espectadores extends Personas {

	private String fila;
	private String silla;
	
	public Espectadores(String nombre, int edad, String fila, String silla) {
		this.nombre = nombre;
		this.edad = edad;
		this.fila = fila;
		this.silla = silla;		
	}
	
	public String getButaca() {
		return this.fila+this.silla;
	}
	
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Espectador";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
