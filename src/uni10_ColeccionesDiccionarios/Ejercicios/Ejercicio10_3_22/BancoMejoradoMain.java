package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_22;

/**
 * Amplía el ejercicio 13 del capítulo anterior que implementaba cuentas corrientes de un banco de tal forma que cada
 * cuenta lleve un registro de todos los movimientos realizados: ingresos, cargos y transferencias (tanto enviadas como
 * recibidas).
 * @author Saulolo
 */
public class BancoMejoradoMain {

    public static void main(String[] args) {

        System.out.println("=== BANCO MEJORADO ===");

        CuentaCorrienteMejorado cuenta1 = new CuentaCorrienteMejorado();
        CuentaCorrienteMejorado cuenta2 = new CuentaCorrienteMejorado(1500);
        CuentaCorrienteMejorado cuenta3 = new CuentaCorrienteMejorado(6000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

        //TRANSFERENCIAS
        System.out.println("=======================================");
        cuenta1.ingreso(2000);
        cuenta2.cargo(600);
        cuenta3.ingreso(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta3, 100);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        cuenta1.movimientos();
        cuenta2.movimientos();
        cuenta3.movimientos();

    }
}
