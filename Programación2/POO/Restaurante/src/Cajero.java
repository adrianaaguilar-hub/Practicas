package Programación2.POO.Restaurante.src;

public class Cajero {
    private String nombre;

    public Cajero(String nombre) {
        assert nombre != null;
        this.nombre = nombre;
    }

    public void cobrar(Hamburguesa hamburguesa) {
        assert hamburguesa != null;
        
        double precioBase = hamburguesa.getPrecioBase();
        double precioTotal = GestorPrecios.calcularPrecioFinal(precioBase);

        this.imprimirTicket(hamburguesa.getNombre(), precioTotal);
    }

    private void imprimirTicket(String nombreProducto, double total) {
        System.out.println("Cajero: " + this.nombre);
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Total a pagar (IVA inc): " + total + "€");
    }
}