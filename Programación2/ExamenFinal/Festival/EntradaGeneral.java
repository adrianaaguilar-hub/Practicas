package Programación2.ExamenFinal.Festival;

public class EntradaGeneral {
    private boolean incluyeAccesoPiscina;
    private double importePorAccesoPiscina =  15.0 ;

    public EntradaGeneral (boolean incluyeAccesoPiscina) {
        super(nombreAsistente, precioBase);
        this.incluyeAccesoPiscina = incluyeAccesoPiscina;
    }

    @Override
    public double calcularPrecioFinal (int importePorAccesoPiscina) {
        if(incluyeAccesoPiscina) {
            return precioBase + importePorAccesoPiscina;
        } else {
            return precioBase;
        }
    }
}
