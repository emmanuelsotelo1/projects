package tp8ej2;

public interface Vehiculo {

	int VELOCIDAD_MAXIMA = 120;

	void frenar(int frenar);

	String acelerar(int acelerar);

	String plazas();
	
	int getVelocidad();
	
}
