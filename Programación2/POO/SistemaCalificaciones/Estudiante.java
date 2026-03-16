package Programación2.POO.SistemaCalificaciones;

/**
 * Clase Estudiante - Representa a un estudiante con sus calificaciones
 * 
 * Atributos:
 *   - nombre: El nombre del estudiante
 *   - calificaciones: Array que guarda hasta 10 notas
 *   - contador: Lleva la cuenta de cuántas notas se han agregado
 */
public class Estudiante {
    
    // ATRIBUTOS (características del estudiante)
    private String nombre;
    private int[] calificaciones = new int[10];  // Máximo 10 notas
    private int contador = 0;  // Cuántas notas llevamos
    
    // CONSTRUCTOR (cómo crear un estudiante)
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    
    // MÉTODO 1: Agregar una calificación al array
    public void agregarCalificacion(int nota) {
        if (contador < 10) {
            this.calificaciones[this.contador] = nota;
            this.contador++;
        }
    }
    
    // MÉTODO 2: Mostrar todas las calificaciones registradas
    public void mostrarCalificaciones() {
        if (contador == 0) {
            System.out.println("\n❌ No tienes calificaciones registradas aún");
            return;
        }
        
        System.out.println("\n📋 Calificaciones de " + this.nombre + ":");
        System.out.println("─────────────────────");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + this.calificaciones[i]);
        }
        System.out.println("─────────────────────");
    }
    
    // MÉTODO 3: Calcular el promedio de las calificaciones
    private double calcularPromedio() {
        if (contador == 0) {
            return 0;
        }
        
        int suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += calificaciones[i];
        }
        
        return (double) suma / contador;
    }
    
    // MÉTODO 4: Mostrar el promedio con mensaje personalizado
    public void mostrarPromedio() {
        if (contador == 0) {
            System.out.println("\n❌ No hay calificaciones para calcular promedio");
            return;
        }
        
        double promedio = calcularPromedio();
        System.out.println("\n📊 RESULTADO:");
        System.out.println("────────────────────");
        System.out.println("Promedio: " + String.format("%.2f", promedio));
        
        if (promedio >= 6) {
            System.out.println("✅ ¡Felicidades! Has APROBADO");
        } else {
            System.out.println("❌ Has desaprobado");
        }
        System.out.println("────────────────────");
    }
    
    // MÉTODO 5: Obtener cuántas calificaciones tiene
    public int getContador() {
        return this.contador;
    }
    
    // MÉTODO 6: Verificar si puede agregar más calificaciones
    public boolean puedeAgregarMas() {
        return contador < 10;
    }
}
