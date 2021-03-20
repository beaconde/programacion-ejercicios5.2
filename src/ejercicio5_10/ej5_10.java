package ejercicio5_10;

public class ej5_10 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Imperio Final", "Brandon Sanderson", 541, 9.5f);
        Libro libro2 = new Libro("Juego de Tronos", "George RR Martin", 832, 8);

        ConjuntoLibros conjunto = new ConjuntoLibros();

        conjunto.addLibro(libro1);
        conjunto.addLibro(libro2);

        conjunto.mostrarContenido();

        conjunto.mayorCalificacion();
        conjunto.menorCalificacion();

        conjunto.eliminarAutor("Brandon Sanderson");
        conjunto.eliminarTitulo("Juego de Tronos");

        Libro libro3 = new Libro("El Héroe de las Eras", "Brandon Sanderson", 768, 9);

        System.out.println("\nSe han eliminado los libros y se ha añadido otro:");

        conjunto.addLibro(libro3);

        conjunto.mostrarContenido();

    }
}
