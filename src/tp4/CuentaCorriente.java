package tp4;

public class CuentaCorriente {
	
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	public CuentaCorriente(String nombreTitular, double saldo) {
		this.saldo=saldo;
		this.nombreTitular=nombreTitular;
		this.numeroCuenta=(long) (Math.random()*100);
	}
	
	public void sumar(double ingreso) {
		this.saldo=this.saldo+ingreso;
	}
	
	public void restar(double monto) {
		this.saldo=this.saldo-monto;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getDatos() {
		return "\nNombre del titular: "+this.nombreTitular+
				"\nSaldo disponible: "+this.saldo+
				"\nNumero de cuenta: "+this.numeroCuenta;
	}


}
