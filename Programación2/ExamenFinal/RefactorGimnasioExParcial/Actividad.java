package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class Actividad {
    private String nombre;
    private String monitor;
    private int aforo;
    private DiaHora[] horario;

    public Actividad(String nombre, String monitor, int aforo) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.aforo = aforo;
        this.horario = new DiaHora[0];
    }

    public void asignarHorario(DiaHora[] horario) {
        if (horario == null) {
            this.horario = new DiaHora[0];
        } else {
            this.horario = horario;
        }
    }

    public void mostrar() {
        System.out.println("Actividad: " + this.nombre + " | Monitor: " + this.monitor + " | Aforo: " + this.aforo + " | Horarios: " + this.horario.length);
    }
}
