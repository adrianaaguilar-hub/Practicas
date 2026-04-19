package Programación2.TresEnRaya.src;

public class Juego {
      
    public Juego () {}
    
    public static void main(String[] args) {
         do {
        limpiarPantalla();
        iniciarJuego();
        mostrarJuego();
        jugarPartida();
        gestionarTurno();
    } while (!Tablero.hayTresEnRaya());
    }
   

    public void mostrarJuego (Tablero tablero, Ficha ficha) {}

    public void iniciarJuego () {}

    public void jugarPartida () {}

    public void gestionarTurno (Turno turno) {
        Turno.turnoJugadorX ();
        Turno.turnoJugador0 ();
    }

    public void limpiarPantalla () {}

}
