package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_17;

public class Elemento {

    private String nombreProd;
    private double precio;
    private int cantidad;

    public Elemento(String nombreProd, double precio, int cantidad) {
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombreProd + " PVP: " + precio + " Unidades: " + cantidad + " Subtotal: " + (getPrecio() * getCantidad());
    }
}
