package Programación2.POO.SistemaNotas;

/**
 * Clase Estudiante - Representa UN estudiante con sus calificaciones
 * 
 * ATRIBUTOS (características):
 * - nombre: String (el nombre del estudiante)
 * - calificacion: int[] (array de 10 notas)
 * - contador: int (cuántas notas lleva registradas)
 * 
 * MÉTODOS (acciones que puede hacer):
 * - AñadirCalificacion(): agrega una nueva nota
 * - MostrarCalificacion(): muestra todas las notas
 * - PromedioDeCalificaciones(): calcula el promedio
 * - MostrarPromedio(): muestra si aprobó o no
 */
public class Estudiante {
    
    // === ATRIBUTOS (datos del estudiante) ===
    String nombre;
    int[] calificacion = new int[10];  // Máximo 10 calificaciones
    int contador = 0;  // Contador de cuántas notas lleva
    
    
    // === CONSTRUCTOR (cómo se crea un estudiante) ===
    /**
     * Constructor: se ejecuta cuando haces "new Estudiante()"
     * @param nombre - el nombre del estudiante
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
        // this.nombre se refiere al atributo de la clase
        // nombre es el parámetro que recibe
    }

    
    // === MÉTODOS (acciones) ===
    
    /**
     * Agrega una nueva calificación al array
     * @param nota - la nota a agregar (0-10)
     */
    public void AñadirCalificacion(int nota) {
        // Guarda la nota en la posición actual del contador
        this.calificacion[this.contador] = nota;
        // Aumenta el contador para la próxima nota
        this.contador++;
    }

    
    /**
     * Muestra todas las calificaciones guardadas
     */
    public void MostrarCalificacion() {
        // Verifica si hay calificaciones
        if (contador == 0) {
            System.out.println("No tienes calificaciones registradas aún");
            return;  // Sale del método
        }
        
        System.out.println("\n--- Calificaciones de " + this.nombre + " ---");
        // Recorre solo las notas que se han agregado (hasta contador)
        for (int i = 0; i < contador; i++) {
            System.out.println("  " + (i + 1) + ". " + this.calificacion[i]);
        }
    }

    
    /**
     * Calcula el promedio de las calificaciones
     * @return el promedio (double)
     */
    public double PromedioDeCalificaciones() {
        int sumaCalificaciones = 0;
        
        // Suma todas las calificaciones
        for (int i = 0; i < contador; i++) {
            sumaCalificaciones = sumaCalificaciones + calificacion[i];
        }
        
        // Calcula el promedio (divide entre la cantidad de notas)
        double promedioCalificaciones = (double) sumaCalificaciones / contador;
        
        return promedioCalificaciones;
    }
    
    
    /**
     * Muestra si el estudiante aprobó o no según su promedio
     */
    public void MostrarPromedio() {
        if (contador == 0) {
            System.out.println("No puedes ver el promedio sin calificaciones");
            return;
        }
        
        double promedio = PromedioDeCalificaciones();
        System.out.println("\n=== Promedio de " + this.nombre + " ===");
        System.out.println("Promedio: " + promedio);
        
        if (promedio >= 6) {
            System.out.println("✓ ¡Felicidades! Has aprobado");
        } else {
            System.out.println("✗ Has desaprobado");
        }
    }
}
