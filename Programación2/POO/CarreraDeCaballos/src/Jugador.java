package Programación2.POO.CarreraDeCaballos.src;

public class Jugador {
	private String nombre;

	public Jugador() {
		this.nombre = "Jugador";
	}

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerNombre() {
		return this.nombre;
	}
}
