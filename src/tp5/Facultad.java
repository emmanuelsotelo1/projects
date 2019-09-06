package tp5;

/*
INTEGRANTES:
			o	BAEZ MOLINAS, Valeria
			o	BURGOS, Gabriel
			o	MARTINI, Giuliana
			o	SOTELO, Emmanuel
*/
import java.util.Scanner;

public class Facultad
{
private String nombre;
private int cantMax;

public Facultad(String nombre, int cantMax)
{
	this.nombre = nombre;
	this.cantMax = cantMax;
}

public static void AgregarEstudiantes(Estudiantes[] estudiantes, int cantMax)
{
	Scanner input = new Scanner(System.in);
	input.useDelimiter("\n");
	for(int i = 0; i < cantMax; i++)
	{
		System.out.print("\nNombre: ");
		String nombre = input.next();
		input.nextLine();
		int nroId = i + 1;
		System.out.print("Promedio: ");
		double promedio = input.nextDouble();
		input.nextLine();
		Estudiantes alumno = new Estudiantes(nombre, nroId, promedio);
		estudiantes[i] = alumno;
	}
}

public static void ListarEstudiantes(Estudiantes[] estudiantes)
{
	System.out.println("\n=============================");
    System.out.println("LISTA DE ESTUDIANTES:");
    for (int i=0; i<estudiantes.length; i++)
	{
	    if (estudiantes[i] != null)
	    {
            System.out.println("=============================");
            System.out.println("Numero de identificacion: " + estudiantes[i].getNroEst());
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Promedio: " + estudiantes[i].getPromedio());
        }
	}
	System.out.println("=============================");
}

public static void BuscarEstudiante (Estudiantes[] estudiantes, String nombreB)
{
    for (int i=0; i<estudiantes.length; i++)
    {
        if (estudiantes[i] != null && estudiantes[i].getNombre().equalsIgnoreCase(nombreB))
        {
			System.out.println("\n=============================");
            System.out.println("ESTUDIANTE BUSCADO: " + estudiantes[i].getInfo());
        }
    }
}

public static void BorrarEstudiante (Estudiantes[] estudiantes, String nombreB)
{
    for (int i=0; i<estudiantes.length; i++)
    {
        if (estudiantes[i].getNombre().equalsIgnoreCase(nombreB))
        {
            estudiantes[i] = null;
        }
    }
}

public static void ModificarPromedio (Estudiantes[] estudiantes, String nombreB, double promedioB)
{
	for (int i=0; i<estudiantes.length; i++)
	{
		if (estudiantes[i] != null && estudiantes[i].getNombre().equalsIgnoreCase(nombreB))
		{
			estudiantes[i].setPromedio(promedioB);
		}
	}
}

}
