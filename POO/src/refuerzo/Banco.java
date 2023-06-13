package refuerzo;

public class Banco {
	
	private String nombre;
	private Integer anioFundacion;
	private Double capitalSocial;
	
	public Banco(String nombre, Integer anioFundacion, Double capitalSocial) {
		this.nombre = nombre;
		this.anioFundacion = anioFundacion;
		this.capitalSocial = capitalSocial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAnioFundacion() {
		return anioFundacion;
	}

	public void setAnioFundacion(Integer anioFundacion) {
		this.anioFundacion = anioFundacion;
	}

	public Double getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(Double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	@Override
	public String toString() {
		return "Banco nombre=" + nombre + ", anioFundacion=" + anioFundacion + ", capitalSocial=" + capitalSocial;
	}
	
	
	

}
