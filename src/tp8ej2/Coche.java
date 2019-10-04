package tp8ej2;

public class Coche implements Vehiculo {

	private int velocidad = 0;

	public Coche(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public void frenar(int frenar) {
		int a = this.velocidad - frenar;
		if (a >= 0) {
			this.velocidad -= frenar;
		} else {
			System.out.println("No estas frenando nada");
		}
	}

	@Override
	public String acelerar(int acelerar) {
		this.velocidad += acelerar;

		if (this.velocidad > 120) {
			return "CUIDADO, la velocidad máxima ha sido superada.";
		} else {
			return "Acelerando...";
		}

	}

	@Override
	public String plazas() {

		return "\n El coche tiene 5 plazas";
	}

	@Override
	public int getVelocidad() {

		return this.velocidad;
	}

}
