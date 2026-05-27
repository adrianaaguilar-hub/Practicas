package Programación2.ExamenFinal.BeachClub;

public class Consumcion {
    protected String nombre;
    protected double precioBase;
    protected double extraTamañoGrande;

    public Consumcion (String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();
}
