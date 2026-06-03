package Programación2.ExamenFinal.Festival;

public class EntradaFestival {
    protected String nombreAsistente;
    protected double precioBase;

    public EntradaFestival ( String nombreAsistente, double precioBase) {
        this.nombreAsistente = nombreAsistente;
        this.precioBase = precioBase;
    }

    public void calcularPrecioFinal ();
}
