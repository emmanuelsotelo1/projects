package tp8ej3;

public interface Vehiculo {
	
	int VELOCIDAD_MAXIMA = 120;

	void frenar();

	String acelerar(int acelerar);

	String plazas();
	
	int getVelocidad();
}
