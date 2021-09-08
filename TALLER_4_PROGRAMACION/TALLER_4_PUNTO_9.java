
package taller_4_punto_9;


public class TALLER_4_PUNTO_9 {

    
    private String nombreCliente;
    private String numeroCuenta;
    private double saldo;

    public TALLER_4_PUNTO_9 () {
    }

    public TALLER_4_PUNTO_9 (String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {                         
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public TALLER_4_PUNTO_9 (final TALLER_4_PUNTO_9 X) {
        nombreCliente = X.nombreCliente;
        numeroCuenta = X.numeroCuenta;
        saldo = X.saldo;
    }

    public String getNombre() {
        return nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setNombre(String nombre) {
        nombreCliente = nombre;
    }

    public void setNumeroCuenta(String cuenta) {
        numeroCuenta = cuenta;
    }

    public void setSaldo(double Saldo) {
        saldo = Saldo;
    }

    

    public boolean Consignar(double A) {
        boolean ingresoCorrecto = true;
        if (A < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + A;
        }
        return ingresoCorrecto;
    }

    public boolean retirar(double A) {
        boolean retiroCorrecto = true;                                                                         
        if (A < 0) {
            retiroCorrecto = false;
        } else if (saldo >= A) {
            saldo -= A;
        } else {
            retiroCorrecto = false;
        }
        return retiroCorrecto;
    }

}

 
