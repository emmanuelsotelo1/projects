package p2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Facultad implements Informacion {
	
	private String nombre;
	TreeSet<Carrera> coleccionDeCarreras;
	
	public Facultad(TreeSet<Carrera> coleccionDeCarreras, String nombre) {
		this.coleccionDeCarreras = coleccionDeCarreras;
		this.nombre=nombre;
	}
	
	public void agregarCarrera(Carrera carrera) {
		coleccionDeCarreras.add(carrera);
		System.out.println(carrera.toString()+" se ha cargado");
	}
	
	public void eliminarCarrera(String nombre) {
		Iterator<Carrera> iterator = coleccionDeCarreras.iterator();
		
		while(iterator.hasNext()) {
			String buscado = iterator.next().getNombre();
			if(buscado.equals(nombre)) {
				iterator.remove();
				System.out.println(nombre+ "fue eliminada/o.");
			}
			}
	}
	
	public void eliminarEstudiante(Estudiante estudiante) {
		TreeSet<Carrera> coleccionEstudiante = null;
		Iterator<Carrera> iterator = coleccionEstudiante.iterator();
		
		while(iterator.hasNext()) {
			String buscado = iterator.next().getNombre();
			if(buscado.equals(nombre)) {
				iterator.remove();
				System.out.println(nombre+ "fue eliminada/o.");
			}
		}
	}

	
	
	@Override
	public int verCantidad() {
		Iterator<Carrera> iterator = coleccionDeCarreras.iterator();
		int contador = 0;
		while (iterator.hasNext()) {
			while(iterator!=null) {
			contador++;
			}	
		}
		return contador;
	}

	@Override
	public String listarContenidos() {
		System.out.println("LISTADO DE CARRERAS:");
		for(Carrera carrera : coleccionDeCarreras) {
			System.out.println(carrera.toString());
		}
		return nombre;
				
	}

	@Override
	public String toString() {
		return "Facultad [nombre=" + nombre + ", coleccionDeCarreras=" + coleccionDeCarreras + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeSet<Carrera> getColeccionDeCarreras() {
		return coleccionDeCarreras;
	}

	public void setColeccionDeCarreras(TreeSet<Carrera> coleccionDeCarreras) {
		this.coleccionDeCarreras = coleccionDeCarreras;
	}
	
	
	

}
