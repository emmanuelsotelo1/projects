package tp8ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vehiculo[] vehiculos = new Vehiculo[2];

		vehiculos[0] = new Coche(80);
		vehiculos[1] = new Moto(95);
		
		System.out.println("¡Aceleremos el coche, luego el auto!");
		

		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println("¿Cuantos kmph quiere acelerar?");
			int acelerar = sc.nextInt();
			System.out.println(vehiculos[i].acelerar(acelerar));
			System.out.println("¿Cuantos kmph quiere frenar?");
			int frenar = sc.nextInt();			
			vehiculos[i].frenar(frenar);
		}
			int flag = 0;
			System.out.println("Presione 1 para conocer plazas, 0 para salir");
			Scanner scc = new Scanner(System.in);
			flag = scc.nextInt();
			if(flag==1) {
				int i=0;
				System.out.println(vehiculos[i].plazas());
				i=1;
				System.out.println(vehiculos[i].plazas());
			}
			else sc.close();
		
		

	}

}
