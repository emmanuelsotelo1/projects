package tp7;

import java.util.Scanner;

public class Ejercicio3Excepcion {
	
	public static void pedirDatos() throws Ejercicio3ValornoNumerico
    {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean flag = true;

       do {
           try {
               flag=true;
               System.out.print("Ingrese un Numero: ");
               numero = entrada.nextInt();

               if (numero % 2 == 0) {
                   System.out.println("ES PAR");
               } else {
                   System.out.println("ES IMPAR");
               }
           } catch (Exception valorNoNumerico) {
               System.out.println("Lo que acaba de introducir no es un numero!");
               //throw new valorNoNumerico("Lo que acaba de introducir no es un numero!");
               flag = false;
               entrada.nextLine();
       }
       } while (flag == false);
    }
}

