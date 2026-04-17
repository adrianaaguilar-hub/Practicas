public class ClienteGimnasio {
    public static void main(String[] args) {

        Gimnasio miGym = new Gimnasio("Fitness Park");

  
        Socio socio1 = new Socio("Adriana Aguilar", "12345678A", true);
        Socio socio2 = new Socio("Samuel Herrera", "87654321B", true);

    
        Actividad spinning = new Actividad("Spinning", "Adriana", 14);
        Actividad yoga = new Actividad("Yoga", "Samuel", 15);


        miGym.inscribirSocio(socio1);
        miGym.inscribirSocio(socio2);
        miGym.agregarActividad(spinning);
        miGym.agregarActividad(yoga);

     
        Fecha fechaReserva = new Fecha(1, 4, 2026);

        miGym.hacerReserva(socio2, spinning, fechaReserva);
        miGym.hacerReserva(socio2, yoga, fechaReserva);

     
        miGym.consultarOcupacion(spinning);
        
      
        miGym.mostrar();
    }
}