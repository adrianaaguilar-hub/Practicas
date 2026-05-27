package Programación2.ExamenFinal.BeachClub;

public class BebidaBrunch extends Consumcion {
    private  boolean tamañoGrande;
    private double precioFinal;
    private double extraTamañoGrande = 1.50;

    public BebidaBrunch (String nombre, double precioBase, boolean tamañoGrande) {
        super(nombre, precioBase);
        this.tamañoGrande = tamañoGrande;
    }

    private boolean esTamañoGrande () {
        return tamañoGrande
    }

    private double calcularPrecioFinal () {
        if (esTamañoGrande();) {
            precioFinal = precioBase + extraTamañoGrande;
        } else {
            precioFinal = precioBase;
        }
        return precioFinal;
    }
}
