package Programación2.ExamenParcial;

class Actividad {
    private String nombre;
    private String monitor;
    private int aforoMaximo;
    private DiaHora[] horario;

    public Actividad(String nombre, String monitor, int aforo) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.aforoMaximo = aforo;
    }

    public void asignarHorario(DiaHora[] horario) {
        assert horario != null;
        this.horario = horario;
    }

    public int getAforo() {
        return this.aforoMaximo;
    }
}
