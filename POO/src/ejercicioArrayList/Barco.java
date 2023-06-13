package ejercicioArrayList;

public class Barco {

	private String matricula;
	private int eslora;
	private boolean velero;
	private double capacidad;

	public Barco(String matricula, int eslora, boolean velero, double capacidad) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.velero = velero;
		this.capacidad = capacidad;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	public boolean isVelero() {
		return velero;
	}

	public void setVelero(boolean velero) {
		this.velero = velero;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", velero=" + velero + ", capacidad="
				+ capacidad + "]";
	}
	
	
}