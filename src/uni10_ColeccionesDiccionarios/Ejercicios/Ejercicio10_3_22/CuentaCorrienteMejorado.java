package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_22;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CuentaCorrienteMejorado {

    private long numeroCta;
    private int saldoInicial;
    private ArrayList<String> movimientosList;
    private static final DecimalFormat DF = new DecimalFormat("0.00");


    public CuentaCorrienteMejorado() {
        this.numeroCta = generarNumeroCuenta();
        this.movimientosList = new ArrayList<>();
    }

    public CuentaCorrienteMejorado(int saldoInicial) {
        this.numeroCta = generarNumeroCuenta();
        this.saldoInicial = saldoInicial;
        this.movimientosList = new ArrayList<>();
    }

    public long getNumeroCta() {
        return numeroCta;
    }

    /**
     * Genera un número de cuenta aleatorio de 10 dígitos.
     *
     * @return Número de cuenta aleatorio entre 1.000.000.000 y 9.999.999.999.
     */
    private long  generarNumeroCuenta() {
        return (long) ((Math.random() * 9_000_000_000L) + 1_000_000_000);
    }

    /**
     * Realiza un ingreso en la cuenta.
     * Solo se acepta si la cantidad es positiva.
     *
     * @param saldo Cantidad a ingresar.
     */
    public void ingreso(int saldo) {
        if (saldo > 0) saldoInicial = saldoInicial + saldo;
        movimientosList.add("Ingreso de " + saldo + " € Saldo: " + DF.format(saldoInicial) + " €");
    }

    /**
     * Realiza un cargo (gasto) en la cuenta.
     * Solo se acepta si la cantidad es positiva.
     *
     * @param saldo Cantidad a cargar.
     */
    public void cargo(int saldo) {
        if (saldo > 0){
            saldoInicial = saldoInicial - saldo;
            movimientosList.add("Cargo de " + saldo + " € Saldo: " + DF.format(saldoInicial) + " €");
        }
    }

    /**
     * Realiza una transferencia a otra cuenta, registrando tanto la emisión como la recepción.
     */
    public void transferencia(CuentaCorrienteMejorado cuentaDestino, int cantidad) {
        if (cantidad > 0) {
            saldoInicial -= cantidad;
            movimientosList.add("Transf. emitida de " + cantidad + " € a la cuenta " + cuentaDestino.getNumeroCta() + " Saldo " + DF.format(saldoInicial) + " €");

            cuentaDestino.saldoInicial += cantidad;
            cuentaDestino.movimientosList.add("Transf. recibida de " + cantidad + " € de la cuenta " + this.numeroCta + " Saldo " + DF.format(cuentaDestino.saldoInicial) + " €");
        }
    }

    /**
     * Muestra por pantalla el historial de movimientos de la cuenta.
     */
    public void movimientos() {
        System.out.println("Movimientos de la cuenta " + numeroCta);
        System.out.println("-----------------------------------");
        for (String movimiento : movimientosList) {
            System.out.println(movimiento);
        }
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Número de cta: " + numeroCta + " Saldo: " + df.format(saldoInicial) + " €";
    }
}
