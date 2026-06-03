package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class SocioPremium extends Socio implements Facturable {
    private boolean accesoSpa;
    private boolean accesoInBody;
    private static final double CUOTA_BASE_PREMIUM = 30.0;
    private double aporteExtraPorSerPremium = 15.0;

    public SocioPremium(String nombre, String dni, boolean estaActivo, boolean accesoSpa, boolean accesoInBody) {
        super(nombre, dni, estaActivo, CUOTA_BASE_PREMIUM);
        this.accesoSpa = accesoSpa;
        this.accesoInBody = accesoInBody;
    }

    @Override
    public void mostrar () {
        super.mostrar();
        String textoInBody = accesoInBody ? "Tienes acceso para utilizar InBody" : "No tienes acceso para realizar InBody";
        String textoSpa = accesoSpa ? "Tienes acceso al Spa" : "No tienes acceso al Spa";
        System.out.println("--> Beneficios Premium: " + textoSpa + " ," + textoInBody);
    }

    @Override
    public double calcularMensualidad () {
         return super.calcularMensualidad() + aporteExtraPorSerPremium;
        
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = super.getMensualidadBase() + aporteExtraPorSerPremium;
        return precioFinal;
    }
}


