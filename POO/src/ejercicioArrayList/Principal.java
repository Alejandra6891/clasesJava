//crear un menu que nos permita manipular un arrayList de barcos donde se realicen las siguientes acciones
//añadir barcos a ArrayList
//mostrar barcos del ArrayList
//mostrar un barco del ArrayList por matricula
//borrarlo por matricula
//modificar valores por matricula

package ejercicioArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import refuerzo.Persona;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Barco> listaBarcos = new ArrayList<>();

	public static void main(String[] args) {

		boolean repetir = true;
		while (repetir) {
			menu();
			System.out.println("Por favor, selecciona una opción");
			int opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
					listaBarcos.add(crearBarco());
				break;
			case 2:
					mostrarBarcos();
				break;
			case 3:
				 buscarBarcoMatricula();
				break;
			case 4:
				borrarBarco();
				break;
			case 5:
				modificarValoresBarco();
				break;
			case 6:
				repetir = false;
				System.out.println("Fin de programa");
			}
		}

	}
	
	private static Barco crearBarco() {
		teclado.nextLine();
		System.out.println("Introduce matricula: " );
		String matricula = teclado.nextLine();
		System.out.println("Introduce medida eslora: " );
		int eslora = teclado.nextInt();
		System.out.println("Introduce si es velero: " );
		boolean velero = teclado.nextBoolean();
		System.out.println("Introduce capacidad: " );
		double capacidad = teclado.nextDouble();
		
		Barco barco = new Barco(matricula, eslora, velero, capacidad);
		return barco;
	}

	private static void menu() {
		System.out.println(
				"1.Añadir barco\n2.Mostrar barcos\n3.Buscar barco\n4.Borrar barco\n5.Modificar valores\n6,Salir");

	}
	
	private static void mostrarBarcos() {
		if(listaBarcos.size()>0) {
			listaBarcos.forEach(barco ->System.out.println(barco.toString()));
		}else {
			System.out.println("No existen barcos");
		}
	}

	private static void buscarBarcoMatricula() {
		teclado.nextLine();
		System.out.println("Introduce matricula a buscar: ");
		String matricula = teclado.nextLine();
		boolean encontrada = false;
		for(Barco barco : listaBarcos) {
			if (matricula.equalsIgnoreCase(barco.getMatricula())) {
				System.out.println(barco);
				encontrada=true;
		}
			
	  }
		if(!encontrada) {
			System.out.println("la matricula " + matricula + " no existe.");
	}
  }
	
	private static void borrarBarco() {
		teclado.nextLine();
		System.out.println("Introduce matricula a borrar: ");
		String matricula = teclado.nextLine();
		for(int i=0; i<listaBarcos.size(); i++) {
			if(listaBarcos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
				listaBarcos.remove(i);
				System.out.println("El barco con matricula " + matricula + " se ha borrado");
				break;
				
			}else {
				System.out.println("No se ha encontrado la matricula");
			}
		}
	}
	
	private static void modificarValoresBarco() {
		teclado.nextLine();
		System.out.println("Introduce la matricula del barco a modificar: ");
		String matricula = teclado.nextLine();
		for(Barco barco : listaBarcos) {
			if (matricula.equalsIgnoreCase(barco.getMatricula())) {
				System.out.println("¿Que campo deseas modificar? eslora/capacidad  ");
				String campo = teclado.nextLine();
				if(campo.equalsIgnoreCase("eslora")){
					System.out.println("Introduce la nueva eslora");
					int nuevaEslora = teclado.nextInt();
					barco.setEslora(nuevaEslora);
					System.out.println("Se ha modificado la eslora del barco ");
				} else if(campo.equalsIgnoreCase("capacidad")) {
					System.out.println("Introduce nueva capacidad");
					double nuevaCapacidad = teclado.nextDouble();
					barco.setCapacidad(nuevaCapacidad);
					System.out.println("Se ha modificado la capacidad del barco");
				}else {
					System.out.println("La opción indicada no es posible");
					break;
				}
				
			}else {
				System.out.println("No se ha encontrado la matricula");
			}
		}
	}
}
