package ejercicio5_6;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularArea() {
        return this.base * this.altura;
    }

    public int calcularPerimetro() {
        return this.base * 2 + this.altura * 2;
    }

    @Override
    public String toString() {
        return "El área del rectángulo es " + calcularArea() + " y el perímetro del rectángulo es " + calcularPerimetro();
    }

}
