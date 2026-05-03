package Programación2.POO.Solitario.src;

public class Descarte {
    private Carta carta;

    public void mostrar() {
        if(carta != null) {
            carta.mostrar();
        } else {
            System.out.print("[Vacío]");
        }
    }

    public void moverA(Palo paloDestino) {
        if(carta != null) {
            paloDestino.poner(carta);
            carta = null;
        }
    }

    public void moverA(Columna columnaDestino) {
        if(carta != null) {
            columnaDestino.poner(carta);
            carta = null;
        }
    }

    public void voltear(Baraja baraja) {
        carta = baraja.cima();
        if(carta != null) {
            baraja.sacar();
        }
    }

}
