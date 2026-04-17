package Programación2.ExamenParcial;

class Reserva {
    private Socio socio;
    private Actividad actividad;
    private Fecha fecha;

    public Reserva(Socio socio, Actividad actividad, Fecha fecha) {
        assert socio != null && actividad != null && fecha != null;
        this.socio = socio;
        this.actividad = actividad;
        this.fecha = fecha;
    }

    public boolean esDe(Socio socio, Actividad actividad, Fecha fecha) {

        return this.socio.equals(socio) && 
               this.actividad.equals(actividad) && 
               this.fecha.esIgual(fecha);
    }
}
