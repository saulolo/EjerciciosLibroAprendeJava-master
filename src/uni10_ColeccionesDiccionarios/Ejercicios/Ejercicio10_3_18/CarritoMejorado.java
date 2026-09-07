package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_18;

import java.util.ArrayList;
import java.util.List;

public class CarritoMejorado {

    private ArrayList<ElementoMejorado> elementoMejorados;

    public CarritoMejorado(ArrayList<ElementoMejorado> listaElementos) {
        this.elementoMejorados = new ArrayList<>();
    }

    public CarritoMejorado() {
        this.elementoMejorados = new ArrayList<>();
    }

    public void agrega(ElementoMejorado elementoMejorado) {
        boolean encontrado = false;

        for (ElementoMejorado mejorado : elementoMejorados) {
            if (mejorado.getNombreProd().equalsIgnoreCase(elementoMejorado.getNombreProd())) {
                int nuevaCantidad = mejorado.getCantidad() + elementoMejorado.getCantidad();
                mejorado.setCantidad(nuevaCantidad);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            elementoMejorados.add(elementoMejorado);
        }
    }

    public int numeroElementos() {
        return elementoMejorados.size();
    }

    public double importeTotal() {
        double total = 0;
        for (ElementoMejorado elementoMejorado : elementoMejorados) {
            double subTotal = elementoMejorado.getPrecio() * elementoMejorado.getCantidad();
            total = total + subTotal;
        }
        return total;
    }

    public List<ElementoMejorado> getElementoMejorados() {
        return elementoMejorados;
    }

    public void setElementoMejorados(ArrayList<ElementoMejorado> elementoMejorados) {
        this.elementoMejorados = elementoMejorados;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("""
                Contenido del Carrito \
                \s
                =====================
                """);
        for (ElementoMejorado elementoMejorado : elementoMejorados) {
            resultado.append(elementoMejorado.toString()).append("\n");
        }
        return resultado.toString();
    }

}
