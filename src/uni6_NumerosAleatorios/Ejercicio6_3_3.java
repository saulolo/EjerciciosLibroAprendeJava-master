package uni6_NumerosAleatorios;

/* todo: @author: Saulolo */

/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3, 4, 5,
6, 7, sota, caballo, rey y as.
*/

public class Ejercicio6_3_3 {

    public static void main(String[] args) {

        System.out.println("MOSTRANDO CARTA DE BARAJA ESPAÑOLA");
        System.out.println("---------------------------------");

        String tipoCarta = "";
        String numeroCarta = "";

        int carta = (int)(Math.random() * 4) + 1;
        switch (carta) {
            case 1:
                tipoCarta = "Monedas";
                break;
            case 2:
                tipoCarta = "Copas";
                break;
            case 3:
                tipoCarta = "Espadas";
                break;
            case 4:
                tipoCarta = "Mazo";
                break;
        }

        int numero = (int)(Math.random() * 10) + 2;
        switch (numero) {
            case 7:
                numeroCarta = "Sota";
                break;
            case 8:
                numeroCarta = "Caballo";
                break;
            case 9:
                numeroCarta = "Rey";
                break;
            case 10:
                numeroCarta = "As";
                break;
            default:
                numeroCarta = String.valueOf(numero);
        }

        System.out.print("La carta seleccionanda es: " + numeroCarta + " de " + tipoCarta);

    }
}


























