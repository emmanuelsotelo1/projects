package tp3;

public class ejercicio2 {

	public static void main(String[] args) {
		
		
		int matriz[][] = new int[3][3];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				matriz[i][j] = (int)(Math.random()*100);
			}
		}
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
