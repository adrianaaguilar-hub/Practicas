package Programación2.ExamenFinal.BeachClub;

public class BebidaBrunch extends Consumicion {
    private boolean tamañoGrande;
    private double extraTamañoGrande = 1.50;

    public BebidaBrunch(String nombre, double precioBase, boolean tamañoGrande) {
        super(nombre, precioBase);
        this.tamañoGrande = tamañoGrande;
    }

    @Override
    public double calcularPrecioFinal() { 
        if (tamañoGrande) { 
            return precioBase + extraTamañoGrande;
        } else {
            return precioBase;
        }
    }
}