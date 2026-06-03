package Programación2.ExamenFinal.RefactorGimnasioExParcial;

public class Socio {
    private String nombre;
    private String dni;
    private boolean estaActivo;
    private double mensualidadBase = 30.0;

    public Socio(String nombre, String dni, boolean estaActivo) {
        this.nombre = nombre;
        this.dni = dni;
        this.estaActivo = estaActivo;
    }

    public void cambiarEstado(boolean nuevoEstado) {
        estaActivo = nuevoEstado;
    }

    public double calcularMensualidad() {
    return mensualidadBase;
    }
    


    public void mostrar() {
        String estado = estaActivo ? "Activo" : "Inactivo";
        System.out.println("Socio: " + nombre + " (DNI: " + dni + ") - [" + estado + "]");
    }
}
