package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class SocioEstandar extends Socio implements Facturable{
    private static final double CUOTA_ESTANDAR = 30.0;

    public SocioEstandar(String nombre, String dni, boolean estaActivo) {
        super(nombre, dni, estaActivo, CUOTA_ESTANDAR); 

    @Override
    public double calcularPrecioFinal() {
        return this.getMensualidadBase(); 
    }
}
}
