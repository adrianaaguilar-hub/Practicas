package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class ClienteGym {
    private boolean estaActivo = true;
    private boolean estaInactivo = false;
    private int aforo14 = 14;
    private int aforo15 = 15;
     public static void main(String[] args) {

        Gimnasio miGym = new Gimnasio("Fitness Park");

        Socio socio1 = new Socio("Adriana Aguilar", "12345678A", estaActivo);
        Socio socio2 = new Socio("Samuel Herrera", "87654321B", estaActivo);

        Actividad spinning = new Actividad("Spinning", "Adriana", aforo14);
        Actividad yoga = new Actividad("Yoga", "Samuel", aforo15);

        miGym.inscribirSocio(socio1);
        miGym.inscribirSocio(socio2);

        Fecha fechaReserva = new Fecha(1, 4, 2026);

        miGym.hacerReserva(socio2, spinning, fechaReserva);
        miGym.hacerReserva(socio2, yoga, fechaReserva);

        miGym.consultarOcupacion(spinning);
        
        miGym.mostrar();
    }
}
