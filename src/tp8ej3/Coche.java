package tp8ej3;

import java.util.Scanner;

public class Coche implements Vehiculo {
	
	private int velocidad = 0;

	public Coche(int velocidad) {
		this.acelerar(velocidad);
	}

	@Override
	public void frenar() {
		int frenar=0;
		Scanner p = new Scanner(System.in);
		System.out.println("¿Cuantos kmph quiere frenar?");
		this.velocidad-=frenar;
		if (this.velocidad>120) {
            System.out.println("CUIDADO, la velocidad máxima ha sido superada.");
        }else {
        	System.out.println("Acelerando...");
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
