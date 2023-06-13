package refuerzo;

public class Cuenta {
	
	private String cliente;
	private double saldo;
	private String iban;
	public static int contadorCuentas = 0;
	
	public Cuenta(String cliente, String iban) {
		this.cliente = cliente;
		this.iban = iban;
		saldo = 0; //this.saldo = 0;
		contadorCuentas ++;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	@Override
	public String toString() {
		return ("cliente= " + cliente + " , saldo= " + saldo + " , iban= " + iban );
	}

	
}
