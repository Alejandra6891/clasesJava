package refuerzo;

public class Persona {
	
	private final int ANIO_ACTUAL = 2023;
	
	private String dni;
	private int edad;
	private String nombre;
	private double sueldo;
	private double altura;
	
	public Persona(String dni, int edad, String nombre, double sueldo, double altura) {
			
			this.dni = dni;
			this.edad = edad;
			this.nombre = nombre;
			this.sueldo = sueldo;
			this.altura = altura;
		
		}
	
	public Persona(String nombre, double sueldo) {
			
			this.nombre = nombre;
			this.sueldo = sueldo;
		
	}//Getter
	
	public String getDni() {
		return dni;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public double getAltura() {
		return altura;
	}
	
	//Setter
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
		
	}
	
	//toString
	
	public String toString() {
		return "dni: " + dni + " edad " + edad + " nombre " + nombre + " sueldo " + sueldo + " altura " + altura; 
		
		
	}

}
