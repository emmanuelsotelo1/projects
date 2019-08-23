package tp3;

public class ejercicio4 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j] = (int)(Math.random()*100);
			}
		}
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
	}
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
		System.out.println(" ");
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
	}
		
	}
}
