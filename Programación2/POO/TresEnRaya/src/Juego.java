package Programación2.TresEnRaya.src;

public class Juego {
    
    public Juego () {}
    private Tablero tablero;
    private Turno turno;
    private Jugadores [] jugadores;
    
    public Juego () {
        this.tablero = new Tablero();
        this.turno = new Turno ();
        this.jugadores = new Jugadores();
    }

    do {
        limpiarPantalla();
        iniciarJuego();
        mostrarJuego();
        jugarPartida();
        gestionarTurno();
    } while (Tablero tablero = );
    
   

    private void mostrarJuego (Tablero tablero, Ficha ficha) {}

    private void iniciarJuego (Tablero tablero, Ficha ficha) {}

    private void jugarPartida () {}

    private void gestionarTurno (Turno turno) {
        Turno.turnoJugadorX ();
        Turno.turnoJugador0 ();
    }

    private void limpiarPantalla () {}

    private void moverFicha() {}

    private boolean

}
