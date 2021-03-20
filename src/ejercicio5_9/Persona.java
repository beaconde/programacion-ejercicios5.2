package ejercicio5_9;

public class Persona {

    private String DNI;
    private Cuenta [] cuentasBancarias;

    public Persona(String DNI) {
        this.DNI = DNI;
    }

    public void addCuentas(Cuenta [] cuentas) {
        if(cuentas.length<=3) {
            cuentasBancarias = new Cuenta[cuentas.length];
            for(int i=0; i<cuentas.length; i++) {
                this.cuentasBancarias[i] = cuentas[i];
            }
        }
    }

    public boolean personaMorosa() {
        for(int i=0; i<cuentasBancarias.length; i++) {
            if(cuentasBancarias[i].getSaldo()<0) {
                return true;
            }
        }
        return false;
    }
}
