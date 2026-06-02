package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class Socio {
    private String nombre;
    private String dni;
    private boolean estaActivo;

    public Socio(String nombre, String dni, boolean estaActivo) {
        this.nombre = nombre;
        this.dni = dni;
        this.estaActivo = estaActivo;
    }

    public void cambiarEstado(boolean nuevoEstado) {
        estaActivo = nuevoEstado;
    }

    public void mostrar() {
        String estado = estaActivo ? "Activo" : "Inactivo";
        System.out.println("Socio: " + nombre + " (DNI: " + dni + ") - [" + estado + "]");
    }
}
