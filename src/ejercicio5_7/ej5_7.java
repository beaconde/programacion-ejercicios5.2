package ejercicio5_7;

import java.util.Scanner;

public class ej5_7 {
    public static void main(String[] args) {

        Coche c1 = new Coche("negro", "BMW", 120, 4, "1234CHJ");
        Coche c2 = new Coche("azul", "Kia", 130, 4, "5678JFV");
        Coche c3 = new Coche("rojo", "Mercedes", 140, 5, "7643HTF");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println("\nLe cambiamos el color al coche 1:");

        c1.setColor("blanco");

        System.out.println(c1.toString());

    }
}
