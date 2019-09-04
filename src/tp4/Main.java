package tp4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente c1 = new CuentaCorriente("Carl",200);
		CuentaCorriente c2 = new CuentaCorriente("Jennifer",200);
		c1.restar(100);
		c2.sumar(100);
		System.out.println(c1.getDatos());
		System.out.println(c2.getDatos());
		
	}

}
