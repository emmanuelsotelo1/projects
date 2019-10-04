package tp8ej2;

public class Moto implements Vehiculo {

	private int velocidad = 0;

	public Moto(int velocidad) {

		this.acelerar(velocidad);
	}
	
	private void setVelocidad(int velocidad2) {
		this.velocidad=velocidad2;
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

		return "\nLa moto tiene 2 plazas";
	}

	@Override
	public int getVelocidad() {

		return this.velocidad;
	}

}
