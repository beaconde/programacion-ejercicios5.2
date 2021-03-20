package ejercicio5_7;

public class Coche {

    private String color;
    private String marca;
    private int caballos;
    private int puertas;
    private String matricula;

    public Coche(String color, String marca, int caballos, int puertas, String matricula) {
        this.color = color;
        this.marca = marca;
        this.caballos = caballos;
        this.puertas = puertas;
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() { return marca; }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "El coche es un " + this.marca + " de color " + this.color + " de " + this.caballos + " caballos, con " + this.puertas + " puertas y de matrícula " + this.matricula + ".";
    }
}
