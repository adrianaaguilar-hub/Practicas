package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class Reserva {
    private SocioEstandar socio;
    private Actividad actividad;
    private Fecha fecha;

    public Reserva(SocioEstandar socio, Actividad actividad, Fecha fecha) {
        assert socio != null && actividad != null && fecha != null; 
        this.socio = socio;
        this.actividad = actividad;
        this.fecha = fecha;
    }

    boolean coincide(SocioEstandar socio, Actividad actividad, Fecha fecha) {
        return this.socio == socio
                && this.actividad == actividad
                && this.fecha.esIgual(fecha);
    }

    boolean esDeActividad(Actividad actividad) {
        return this.actividad == actividad;
    }

    public void mostrar() {
        socio.mostrar();
        actividad.mostrar();
        fecha.mostrar();
    }
}
