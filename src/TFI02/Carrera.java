package p2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Carrera implements Informacion {
	
	private String nombre;
	TreeSet<Materia> coleccionMateria;
	
	public Carrera(TreeSet<Materia>coleccionMateria, String nomrbe) {
		this.coleccionMateria=coleccionMateria;
		this.nombre=nombre;
	}
	
	
	
	public void agregarMateria(Materia materia) {
		
		coleccionMateria.add(materia);
		System.out.println(materia.toString()+ "se ha cargado");
	}
	
	public void eliminarMateria() {
		Iterator<Materia> iterator = coleccionMateria.iterator();
		
		while(iterator.hasNext()) {
			String buscado = iterator.next().getNombre();
			if(buscado.equals(nombre)) {
				System.out.println("Desea eliminar esta materia? 1=SI - 2=NO");
				Scanner sc = new Scanner(System.in); int option=10;
				if(option==1) {
					iterator.remove();
					System.out.println(nombre+ "fue eliminada/o.");
				}
				else break;
			}
			}
		
	}
	
	public void modificarMateria(Materia meteria) {
		
	}
	
	public Materia encontrarMateria(String nombre){
		for(Materia materia:coleccionMateria) {
			if(materia.getNombre().equals(nombre)) {
				System.out.println(materia.toString()+ "fue encontrada/o");
			}
		}
		return null;
			
	}

	@Override
	public int verCantidad() {
		Iterator<Materia> iterator = coleccionMateria.iterator();
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
		System.out.println("LISTADO DE MATERIAS:");
		for(Materia materia : coleccionMateria) {
			System.out.println(materia.toString());
		}
		return nombre;
				
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public TreeSet<Materia> getColeccionMateria() {
		return coleccionMateria;
	}



	public void setColeccionMateria(TreeSet<Materia> coleccionMateria) {
		this.coleccionMateria = coleccionMateria;
	}



	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", coleccionMateria=" + coleccionMateria + "]";
	}
	
	

}
