package p2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Materia implements Informacion {
	
	private String nombre;
	private Profesor titular;
	TreeSet<Estudiante> coleccionEstudiante;
	
	public Materia(TreeSet<Estudiante>coleccionEstudiante, String nombre, Profesor titular) {
		this.coleccionEstudiante=coleccionEstudiante;
		this.nombre=nombre;
		this.titular=titular;
	}
	
	public void agregarEstudiante(Estudiante estudiante) {
		coleccionEstudiante.add(estudiante);
		System.out.println(estudiante.toString()+" se ha cargado");
	}
	
	public void eliminarEstudiante(String nombre) {
		Iterator<Estudiante> iterator = coleccionEstudiante.iterator();
		
		while(iterator.hasNext()) {
			String buscado = iterator.next().getNombre();
			if(buscado.equals(nombre)) {
				iterator.remove();
				System.out.println(nombre+ "fue eliminada/o.");
			}
			}
	}
	
	public void modificarTitular(Profesor profesor) {
		
	}
	
	
	
	@Override
	public int verCantidad() {
		Iterator<Estudiante> iterator = coleccionEstudiante.iterator();
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
		for(Estudiante estudiante : coleccionEstudiante) {
			System.out.println(estudiante.toString());
		}
		return nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getTitular() {
		return titular;
	}

	public void setTitular(Profesor titular) {
		this.titular = titular;
	}

	public TreeSet<Estudiante> getColeccionEstudiante() {
		return coleccionEstudiante;
	}

	public void setColeccionEstudiante(TreeSet<Estudiante> coleccionEstudiante) {
		this.coleccionEstudiante = coleccionEstudiante;
	}
	
	
	

}
