package tp2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pos = 0;
		int neg = 0;
		int zero = 0;

		System.out.println("Ingrese numeros para el array");
		Scanner entrada = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Ingrese posicion:"+i);
			numeros[i]=entrada.nextInt();
	}

		for(int valor:numeros) {
			if(valor>0) {
				pos++;
			}else {
				if(valor<0) {
					neg++;
				}else {
					zero++;
				}
			}
		}
		
		System.out.print("Hay "+zero+ "ceros, "+ pos+" números positivos y "+neg+" números negativos.");
}
}