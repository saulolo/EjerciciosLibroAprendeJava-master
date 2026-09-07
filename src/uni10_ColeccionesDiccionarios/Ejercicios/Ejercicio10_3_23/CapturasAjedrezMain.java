package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_23;

import java.util.ArrayList;

/**
 * En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones, una torre 5 peones, un alfil 3, un
 * caballo 2 y un péon vale, lógicamente, 1 peón. Realiza un programa que genere al azar las capturas que ha hecho un
 * jugador durante una partida. El número de capturas será un valor aleatorio entre 0 y 15. Hay que tener en cuenta que
 * cada jugador tiene la posibilidad de capturar algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2 alfiles,
 * 2 caballos y 8 peones. Al final debe aparecer la puntuación total.
 * @author Saulolo
 */
public class CapturasAjedrezMain {

    public static void main(String[] args) {

        System.out.println("=== CAPTURAS EN AJEDREZ ===");

        int numeroCapturas = (int) (Math.random() * 16);

        ArrayList<Ficha> fichas = new ArrayList<>();
        fichas.add(new Ficha("dama", 9));
        fichas.add(new Ficha("torre", 5));
        fichas.add(new Ficha("torre", 5));
        fichas.add(new Ficha("alfil", 3));
        fichas.add(new Ficha("alfil", 3));
        fichas.add(new Ficha("caballo", 2));
        fichas.add(new Ficha("caballo", 2));
        fichas.add(new Ficha("peón", 1));
        fichas.add(new Ficha("peón", 1));
        fichas.add(new Ficha("peón", 1));
        fichas.add(new Ficha("peón", 1));
        fichas.add(new Ficha("peón", 1));
        fichas.add(new Ficha("peón", 1));
        fichas.add(new Ficha("peón", 1));
        fichas.add(new Ficha("peón", 1));

        ArrayList<Ficha> capturadas = new ArrayList<>();

        for (int i = 0; i < numeroCapturas; i++) {
            int indiceAleatorio = (int) (Math.random() * fichas.size());
            Ficha fichaSeleccionada = fichas.get(indiceAleatorio);
            capturadas.add(fichaSeleccionada);
            fichas.remove(indiceAleatorio);
        }

        int totalPuntos = 0;
        for (Ficha capturada : capturadas) {
            System.out.println(capturada.getNombre() + " (" + capturada.getValor() + " peones)");
            totalPuntos += capturada.getValor();
        }

        System.out.println("Fichas capturadas por el jugador: ");
        System.out.println("Puntos totales: " + totalPuntos + " peones.");

    }
}
