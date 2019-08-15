package tp2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
	System.out.println("Ingrese números");
	Scanner entrada = new Scanner(System.in);
	int numeros[]= new int[10];
	
	for(int i=0; i<10; i++) {
		System.out.println(i+") Ingrese el número"+i);
		numeros[i]=entrada.nextInt();	
	}
	int pares=0;
	int media=0;
	
	for(int i=0; i<numeros.length; i++) {
		if(i%2==0 && i!=0) {
			pares++;
			media=media+numeros[i];						
		}
		
	}
	System.out.print("Media de las posiciones pares del array: "+media/pares);
		

	}

}
