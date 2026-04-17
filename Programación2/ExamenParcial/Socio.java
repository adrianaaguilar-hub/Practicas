package Programación2.ExamenParcial;

class Socio {
    
    private String nombre;
    private String dni;
    private boolean estaActivo;

    public Socio(String nombre, String dni, boolean estaActivo) {
        this.nombre = nombre;
        this.dni = dni;
        this.estaActivo = estaActivo;
    }

    public void cambiarEstado(boolean estadoCambiado) {
        this.estaActivo = estadoCambiado;
    }
}

