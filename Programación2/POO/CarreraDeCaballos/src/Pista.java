package Programación2.POO.CarreraDeCaballos.src;

public class Pista {
    private int longitud;

    public Pista(int longitud) {
        assert longitud > 0;
        this.longitud = longitud;
    }

    public void mostrar() {
        // TODO: dibujar pista y posiciones de caballos
    }

    public boolean hayGanador(Caballo[] caballos) {
        for (int indiceCaballo = 0; indiceCaballo < caballos.length; indiceCaballo++) {
            if (caballos[indiceCaballo].obtenerPosicion() >= this.longitud) {
                return true;
            }
        }
        return false;
    }

}
