package Programación2.POO.CarreraDeCaballos.src;

public class Tiempo {
    private final int HORA_INICIO = 0;
    private final int MINUTO_INICIO = 0;
    private final int HORA_CIERRE = 21;
    private int horaActual;
    private int minutoActual;

    public Tiempo() {
        this.horaActual = HORA_INICIO;
        this.minutoActual = MINUTO_INICIO;
    }

    public void avanzar() {
        this.minutoActual = this.minutoActual + 1;

        if (this.minutoActual >= 60) {
            this.minutoActual = 0;
            this.horaActual = this.horaActual + 1;
        }
    }

    public boolean haFinalizado() {
        return this.horaActual > HORA_CIERRE
                || (this.horaActual == HORA_CIERRE && this.minutoActual > 0);
    }

    public void mostrar() {
        System.out.println(this.horaHumana());
    }

    private String horaHumana() {
        return String.format("%02d:%02d", this.horaActual, this.minutoActual);
    }
}
