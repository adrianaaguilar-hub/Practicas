import java.util.Scanner;

/**
 * Clase Coordenada - Encapsulación de posición
 * Metodología: HOOD (Hierarchical Object Oriented Design)
 * 
 * Objetivo: Guardar una posición (fila, columna) del tablero
 * de Tres en Raya y permitir que se solicite al usuario.
 */
public class Coordenada {
    private int fila;
    private int columna;

    /**
     * Constructor por defecto
     */
    public Coordenada() {
        this.fila = 0;
        this.columna = 0;
    }

    /**
     * Constructor con parámetros
     */
    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    /**
     * Método pedir() - Solicita coordenadas válidas al usuario
     * 
     * Explicación línea 4 y 5:
     * Línea 4: System.out.print("Introduce la columna (1-3): ");
     *   → Muestra el mismo patrón que para la fila
     *   
     * Línea 5: this.columna = lector.nextInt();
     *   → Lee el número que ingresa el usuario
     *   → Lo almacena en el atributo columna usando this
     */
    public void pedir() {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introduce la fila (1-3): ");
        this.fila = lector.nextInt();
        
        // LÍNEA 4: Muestra un mensaje pidiendo la columna
        System.out.print("Introduce la columna (1-3): ");
        
        // LÍNEA 5: Usa 'lector' para leer el número y guárdalo en this.columna
        this.columna = lector.nextInt();
    }

    /**
     * Método esValida() - Valida que las coordenadas estén en rango (1-3)
     * Validación: Asegurar que el objeto nace sano (Día 2 del Plan)
     */
    public boolean esValida() {
        return (fila >= 1 && fila <= 3) && (columna >= 1 && columna <= 3);
    }

    /**
     * Getters - Para acceder desde otras clases
     * (Aplicando paso de mensajes: HOOD)
     */
    public int obtenerFila() {
        return this.fila;
    }

    public int obtenerColumna() {
        return this.columna;
    }

    /**
     * toString() - Para imprimir la coordenada
     */
    public String toString() {
        return String.format("(%d,%d)", fila, columna);
    }
}
