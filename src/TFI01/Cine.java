package tfi01;

import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cantMax = 1000;
		Espectadores[] espectadores = new Espectadores[cantMax];
		
		for(int i=0; i<cantMax; i++) {
		
		System.out.println("Carga de espectadores");
		System.out.println("Nombre");
		String nombre = sc.next();
		System.out.println("Edad");
		int edad = sc.nextInt();
		System.out.println("Fila");
		String fila = sc.next();
		System.out.println("Silla");
		String silla = sc.next();
		Espectadores espectador = new Espectadores(nombre, edad, fila, silla);
		espectadores[i] = espectador;
		}
		
		Salas s1 = new Salas(3, "Joker");
		s1.setEspectadores(espectadores);
		System.out.println("LISTA DE ESPECTADORES PARA JOKER");
		s1.ListarEspectadores(espectadores);
		
		

		Acomodadores a1 = new Acomodadores("Roberto Trotta", 43);
		a1.setSala(s1);
		a1.setSueldo(50000.0);
		System.out.println("Datos del acomodador::::::::");
		System.out.println(a1.toString());
		Empleados e1 = new Empleados("Julio Cesar Toresani", 47);
		System.out.println("Datos del empleado:::::::::");
		System.out.println(e1.toString());

	}

}


