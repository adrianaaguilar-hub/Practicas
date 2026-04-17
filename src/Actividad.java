public class Actividad {
    private String nombre;
    private String monitor;
    private int aforoMaximo;
    private DiaHora[] horario;

    public Actividad(String nombre, String monitor, int aforo) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.aforo = aforo;
    }

    public void asignarHorario(DiaHora[] horario) {
        assert horario != null;
        this.horario = horario;
    }

    public void mostrar() {
        System.out.println("Actividad: " + this.nombre + " | Monitor: " + this.monitor + " | Aforo: " + this.aforoMaximo);
    }
}
