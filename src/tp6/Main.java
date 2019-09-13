package tp6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de contrase�as a generar: ");
		int cant = sc.nextInt();
		System.out.println("Ingrese la longitud de las contrase�as: ");
		int longitud = sc.nextInt();
		Contrase�a[] contrase�as = new Contrase�a[cant];

		for (int i = 0; i < contrase�as.length; i++) {
			Contrase�a nuevaContrase�a = new Contrase�a(longitud);
			contrase�as[i] = nuevaContrase�a;
		}

		for (Contrase�a contrase�a : contrase�as) {
			System.out.println("Contrase�a---> " + contrase�a.getContrase�a() + ". Es "
					+ contrase�a.seguridadContrase�a() + " de " + contrase�a.longitud() + " caracteres" + ". Contiene "
					+ contrase�a.getCantidadMin() + " min�scula/s, " + contrase�a.getCantidadMay() + " may�scula/s"
					+ " y " + contrase�a.getCantidadNum() + " n�mero/s.");

		}

	}

}