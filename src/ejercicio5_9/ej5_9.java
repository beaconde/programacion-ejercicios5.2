package ejercicio5_9;

public class ej5_9 {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("123456789123", 0);
        Cuenta cuenta2 = new Cuenta("987654321987", 700);
        Cuenta [] vector = {cuenta1, cuenta2};

        Persona persona1 = new Persona("32465701A");
        persona1.addCuentas(vector);

        int nomina = 1100;
        cuenta1.recibirAbono(nomina);

        int alquiler = 750;
        cuenta2.realizarPago(alquiler);

        if(persona1.personaMorosa()) {
            System.out.println("La persona es morosa.");
        } else {
            System.out.println("La persona no es morosa.");
        }

        int transferencia = 200;
        cuenta1.realizarPago(transferencia);
        cuenta2.recibirAbono(transferencia);

        System.out.println("Después de realizar la transferencia:");
        if(persona1.personaMorosa()) {
            System.out.println("La persona es morosa.");
        } else {
            System.out.println("La persona no es morosa.");
        }

    }
}
