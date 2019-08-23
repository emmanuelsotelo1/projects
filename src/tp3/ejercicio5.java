package tp3;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		Scanner consola = new Scanner(System.in);
		
		for (int i=0; i < matriz.length; i++) {
			  for (int j=0; j < matriz.length; j++) {
			    System.out.println("Introduzca el elemento [" + i + "," + j + "]");
			    matriz[i][j] = consola.nextInt();
			  }
			}
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
	}
		System.out.println(" ");
		System.out.println(" ");
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int x=0; x<3; x++) {
					for(int y=0; y<3; y++) {
						if(matriz[i][j] < matriz [x][y]) {
							int temp = matriz[i][j];
							matriz[i][j] = matriz[x][y];
							matriz[x][y] = temp; 
						}
					}
				}
			}
		}
		
		System.out.println("Matriz ordenada");
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
	}
		
	}

}
