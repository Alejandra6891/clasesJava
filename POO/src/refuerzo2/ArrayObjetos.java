package refuerzo2;

import java.util.Scanner;
import refuerzo.Persona;

public class ArrayObjetos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		final int DIMENSION = 2;
		Persona[] arrayObjetos;
		arrayObjetos = new Persona[DIMENSION];

		for (int i = 0; i < arrayObjetos.length; i++) {
			System.out.println("Introducir persona " + i + ": ");
			System.out.println("Introduce dni: ");
			String dni = teclado.nextLine();
			System.out.println("Introduce edad: ");
			int edad = teclado.nextInt();
			// Vaciar buffer siempre entre numeros(int,double..)y String.
			teclado.nextLine();
			System.out.println("Introduce nombre: ");
			String nombre = teclado.nextLine();
			System.out.println("Introduce sueldo: ");
			double sueldo = teclado.nextDouble();
			System.out.println("Introduce altura: ");
			double altura = teclado.nextDouble();
			teclado.nextLine();
			Persona persona = new Persona(dni, edad, nombre, sueldo, altura);
			arrayObjetos[i] = persona;
		}
		for (int i = 0; i < arrayObjetos.length; i++) {
			System.out.println(arrayObjetos[i]);
		}
	}
}
