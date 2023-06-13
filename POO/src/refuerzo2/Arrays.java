package refuerzo2;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		//Los arrays son estructuras de datos estaticas que nos permiten almacenar mas de un dato
		//de un tipo determinado
		
		Scanner teclado = new Scanner(System.in);
		final int TAMANIO = 5;//el tamaño del array, en este caso 5 columnas.
		int [] arrayEnteros;
		arrayEnteros = new int[TAMANIO];
		
		
		//meter valores directamente 
		//arrayEnteros[0]=3;
		
		//meter arrays con for
		for(int i=0; i<arrayEnteros.length; i++) {
			System.out.println("Introduce número en posición " + i + ": ");
			arrayEnteros[i] = teclado.nextInt();
		}
		//visualizar el contenido del array
		for(int i=0; i<arrayEnteros.length; i++) {
			System.out.println(arrayEnteros[i]);
		}
		
	}	

}


