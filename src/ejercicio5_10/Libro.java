package ejercicio5_10;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private float calificacion;

    public Libro(String titulo, String autor, int numeroPaginas, float calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        if(calificacion>=0 && calificacion>= 10) {
            this.calificacion = calificacion;
        }
    }
}
