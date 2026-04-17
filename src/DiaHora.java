public class DiaHora {
    private String dia;
    private String hora;

    public DiaHora(String dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public void mostrar() {
        System.out.println(dia + " a las " + hora);
    }
}