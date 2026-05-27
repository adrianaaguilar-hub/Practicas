package Programación2.ExamenFinal.BeachClub;

public class BebidaBrunch extends Consumcion {
    protected String nombre = MatchaLatte;
    private  boolean tamañoGrande;
    protected double precioBase = 3.50 ;
    private double precioFinal;
    private double extraBebidaGrande = 1.50;

    public BebidaBrunch (String nombre, int precioBase, boolean extraBebidaGrande) {
        this.nombre = nombre;
        this.precioBase = precioBase
        this.extraBebidaGrande = extraBebidaGrande;
    }

    private boolean esTamañoGrande () {
        return true
    }

    private double calcularPrecioFinal () {
        if (esTamañoGrande();) {
            precioFinal = precioBase + extraBebidaGrande;
        } else {
            precioFinal = precioBase;
        }
        return precioFinal;
    }
}
