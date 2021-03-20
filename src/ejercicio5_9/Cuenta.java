package ejercicio5_9;

public class Cuenta {

    private String numero;
    private float saldo;

    public Cuenta(String numero, int saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void recibirAbono(float cantidad) {
        saldo += cantidad;
    }

    public void realizarPago(float cantidad) {
        saldo -= cantidad;
    }

}
