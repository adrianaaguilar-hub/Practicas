package Programación2.POO.CentroComercial.src;

public class Cola { 
    private Cliente[] clientes;
    private final int CAPACIDAD_MAXIMA = 100;
    private int tamaño;
    private Console console;

    public Cola () {
        clientes = new CLiente[CAPACIDAD_MAXIMA];
        minutosSinClientes = 0;
        tamaño = 0;
        console = new Console ();
    }

    public void registrarEstado () {}
    
    public void añadirCliente() {
        clientes[tamaño] = cliente;
        tamaño = tamaño + 1;
    }
    public boolean hayClientes(){
        return tamaño > 0;
    }
    public CLiente quitarCliente() {
        Cliente cliente = clientes[0];
        for (int i= 0; i < tamaño -1; i++) {
            clientes[i] = clientes [i+1];
        }
        clientes[tamaño -1] = null;
        tamaño = tamaño -1;
        return cliente;
    }
    public void mostrar () {
    public int obtenerMinutosSinClientes() {}
    public int obtenerCantidadPersonasEnCola () {}
    }
}
