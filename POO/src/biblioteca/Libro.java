package biblioteca;

public class Libro {
	
	private int isbn;
	private String titulo;
	private String autor;
	private int anioPublicacion;
	
	public Libro(int isbn,String titulo,String autor,int anioPublicacion) {
		
		this.isbn = isbn;
		this.titulo= titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
	
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	public String toString() {
		return "Isbn: " + isbn + " titulo: " + titulo + " autor: " + autor + " año de publicacion: " + anioPublicacion;
	
	}
}
