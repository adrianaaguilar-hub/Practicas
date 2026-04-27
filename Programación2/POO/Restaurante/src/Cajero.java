package Programación2.POO.Restaurante.src;

public class Cajero {
    private String nombre;

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    public void cobrar(Hamburguesa hamburguesa) {
        double precioBase = hamburguesa.getPrecioBase();

        double precioTotal = GestorPrecios.calcularPrecioFinal();

        this.imprimirTicket(hamburguesa.getNombre(), precioFinal);
    }

    private void imprimirTicket(String nombreProducto, double total) {
        System.out.println("Cajero: " + this.nombre);
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Total a pagar (IVA inc): " + total + "€");
    }
}
