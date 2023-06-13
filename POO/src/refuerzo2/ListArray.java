package refuerzo2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import refuerzo.Persona;

public class ListArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		
		listaEnteros.add(2);
		listaEnteros.add(15);
		listaEnteros.add(48);
		//listaEnteros.remove(0);
		//listaEnteros.remove(1);

	//	for (Integer numero : listaEnteros) {
		//	System.out.println(numero);
		//}
		Scanner entrada = new Scanner(System.in);
		//listaEnteros.stream().forEach(numero -> System.out.println(numero));
		listaEnteros.forEach(numero -> System.out.println(numero));
		
		List<Persona> listaPersonas = new ArrayList<>();
		
		Persona persona4 = new Persona("10589987d",22,"Luis", 1200,1.72);
		listaPersonas.add(persona4);
		
		listaPersonas.add(new Persona("10589987d",22,"Luis", 1200,1.57));
		//listaPersonas.forEach(persona -> System.out.println(persona));
		listaPersonas.remove(1);
		//listaPersonas.forEach(persona -> System.out.println(persona));
		listaPersonas.add(0, new Persona("53869987P",32,"Juan", 1100,1.80));
		listaPersonas.forEach(persona -> System.out.println(persona));
		
		//calcular el tamaño actual del arrayList (numero de posiciones)
		System.out.println(listaPersonas.size());
		
		//Buscar elementos dentro del arrayList
		//buscar elemento del arrayList por dni
		
		System.out.println("Introduce dni: " );
		String dni = entrada.nextLine();
		//listaPersonas.forEach(persona -> {
			//if (dni.equalsIgnoreCase(persona.getDni())) {
				//System.out.println(persona);
			//}
		//});
		
		boolean encontrada = false;
		for(Persona persona : listaPersonas) {
			if (dni.equalsIgnoreCase(persona.getDni())) {
				System.out.println(persona);
				encontrada=true;
		}
	}
	
		if(!encontrada) {
			System.out.println("no se ha encontrado el dni");
		}
	
		
	}
	
	
}
