public class Gimnasio {
    private String nombre;
   
    public Gimnasio(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirSocio(Socio socio) {
        assert socio != null;
    }

    public void realizarReserva(Socio socio, Actividad actividad, Fecha fecha) {
        assert socio != null && actividad != null && fecha != null;
    }

    public void consultarOcupacion(Actividad actividad) {
        assert actividad != null;
    }

    public void mostrar() {
        System.out.println("Gimnasio: " + this.nombre);
    }
}
