package concesionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Garaje {

	static Scanner informacion = new Scanner(System.in);
	static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		boolean repeat = true;
		while(repeat) {
			menu();
			System.out.println("Por favor, elija una opción");
			int opcion = informacion.nextInt();
			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				repeat = false;
				System.out.println("Fin de progama");
				
			}
			
		}
		
		
	}
	
	private static Vehiculo crearCoche() {
		System.out.println("Introduce marca de coche ");
		String marca = informacion.nextLine();
		System.out.println("Introduce modelo de coche ");
		String modelo = informacion.nextLine();
		System.out.println("Introduce año de fabricación ");
		int anio = informacion.nextInt();
		System.out.println("Introduce numero de puertas ");
		int cantidadPuertas = informacion.nextInt();
		
		Vehiculo coche = new Coche(marca,modelo, anio, cantidadPuertas);
		return coche;
	}
	
	private static Vehiculo crearMoto() {
		informacion.nextLine();
		System.out.println("Introduce marca de la moto ");
		String marca = informacion.nextLine();
		System.out.println("Introduce modelo de la moto ");
		String modelo = informacion.nextLine();
		System.out.println("Introduce año de fabricación ");
		int anio = informacion.nextInt();
		
		Vehiculo moto = new Moto(marca,modelo,anio);
		return moto;
	}
	
	private static void menu() {
		System.out.println(
				"1.Añadir vehiculo\n2.Mostrar vehiculos\n3.Buscar vehiculo\n4.Borrar vehiculo\n5.Modificar valores\n6,Salir");
	}
		

}
