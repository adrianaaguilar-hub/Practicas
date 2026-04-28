package Programación2.POO.CarreraDeCaballos.src;

public class Caballo {
    private int id;
    private int posicion;
    private int movimiento;

    public Caballo(int id) {
        this.id = id;
        this.posicion = 0;
        this.movimiento = 0;
    }

    public void moverse() {
        this.movimiento = this.avanzar();
        this.posicion = this.posicion + this.movimiento;
    }

    public boolean hayEmpate(Caballo otroCaballo) {
        return this.posicion == otroCaballo.posicion;
    }

    public int avanzar() {
        return (int) (Math.random() * 2) + 1;
    }

    public int obtenerPosicion() {
        return this.posicion;
    }

    public int obtenerId() {
        return this.id;
    }
}
