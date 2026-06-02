package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class Gimnasio {
     private String nombre;
    private Socio[] socios;
    private int numeroSocios;
    private Actividad[] actividades;
    private int numeroActividades;
    private Reserva[] reservas;
    private int numeroReservas;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        this.socios = new Socio[100];
        this.numeroSocios = 0;
        this.actividades = new Actividad[100];
        this.numeroActividades = 0;
        this.reservas = new Reserva[100];
        this.numeroReservas = 0;
    }

    public void inscribirSocio(Socio socio) {
        assert socio != null;
        if (numeroSocios < socios.length) {
            socios[numeroSocios] = socio;
            numeroSocios++;
        }
    }

    public void agregarActividad(Actividad actividad) {
        assert actividad != null;
        if (numeroActividades < actividades.length) {
            actividades[numeroActividades] = actividad;
            numeroActividades++;
        }
    }

    public void hacerReserva(Socio socio, Actividad actividad, Fecha fecha) {
        assert socio != null && actividad != null && fecha != null;
        if (numeroReservas < reservas.length) {
            Reserva nuevaReserva = new Reserva(socio, actividad, fecha);
            reservas[numeroReservas] = nuevaReserva;
            numeroReservas++;
        }
    }

    public void cancelarReserva(Socio socio, Actividad actividad, Fecha fecha) {
    assert socio != null && actividad != null && fecha != null;
        boolean reservaEncontrada = false;
        int indiceBusqueda = 0;

        while (indiceBusqueda < numeroReservas && !reservaEncontrada) {
            if (reservas[indiceBusqueda].coincide(socio, actividad, fecha)) {
                reservaEncontrada = true;
                for (int indiceDesplazamiento = indiceBusqueda; indiceDesplazamiento < numeroReservas - 1; indiceDesplazamiento++) {
                    reservas[indiceDesplazamiento] = reservas[indiceDesplazamiento + 1];
                }
                reservas[numeroReservas - 1] = null;
                numeroReservas--;
            }
            indiceBusqueda++;
        }
    }

    public void consultarOcupacion(Actividad actividad) {
        assert actividad != null;
        int ocupacionTotal = 0;
        for (int i = 0; i < numeroReservas; i++) {
            if (reservas[i].esDeActividad(actividad)) {
                ocupacionTotal++;
            }
        }
        System.out.println("Ocupacion actual de la actividad: " + ocupacionTotal);
    }

    public void mostrar() {
        System.out.println(nombre);
    }
}
