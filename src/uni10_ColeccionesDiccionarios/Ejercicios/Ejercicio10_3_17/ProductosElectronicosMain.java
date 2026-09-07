package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_17;

/**
 * Una empresa de venta por internet de productos electrónicos nos ha encargado implementar un carrito de la compra.
 * Crea la clase Carrito. Al carrito se le pueden ir agregando elementos que se guardarán en una lista, por tanto,
 * deberás crear la clase Elemento. Cada elemento del carrito deberá contener el nombre del producto, su precio y la
 * cantidad (número de unidades de dicho producto). A continuación se muestra tanto el contenido del programa principal
 * como la salida que debe mostrar el programa. Los métodos a implementar se pueden deducir del main.
 * @author Saulolo
 */
public class ProductosElectronicosMain {

    public static void main(String[] args) {

        System.out.println("=== TIENDA PRODUCTOS ELECTRÓNICOS ===");

        Carrito miCarrito = new Carrito();
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
        miCarrito.agrega(new Elemento("Canon EQS 2000D", 449, 1));
        System.out.println(miCarrito);
        System.out.println("Hay " + miCarrito.numeroElementos() + " productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros.");

        System.out.println("\nContinua la compra...");
        miCarrito.agrega(new Elemento("Samgsumg Galaxy Tab", 199, 3));
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));
        System.out.println(miCarrito);
        System.out.println("Hay " + miCarrito.numeroElementos() + " productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros.");

    }
}
