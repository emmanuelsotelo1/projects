package tp7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Ingrese un valor");
		n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		}
		catch(InputMismatchException e) {
			System.out.println("El valor introducido no es correcto, el programa se cerrará");
		}
		sc.close();
	}

}
