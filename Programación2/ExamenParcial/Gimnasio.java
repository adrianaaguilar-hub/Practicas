package Programación2.ExamenParcial;

class Gimnasio {
    private String nombre;
    private Socio[] socios;
    private Actividad[] actividades;
    private Reserva[] reservas;
    private int contadorSocios;
    private int contadorActividades;
    private int contadorReservas;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        this.socios = new Socio[100];
        this.actividades = new Actividad[20];
        this.reservas = new Reserva[500];
        this.contadorSocios = 0;
        this.contadorActividades = 0;
        this.contadorReservas = 0;
    }

    public void inscribirSocio(Socio socio) {
        assert socio != null;
        this.socios[contadorSocios] = socio;
        this.contadorSocios++;
    }

    public void agregarActividad(Actividad actividad) {
        assert actividad != null;
        this.actividades[contadorActividades] = actividad;
        this.contadorActividades++;
    }

    public void hacerReserva(Socio socio, Actividad actividad, Fecha fecha) {
        if (this.hayCupo(actividad, fecha)) {
            this.reservas[contadorReservas] = new Reserva(socio, actividad, fecha);
            this.contadorReservas++;
        }
    }

    private boolean hayCupo(Actividad actividad, Fecha fecha) {
        int ocupacion = this.calcularOcupacion(actividad, fecha);
        return ocupacion < actividad.getAforo();
    }

    private int calcularOcupacion(Actividad actividad, Fecha fecha) {
        int cuenta = 0;
        for (int i = 0; i < contadorReservas; i++) {
            if (reservas[i].esDe(null, actividad, fecha)) { // Ajustar lógica de comparación
                cuenta++;
            }
        }
        return cuenta;
    }

    public void cancelarReserva(Socio socio, Actividad actividad, Fecha fecha) {
        for (int i = 0; i < contadorReservas; i++) {
            if (reservas[i].esDe(socio, actividad, fecha)) {
                this.eliminarReserva(i);
            }
        }
    }

    private void eliminarReserva(int indice) {
        for (int i = indice; i < contadorReservas - 1; i++) {
            reservas[i] = reservas[i + 1];
        }
        reservas[contadorReservas - 1] = null;
        contadorReservas--;
    }
}
