package Programación2.POO.CarreraDeCaballos.src;

public class Carrera {
    private Pista pista;
    private Caballo[] caballos;

    public Carrera() {
        this.pista = new Pista(40);
        this.caballos = new Caballo[2];
        this.caballos[0] = new Caballo(1);
        this.caballos[1] = new Caballo(2);
    }

    public void jugar() {
        boolean hayGanador;

        do {
            this.pista.mostrar();

            for (int indiceCaballo = 0; indiceCaballo < this.caballos.length; indiceCaballo++) {
                this.caballos[indiceCaballo].moverse();
            }

            hayGanador = this.pista.hayGanador(this.caballos);
        } while (!hayGanador);
    }
}
