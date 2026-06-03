package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class SocioEstandar extends Socio implements Facturable{
    private String nombre;
    private String dni;
    private boolean estaActivo;
    private boolean mensualidadBase = 30.0;

    public SocioEstandar(String nombre, String dni, boolean estaActivo) {
        super(nombre, dni, estaActivo);
        this.estaActivo = estaActivo;
    }

    @Override
    public double calcularPrecioFinal() {
        return this.getMensualidadBase();
    }
    
}
