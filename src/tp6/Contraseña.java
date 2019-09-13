package tp6;

public class Contraseña {

	String contraseña = "";
	private int cantidadMinuscula;
	private int cantidadMayuscula;
	private int cantidadNumeros;

	public Contraseña(int longitud) {
		for (int i = 0; i < longitud; i++) {
			this.contraseña = contraseña + generarContraseña();
		}
		this.cantidadMayuscula = mayusculas();
		this.cantidadMinuscula = minusculas();
		this.cantidadNumeros = numeros();

	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getCantidadMin() {
		return cantidadMinuscula;
	}

	public void setCantidadMin(int cantidadMin) {
		this.cantidadMinuscula = cantidadMin;
	}

	public int getCantidadMay() {
		return cantidadMayuscula;
	}

	public void setCantidadMay(int cantidadMay) {
		this.cantidadMayuscula = cantidadMay;
	}

	public int getCantidadNum() {
		return cantidadNumeros;
	}

	public void setCantidadNum(int cantidadNum) {
		this.cantidadNumeros = cantidadNum;
	}

	private char generarContraseña() {
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int numero = (int) (Math.random() * 61);
		char character = caracteres.charAt(numero);
		return character;
	}

	public String seguridadContraseña() {
		String retorno = "una contraseña DEBIL";
		if (this.cantidadNumeros > 4 && this.cantidadMinuscula > 1 && this.cantidadMayuscula > 2) {
			retorno = "una contraseña SEGURA";
		}
		return retorno;

	}

	public int longitud() {
		int longi = 0;
		longi += this.cantidadMayuscula + this.cantidadMinuscula + this.cantidadNumeros;
		return longi;

	}

	private int minusculas() {
		int min = 0;
		char[] minusculas = { 'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < this.contraseña.length(); i++) {
			for (int j = 0; j < minusculas.length; j++) {
				if (minusculas[j] == contraseña.charAt(i)) {
					min++;
				}
			}
		}
		return min;
	}

	private int mayusculas() {
		int may = 0;
		char[] mayusculas = { 'A', 'B', 'C', 'D', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		for (int i = 0; i < this.contraseña.length(); i++) {
			for (int j = 0; j < mayusculas.length; j++) {
				if (mayusculas[j] == contraseña.charAt(i)) {
					may++;
				}
			}
		}
		return may;
	}

	private int numeros() {
		int num = 0;
		char[] numeros = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

		for (int i = 0; i < this.contraseña.length(); i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[j] == contraseña.charAt(i)) {
					num++;
				}
			}

		}
		return num;
	}

}
