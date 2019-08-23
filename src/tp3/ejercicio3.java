package tp3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
	
		int x,y;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de personas a registrar"));
        String [][] Matriz = new String[3][n];
        String temp;
        Scanner sc = new Scanner(System.in);

        for (int j=0;   j<n;    j++){
            System.out.println("Ingrese los datos de la persona " +(j+1)+ " (Nombre, DNI y Edad). Presione enter al finalizar cada dato.");
            for (int i=0;   i<3;    i++){
                Matriz[i][j] = sc.next();
            }
        }

        for (x=0;   x<n-1;    x++){
            for (y=x+1;   y<n;    y++){
                if (Matriz[0][x].compareTo(Matriz[0][y])>0){        
                    for (int k=0;   k<3;    k++){
                        temp      = Matriz[k][x];
                        Matriz[k][x] = Matriz[k][y];
                        Matriz[k][y] = temp;
                    }
                }
            }
        }
        for (String[] Fila:Matriz) {
            for (String Elemento:Fila) {
                System.out.print(""+Elemento+"\t\t");
            }
            System.out.println();
        }

		
		

			
	}

}
