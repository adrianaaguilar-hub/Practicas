package Programación2.POO.Solitario.src;

public class Palo {
    
    private Carta[] cartas;
    private int ultima;

    public Palo() {
        this.cartas = new Carta[13];
        this.ultima = 0;
    }

    public void poner(Carta carta) {
        cartas[ultima] = carta;
        ultima++;
    }

    public Carta sacar() {
        if(ultima > 0) {
            ultima--;
            return cartas[ultima];
        }
        return null;
    }

    public void mostrar() {
        if(ultima > 0) {
            cartas[ultima - 1].mostrar();
        } else {
            System.out.print("[Vacío]");
        }
    }

    public void moverA(Columna columnaA) {
        Carta carta = this.sacar();
        if(carta != null) {
            columnaA.poner(carta);
        }
    }

    public boolean completo() {
        return ultima == 13;
    }

}