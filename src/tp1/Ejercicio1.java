package tp1;
import javax.swing.*;
public class Ejercicio1 {
	public static void main(String[] args) {

		int x = 0;
		while(x<10) {
		
		String nombre = JOptionPane.showInputDialog("Escriba su nombre por favor");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad por favor"));
		
		if(edad==0) {
			throw new RuntimeException("0 no es válido, programa finalizado");
		}
		if(edad>=18) {
		System.out.println(nombre + " es mayor de edad");
		}
		else {
		System.out.println(nombre + " es menor de edad");
		}
	}	
	}

}
