package Programación2.ExamenFinal.BeachClub;

public class PlatoBrunch extends Consumcion {
    private  boolean tamañoGrande;
    private boolean esVegano;
    private double precioFinal;
    private double extraTamañoGrande = 1.75;
    private double descuentoVegano = 0.90;

    public PlatoBrunch (String nombre, double precioBase, boolean TamañoGrande, boolean esVegano) {
        super(nombre, precioBase);
        this.TamañoGrande = extraTamañoGrande;
        this.esVegano = esVegano;
    }

    private boolean esTamañoGrande () {
        return tamañoGrande;
    }

    private boolean esVegano () {
        return esVegano;
    }

    @Override
    private double calcularPrecioFinal () {
     double resultado = this.precioBase;

    if (this.tamañoGrande) { 
        resultado = resultado + this.extraTamañoGrande;
    }

    if (this.esVegano) {
        resultado = resultado * this.descuentoVegano;
    }

    return resultado;
    }
}
