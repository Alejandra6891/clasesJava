package refuerzo;

import java.util.Scanner;

public class Principal {
	
	//Siempre que no se ponga ningun modificador de acceso, java lo interpreta como public
	//Creando las constantes evitamos hardcoedar (ayuda a no volvernos locos en un codigo grande)
	 final static int MAYORIA_EDAD = 18;

	public static void main(String[] args) {
		
		//clase Scanner
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce dni: " );
		String dni = entrada.nextLine();
		System.out.println("Introduce edad: " );
		int edad = entrada.nextInt();
		//Vaciar buffer siempre entre numeros(int,double..)y String.
		entrada.nextLine();
		System.out.println("Introduce nombre: " );
		String nombre = entrada.nextLine();
		System.out.println("Introduce sueldo: " );
		double sueldo = entrada.nextDouble();
		System.out.println("Introduce altura: " );
		double altura = entrada.nextDouble();
		Persona persona3 = new Persona(dni,edad, nombre, sueldo, altura);
		System.out.println("la informacion del cliente es " + persona3);
		
		
		Persona persona1 = new Persona("53658956T", 22, "Juan", 2500, 1.67);
		Persona persona2 = new Persona("Sandra", 1600);
		String nombrePersona = persona2.getNombre();
		System.out.println("El nombre de la persona2 es " + nombrePersona);
		int edadPersona1 = persona1.getEdad();
		System.out.println("La edad de la persona1 es " + edadPersona1);
		persona1.setDni("21083359Y");
		System.out.println("el dni de la persona1 es " + persona1.getDni());
		persona2.setSueldo(1650.25);
		System.out.println("el salario de la persona2 es " + persona2.getSueldo());
		persona1.setAltura(1.75);
		double alturaPersona1 = persona1.getAltura();
		System.out.println("la altura de la persona1 es " + alturaPersona1 );
		System.out.println("la informacion de la persona1 es " + persona1.toString());
		
		//clase Cuenta
		Cuenta cuenta1 = new Cuenta("Ana Isabel", "iban58964 256666");
		System.out.println("La informacion de la nueva cuenta es  " + cuenta1.toString());
		System.out.println("El numero de cuentas creadas " + Cuenta.contadorCuentas);
		Cuenta cuenta2 = new Cuenta("Jorge", "iban96662 36958");
		System.out.println("La informacion de la nueva cuenta es  " + cuenta2.toString());
		System.out.println("El numero de cuentas creadas " + Cuenta.contadorCuentas);
		
		if(persona1.getEdad()> MAYORIA_EDAD ) {
			System.out.println("La persona es mayor de edad");
		}
		
		char characterNumerico = '1';
		System.out.println(" el dato del char " + characterNumerico);
		
		//float permite almacenar decimales con una precision de 7 digitos
		float decimal1 = 25.2345678f;
		System.out.println("el numero float es " + decimal1);
		
		//double permite almacenar decimales con una precision de 15 digitos
		double decimal2 = 25.635987563214569;
		System.out.println("el numero double es " + decimal2);
		
		//Double( objeto)
		
		Double decimal3 = 2563.26;
		System.out.println(" el numero double objeto es " + decimal3.toString());
		
		
		//Banco
		Banco banco1 = new Banco("Sabadell", 1986, 102.36);
		System.out.println(" La longitud del nombre del banco es " + banco1.getNombre().length());
		System.out.println("el capital social como entero es " + banco1.getCapitalSocial().intValue());
		int numeroInteger = Integer.MAX_VALUE;
		System.out.println("el numero es " + numeroInteger);
	}
	
		

}
