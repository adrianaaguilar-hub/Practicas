package Programación2.POO.Solitario.src;

import java.util.Random;

public class Baraja {

    private Carta[] cartas;
    private int ultima;
    private Console console;

    public Baraja(){
        ultima = 0;
        cartas = new Carta[52];
        for(int palo=0;palo<4;palo++){
            for(int numero=0;numero<13;numero++){
                this.poner(new Carta(palo, numero));
            }
        }
        this.mezclar();
        console = new Console();
    }

    private void mezclar() {
        Random aleatorio = new Random();
        for(int i = 0; i<1000; i++){
            int origen = aleatorio.nextInt(52);
            int destino = aleatorio.nextInt(52);
            Carta carta = cartas[origen];
            cartas[origen] = cartas[destino];
            cartas[destino] = carta;
        }        
    }

    private void poner(Carta carta) {
        cartas[ultima]=carta;
        ultima++;
    }

    public void mostrar() {
        console.writeln("BARAJA ");
        Carta carta = this.cima();
        if(carta != null) {
            carta.mostrar();
        }
    }

    public Carta cima() {
        if(ultima > 0) {
            return cartas[ultima - 1];
        }
        return null;
    }

    public Carta sacar() {
        if(ultima > 0) {
            ultima--;
            return cartas[ultima];
        }
        return null;
    }

    public void moverA(Descarte descarte) {
        this.cartas[ultima] = descarte.cartas[ultima];
    }

}