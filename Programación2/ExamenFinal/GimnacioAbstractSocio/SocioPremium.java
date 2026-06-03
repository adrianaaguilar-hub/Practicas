package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class SocioPremium extends Socio {
    private boolean accesoSpa;
    private boolean accesoInBody;
    private double aporteExtraPorSerPremium = 15.0;

    public SocioPremium (String nombre, String dni, boolean estaActivo, boolean accesoSpa, boolean accesoInBody) {
        super(nombre, dni, estaActivo);
        this.accesoSpa = accesoSpa;
        this.accesoInBody = accesoInBody;
    }

    @Override
    public void mostrar () {
        super.mostrar();
        String textoInBody = accesoInBody ? "Tienes acceso para utilizar InBody" : "No tienes acceso para realizar InBody";
        String textoSpa = accesoSpa ? "Tienes acceso al Spa" : "No tienes acceso al Spa";
        System.err.println("--> Beneficios Premium: " + textoSpa + " ," + accesoInBody);
    }

    @Override
    public double calcularMensualidad () {
         return super.calcularMensualidad() + aporteExtraPorSerPremium;
        
    }
}


