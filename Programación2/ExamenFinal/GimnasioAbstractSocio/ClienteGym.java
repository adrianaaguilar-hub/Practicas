package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class ClienteGym {
    
     public static void main(String[] args) {

        boolean estaActivo = true;
        boolean accesoSpa = true;
        boolean accesoInBody = true;
        int aforo14 = 14;
        int aforo15 = 15;

        Gimnasio miGym = new Gimnasio("Fitness Park");

        Socio[] socios = new Socio[2]; 
        socios[0] = new SocioPremium("Adriana Aguilar", "12345678A", estaActivo, accesoSpa, accesoInBody);
        socios[1] = new SocioEstandar("Samuel Herrera", "87654321B", estaActivo);
        
        Suplemento proteina = new Suplemento("Proteina Isolate 1kg");

        Actividad spinning = new Actividad("Spinning", "Adriana", aforo14);
        Actividad yoga = new Actividad("Yoga", "Samuel", aforo15);

        miGym.inscribirSocio(socios[0]);
        miGym.inscribirSocio(socios[1]);
        miGym.agregarActividad(spinning);
        miGym.agregarActividad(yoga);

        miGym.registrarTransaccion(socios[0]); 
        miGym.registrarTransaccion(socios[1]); 
        miGym.registrarTransaccion(proteina);   

        Fecha fechaReserva = new Fecha(1, 4, 2026);
        miGym.hacerReserva(socios[1], spinning, fechaReserva);
        miGym.hacerReserva(socios[1], yoga, fechaReserva);

        miGym.consultarOcupacion(spinning);

        double recaudacion = miGym.calcularCajaTotal();
        System.out.println("Total de caja recaudado hoy: " + recaudacion + " €");
        
        miGym.mostrar();
    }
}
