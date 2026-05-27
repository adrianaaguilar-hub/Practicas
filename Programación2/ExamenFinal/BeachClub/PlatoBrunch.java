package Programación2.ExamenFinal.BeachClub;

public class PlatoBrunch extends Consumcion {
private boolean tamañoGrande;
    private boolean esVegano;
    private double extraTamañoGrande = 1.75;
    private double descuentoVegano = 0.90;

    public PlatoBrunch(String nombre, double precioBase, boolean tamañoGrande, boolean esVegano) {
        super(nombre, precioBase);
        this.tamañoGrande = tamañoGrande; 
        this.esVegano = esVegano;
    }

    @Override
    public double calcularPrecioFinal () {
     double resultado = precioBase;

    if (tamañoGrande) { 
        resultado = resultado + extraTamañoGrande;
    }

    if (esVegano) {
        resultado = resultado * descuentoVegano;
    }

    return resultado;
    }
}
