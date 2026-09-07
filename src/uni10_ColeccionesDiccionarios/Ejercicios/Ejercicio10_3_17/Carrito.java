package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_17;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private ArrayList<Elemento> listaElementos;

    public Carrito(ArrayList<Elemento> listaElementos) {
        this.listaElementos = new ArrayList<>();
    }

    public Carrito() {
        this.listaElementos = new ArrayList<>();
    }

    public void agrega(Elemento elemento) {
        listaElementos.add(elemento);
    }

    public int numeroElementos() {
        return listaElementos.size();
    }

    public double importeTotal() {
        double total = 0;
        for (Elemento listaElemento : listaElementos) {
            double subTotal = listaElemento.getPrecio() * listaElemento.getCantidad();
            total = total + subTotal;
        }
        return total;
    }

    public List<Elemento> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(ArrayList<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("""
                Contenido del Carrito \
                \s
                =====================
                """);
        for (Elemento listaElemento : listaElementos) {
            resultado.append(listaElemento.toString()).append("\n");
        }
        return resultado.toString();
    }

}
