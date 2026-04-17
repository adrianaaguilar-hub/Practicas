public class Reserva {
    private Socio socio;
    private Actividad actividad;
    private Fecha fecha;

    public Reserva(Socio socio, Actividad actividad, Fecha fecha) {
        assert socio != null && actividad != null && fecha != null;
        this.socio = socio;
        this.actividad = actividad;
        this.fecha = fecha;
    }

    public void mostrar() {
        this.socio.mostrar();
        this.actividad.mostrar();
        this.fecha.mostrar();
    }
}
