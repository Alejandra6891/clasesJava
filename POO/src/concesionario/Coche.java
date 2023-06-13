package concesionario;

public class Coche extends Vehiculo {

	private int cantidadPuertas;
	
	public Coche(String marca, String modelo, int anio, int cantidadPuertas) {
		super(marca, modelo, anio);
		this.cantidadPuertas = cantidadPuertas;
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	@Override
	public String toString() {
		return super.toString()+ "[cantidadPuertas=" + cantidadPuertas + "]";
	}
	
	
	
}
