package tp8ej3;

import java.util.Scanner;

public class Moto implements Vehiculo {
	
	private int velocidad = 0;

	public Moto(int velocidad) {

		this.acelerar(velocidad);
	}
	
	private void setVelocidad(int velocidad2) {
		this.velocidad=velocidad2;
	}
	
	@Override
	public void frenar() {
		
		int delantero=0,trasero=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuanto frenamos con el freno delantero?");
		delantero= sc.nextInt();
		System.out.println("Cuanto frenamos con el freno trasero?");
		trasero= sc.nextInt();
		
		

        this.velocidad-=(delantero+trasero);
        
        
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

		return "\nLa moto tiene 2 plazas";
	}

	@Override
	public int getVelocidad() {
		
		return this.velocidad;
	}

}
