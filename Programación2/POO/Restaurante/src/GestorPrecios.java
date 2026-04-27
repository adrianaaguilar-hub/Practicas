package Programación2.POO.Restaurante.src;

public class GestorPrecios {
    private final double PORCENTAJE_IVA = 1.21;


    public static double calcularPrecioFinal(double precioBase) {
        return precioBase * PORCENTAJE_IVA;
    }
}
