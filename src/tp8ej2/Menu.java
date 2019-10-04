package tp8ej2;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
        
        int cantidad=0, decision=0,veloMoto=0, veloAuto=0, opcion=0, i=0;
        
        boolean opcion2 = true;

        System.out.println("HOLA! Dime cuantos vehiculos quieres crear: ");
        cantidad = sc.nextInt();
       
        Vehiculo[] vehiculos = new Vehiculo[cantidad];
        do{
            System.out.println("Elegí una acción\n" +
                    "1: Crear vehículos\n" +
                    "2: Listar vehículos\n" +
                    "5: SALIR");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:

                    for (i=0; i<vehiculos.length; i++){
                    	
                    	System.out.println("¿Crear moto(1) o coche(2)? ");
                        decision = sc.nextInt();
                        opcion2=true;
                        if (decision == 1){
                            System.out.println("A que velocidad desea que su moto este?");
                            veloMoto = sc.nextInt();
                            vehiculos[i] = new Moto(veloMoto);
                            do{
                            	 System.out.println("AHORA ELIJA:\n 1: Acelerar\n 2: Frenar\n 3: Cantidad de plazas\n 4: Velocidad actual\n 5: Finalizar");
                                 decision=sc.nextInt();
                                 if (decision==1){
                                 	System.out.println("¿Cuantos kmph quiere acelerar?");
                                 	int acelerar= sc.nextInt();
                                 	vehiculos[i].acelerar(acelerar);
                                 	
                                 }else if(decision == 2){
                                 	System.out.println("¿Cuantos kmph quiere frenar?");
                                 	int frenar= sc.nextInt();
                                 	vehiculos[i].frenar(frenar);
                                 	
                                 }else if(decision == 3){
                                 	vehiculos[i].plazas();
                                 	
                                 }else if(decision == 4){
                                  	System.out.println("Velocidad actual: "+vehiculos[i].getVelocidad());
                                 	
                                 }else if(decision == 5){
                                 	System.out.println("Finalizando...");
                                	
                                 }else{
                                 	System.out.println("Número incorrecto");
                                 }
                            }while(decision != 5);
                           
                        }else if (decision == 2){
                            System.out.println("A que velocidad desea que su coche este?");
                            veloAuto = sc.nextInt();
                            vehiculos[i] = new Coche(veloAuto);
                            do{
                           	 System.out.println("AHORA ELIJA:\n 1: Acelerar\n 2: Frenar\n 3: Cantidad de plazas\n 4: Velocidad actual\n 5: Finalizar");
                                decision=sc.nextInt();
                                if (decision==1){
                                	System.out.println("¿Cuantos kmph quiere acelerar?");
                                	int acelerar= sc.nextInt();
                                	vehiculos[i].acelerar(acelerar);
                                }else if(decision == 2){
                                	System.out.println("¿Cuantos kmph quiere frenar?");
                                	int frenar= sc.nextInt();
                                	vehiculos[i].frenar(frenar);
                                }else if(decision == 3){
                                	vehiculos[i].plazas();
                                	
                                }else if(decision == 4){
                                  	System.out.println("Velocidad actual: "+vehiculos[i].getVelocidad());
                                 	
                                }else if(decision == 5){
                                	System.out.println("Finalizando...");
                                	
                                }else{
                                	System.out.println("opcion incorrecta");
                                }
                           }while(decision != 5);
                        }else{
                            System.out.println("Número incorrecto");
                            opcion2=false;
                        }
                    
                    }
                    break;
                    
                case 2:
                	
                    for (i=0; i<vehiculos.length; i++){
                        System.out.println(vehiculos[i].plazas());
                        System.out.println("Velocidad actual: " + vehiculos[i].getVelocidad());
                    }
                    break;
                    
                case 5:
                    opcion2 = false;
                    break;
            }
        }while(opcion2 == true);
        

		

	}

}
