package tp3;

import java.util.Random;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Random ran = new Random(System.nanoTime());
		int[] array = new int[100];
		
		for(int i=0;i<array.length;i++) {
			array[i] = ran.nextInt(array.length);
		}
		for(int element:array) {
			System.out.print(element+", ");
		}
		
		
	}

}
