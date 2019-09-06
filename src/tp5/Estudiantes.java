package tp5;

/*
INTEGRANTES:
			o	BAEZ MOLINAS, Valeria
			o	BURGOS, Gabriel
			o	MARTINI, Giuliana
			o	SOTELO, Emmanuel
*/
public class Estudiantes
{

private String nombre;
private int nroEst;
private double promedio;

public Estudiantes(String nombre, int nroEst, double promedio)
{
	this.nombre = nombre;
	this.nroEst = nroEst;
	this.promedio = promedio;
}

public Estudiantes(String nombre){ this.nombre = nombre; }

public String getNombre() {
	return nombre;
}

public int getNroEst() {
	return nroEst;
}

public double getPromedio() {
	return promedio;
}

public void setPromedio(double promedio) {
	this.promedio = promedio;
}

public String getInfo()
{
	return ("\n============================="+
			"\nNumero de identificacion: "+ nroEst +
			"\nNombre: " + nombre +
		  	"\nPromedio: " + promedio) +
			"\n=============================";
}
}
