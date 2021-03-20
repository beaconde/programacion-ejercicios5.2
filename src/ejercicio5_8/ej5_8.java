package ejercicio5_8;

import java.util.Scanner;

public class ej5_8 {
    public static void main(String[] args) {

        Tiempo tiempoUsuario;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la hora: ");
        while(!entrada.hasNextInt()) {
            entrada.nextLine();
            System.out.println("Debes introducir un número.");
        }
        int hora = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Introduce los minutos (en blanco para no especificar): ");
        int minuto = 0;
        while(true) {
            String cadena = entrada.nextLine();
            if(cadena.equals("")) {
                tiempoUsuario = new Tiempo(hora, minuto);
                break;
            } else {
                try {
                    minuto = Integer.parseInt(cadena);

                    System.out.print("Introduce los segundos (en blanco para no especificar): ");
                    int segundo = 0;
                    while(true) {
                        cadena = entrada.nextLine();
                        if(cadena.equals("")) {
                            tiempoUsuario = new Tiempo(hora, minuto, segundo);
                            break;
                        } else {
                            try {
                                segundo = Integer.parseInt(cadena);
                                tiempoUsuario = new Tiempo(hora, minuto, segundo);
                                break;
                            } catch(Exception e) {
                                System.out.println("Debes introducir un número.");
                            }
                        }
                    }
                    break;
                } catch(Exception e) {
                    System.out.println("Debes introducir un número.");
                }
            }
        }

        System.out.println("La hora introducida es: " + tiempoUsuario.toString());

    }
}
