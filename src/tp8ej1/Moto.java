package tp8ej1;

public class Moto implements Vehiculo {

	private int velocidad = 0;

	public Moto(int velocidad) {

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

		return "\nLa moto tiene 2 plazas";
	}

}
