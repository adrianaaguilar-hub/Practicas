package Programación2.ExamenFinal.RefactorGimnasioExParcial;

abstract class Socio {
    private String nombre;
    private String dni;
    private boolean estaActivo;
    private int mensualidadBase;
    

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

    protected abstract double getMensualidadBase () {
    return mensualidadBase;
    }

    public abstract double calcularPrecioFinal ();
}
