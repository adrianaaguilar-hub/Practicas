package Programación2.POO.Restaurante.src;

public class Hamburguesa {
    private String nombre;
    private double precioBase;
    private boolean esVegana;
    private String[] tipoCarne = { "res", "pollo", "vegana" };
    private String [] vegetales = {"lechuga", "tomate", "pepinillos"}
    private boolean conSalsa;
    private boolean conQueso;

    public Hamburguesa(String nombre, double precio, boolean esVegana, boolean conSalsa, boolean conQueso) {
        assert precio > 0;

        this.nombre = nombre;
        this.precio = precio;
        this.esVegana = esVegana;
        this.conSalsa = conSalsa;
        this.conQueso = conQueso;
    }

    public Hamburguesa(String nombre, double precioBase) {
        this(nombre, precioBase, true, true, false);
    }

    public int precioBase () {
        return precioBase;
    }
}
