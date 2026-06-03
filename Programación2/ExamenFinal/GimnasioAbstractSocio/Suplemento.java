package Programación2.ExamenFinal.GimnasioAbstractSocio;

public class Suplemento {
    private String descripcion;
    private double precioBote = 40.0;

    public Suplemento(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBote;
    }
}
