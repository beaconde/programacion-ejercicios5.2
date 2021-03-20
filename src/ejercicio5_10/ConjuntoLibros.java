package ejercicio5_10;

import java.util.ArrayList;

public class ConjuntoLibros {

    private ArrayList<Libro> conjuntoLibros = new ArrayList<Libro>(5);

    public void addLibro(Libro libro) {
        if(conjuntoLibros.size()<=5) {
            conjuntoLibros.add(libro);
        }
    }

    public void eliminarTitulo(String titulo) {
        conjuntoLibros.removeIf(libro -> libro.getTitulo() == titulo);
    }

    public void eliminarAutor(String autor) {
        conjuntoLibros.removeIf(libro -> libro.getAutor() == autor);
    }

    public void mayorCalificacion() {
        float mayor = 0;
        String titulo = null;
        for(Libro libro:conjuntoLibros) {
            if(libro.getCalificacion()>mayor) {
                mayor = libro.getCalificacion();
                titulo = libro.getTitulo();
            }
        }
        System.out.println("\nLa mayor calificación es "+mayor+" y pertenece al libro '"+titulo+"'.");
    }

    public void menorCalificacion() {
        float menor = 10;
        String titulo = null;
        for(Libro libro:conjuntoLibros) {
            if(libro.getCalificacion()<menor) {
                menor = libro.getCalificacion();
                titulo = libro.getTitulo();
            }
        }
        System.out.println("\nLa menor calificación es "+menor+" y pertenece al libro '"+titulo+"'.");
    }

    public void mostrarContenido() {
        int contador = 1;
        for(Libro libro:conjuntoLibros) {
            System.out.println("\nLibro "+contador+":\n- Título: "+libro.getTitulo()+"\n- Autor: "+libro.getAutor()+"\n- Número de páginas: "+libro.getNumeroPaginas()+"\n- Calificación: "+libro.getCalificacion());
            contador += 1;
        }
    }

}
