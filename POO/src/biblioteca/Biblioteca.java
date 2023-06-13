package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Libro> listaLibros = new ArrayList();

	public static void main(String[] args) {
		
		boolean continuar = true;
		while(continuar) {
			menu();
			System.out.println("Por favor,selecciona una opción");
			int posibilidad = entrada.nextInt();
			switch(posibilidad){
				case 1:
					Libro libro = crearLibro();
					agregarLibro(libro);
				break;
				case 2:
					borrarLibro();
				break;
				case 3:
					buscarLibro();
				break;
				case 4:
					mostrarLibros();
				break;
				case 5:
					continuar = false;
					System.out.println("Fin de programa");
				break;
				default:
					System.out.println("No se ha elegido ninguna opción");
				}
			
		}
		
		
		
	}
	
	private static Libro crearLibro() {
		System.out.println("Introduce isbn: ");
		int isbn = entrada.nextInt();
		entrada.nextLine();
		System.out.println(" Introduce titulo: ");
		String titulo = entrada.nextLine();
		System.out.println(" Introduce autor: ");
		String autor = entrada.nextLine();
		System.out.println(" Introduce año de publicacion: ");
		int anioPublicacion = entrada.nextInt();
		
	Libro libro = new Libro(isbn,titulo,autor,anioPublicacion);
		return libro;
		
		
	}
	
	//\n2 -->Se pone asi porque la barra es el salto de linea
	//Asi pone todas las opciones de menu una debajo de otra.
	private static void menu() {
		System.out.println(
			"1.Agregar libro\n2.borrar libro\n3.buscar libro\n4.mostrar libros\n5.salir");
		
	}
	
	private static void agregarLibro(Libro libro) {
		listaLibros.add(libro);
		
	}
	
	private static void borrarLibro() {
		entrada.nextLine();
		System.out.println("introduce isbn a borrar: ");
		int isbn = entrada.nextInt();
		for(int i=0; i<listaLibros.size(); i++) {
			if(listaLibros.get(i).getIsbn()== isbn) {
				listaLibros.remove(i);
				System.out.println("El libro con isbn " + isbn + " ha sido borrado");
				break;
				
			}else {
				System.out.println("No se ha encontrado isbn");
			}
			
		}
	}
	
	private static void buscarLibro() {
		entrada.nextLine();
		System.out.println("Introducir titulo del libro buscado: ");
		String titulo = entrada.nextLine();
		boolean encontrada = false;
		for(Libro libro : listaLibros) {
			if(titulo.equalsIgnoreCase(libro.getTitulo())){
				System.out.println(libro);
				encontrada=true;
			}
			
		}
			if(!encontrada) {
				System.out.println("el titulo " + titulo + " no existe ");
			}
		
	}
	
	private static void mostrarLibros() {
		if(listaLibros.size()>0) {
			listaLibros.forEach(libro ->System.out.println(libro.toString()));
		}else {
			System.out.println("No hay libros en la biblioteca");
		}
	}
	
	
	
	



}
