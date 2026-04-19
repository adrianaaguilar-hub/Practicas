package Programación2.POO.SistemaNotas;

import java.util.Scanner;

/**
 * Clase Principal - Sistema de Gestión de Calificaciones
 * 
 * Esta clase contiene el método main() que ejecuta todo el programa.
 * Crea un objeto Estudiante y permite gestionar sus calificaciones
 * mediante un menú interactivo.
 */
public class Calificaciones {
    
    public static void main(String[] args) {
        // === INICIALIZACIÓN ===
        Scanner scanner = new Scanner(System.in);
        boolean programaActivo = true;
        int nota;
        
        // Crear UN objeto de tipo Estudiante
        Estudiante estudiante1 = new Estudiante("Adriana");
        
        System.out.println("¡Bienvenida al Sistema de Calificaciones!");
        
        
        // === BUCLE PRINCIPAL DEL PROGRAMA ===
        do {
            // 1. Mostrar el menú de opciones
            ImprimirMenu();
            
            // 2. Leer la opción del usuario
            String comando = scanner.nextLine().toUpperCase();
            
            // 3. Ejecutar la acción según la opción elegida
            switch (comando) {
                
                case "A" -> {
                    // Agregar calificación
                    if (estudiante1.contador < 10) {
                        System.out.print("Ingresa la calificación (0-10): ");
                        nota = scanner.nextInt();
                        scanner.nextLine();  // Limpiar el buffer del Enter
                        
                        // Validar que esté en rango
                        if (nota >= 0 && nota <= 10) {
                            estudiante1.AñadirCalificacion(nota);
                            System.out.println("✓ Calificación agregada!");
                        } else {
                            System.out.println("✗ La nota debe estar entre 0 y 10");
                        }
                    } else {
                        System.out.println("Ya tienes 10 calificaciones, no puedes agregar más");
                    }
                }
                
                case "V" -> {
                    // Ver todas las calificaciones
                    estudiante1.MostrarCalificacion();
                }
                
                case "P" -> {
                    // Ver el promedio
                    estudiante1.MostrarPromedio();
                }
                
                case "S" -> {
                    // Salir del programa
                    System.out.println("\n¡Adiós! Cerrando el programa...");
                    programaActivo = false;
                }
                
                default -> {
                    // Comando no reconocido
                    System.out.println("✗ Comando no reconocido. Usa A, V, P o S");
                }
            }
            
        } while (programaActivo);  // Repite mientras el programa esté activo
        
        // Cerrar el scanner al terminar
        scanner.close();
    }

    
    /**
     * Método estático que imprime el menú de opciones
     * Es static porque se llama desde main (que también es static)
     */
    static void ImprimirMenu() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║  MENÚ DE CALIFICACIONES       ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("  Puedes ingresar hasta 10 notas");
        System.out.println("");
        System.out.println("  [A] Agregar una nota nueva");
        System.out.println("  [V] Ver todas tus calificaciones");
        System.out.println("  [P] Ver tu promedio");
        System.out.println("  [S] Salir del programa");
        System.out.println("─────────────────────────────────");
        System.out.print("Elige una opción: ");
    }
}
