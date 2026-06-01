package Programación2.ExamenFinal.Festival;

public class EntradaVIP extends EntradaGeneral {
    private boolean incluyeBarraLibre;
    private final double comisionVIP = 40.0;
    
    public EntradaVIP (String nombreAsistente, int precioBase, boolean incluyeAccesoPiscina, boolean incluyeBarraLibre) {
        super(nombreAsistente, precioBase, incluyeAccesoPiscina);
        this.incluyeBarraLibre = incluyeBarraLibre;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal;
        precioFinal = super.calcularPrecioFinal() + comisionVIP;
        return precioFinal;
    }
}
