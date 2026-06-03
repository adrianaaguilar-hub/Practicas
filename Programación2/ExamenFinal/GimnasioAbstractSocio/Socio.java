package Programación2.ExamenFinal.RefactorGimnasioExParcial;

abstract class Socio {
    private String nombre;
    private String dni;
    private boolean estaActivo;
    private double mensualidadBase;
    

    public Socio(String nombre, String dni, boolean estaActivo, double mensualidadBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.estaActivo = estaActivo;
        this.mensualidadBase = mensualidadBase;
    }

    public void cambiarEstado(boolean nuevoEstado) {
        estaActivo = nuevoEstado;
    }

    public void mostrar() {
        String estado = estaActivo ? "Activo" : "Inactivo";
        System.out.println("Socio: " + nombre + " (DNI: " + dni + ") - [" + estado + "]");
    }

    protected double getMensualidadBase() {
        return this.mensualidadBase;
    }

    public abstract double calcularPrecioFinal();
}
