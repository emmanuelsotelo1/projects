package tp7;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pedirdatos();
	}

	static void pedirdatos() throws NumeronoValido {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un valor");
		int n = sc.nextInt();
		if (n > 100 || n < 0) {
			NumeronoValido miExcepcion = new NumeronoValido("numero fuera de rango");
			throw miExcepcion;
		}	
		System.out.println("El numero ingresado es: " + n);
		sc.close();

	
	}
	
}

	class NumeronoValido extends RuntimeException {
	
		public NumeronoValido() {

		}

		public NumeronoValido(String mensajeError) {
			super(mensajeError);
		}

}