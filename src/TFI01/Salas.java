package tfi01;

import java.util.Arrays;

public class Salas {

	private int capacidad;
	private String pelicula;
	private String nombre;
	private Espectadores[] espectadores;
	
	public Salas(int capacidad, String nombre) {
		this.capacidad = capacidad;
		this.nombre = nombre;
	}

	public static void ListarEspectadores(Espectadores[] espectadores) {
		System.out.println("Lista de Espectadores:");
	    for (int i=0; i<espectadores.length; i++)
		{
		    if (espectadores[i] != null)
		    {
	            System.out.println(":::::::::::::::::::::");
	            System.out.println("Nombre: " + espectadores[i].getNombre());
	            System.out.println("Edad: " + espectadores[i].getEdad());
	            System.out.println("Butaca " + espectadores[i].getButaca());
	            }
		}
		System.out.println(":::::::::::::::::");
	}

	public void setEspectadores(Espectadores[] espectadores) {
		if(espectadores.length>capacidad) {
			System.out.println("Capacidad superada");
		}
			else {
				this.espectadores=espectadores;
			}
		}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Salas [capacidad=" + capacidad + ", pelicula=" + pelicula + ", nombre=" + nombre + ", espectadores="
				+ Arrays.toString(espectadores) + "]";
	}
	
	
	
}
