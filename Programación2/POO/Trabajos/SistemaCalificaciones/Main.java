package Programación2.POO.SistemaCalificaciones;

import java.util.Scanner;

/**
 * Programa principal - Sistema de Gestión de Calificaciones
 * 
 * Este programa permite:
 *   - Agregar hasta 10 calificaciones
 *   - Ver todas las calificaciones
 *   - Calcular y ver el promedio
 *   - Salir del programa
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programaActivo = true;
        
        // Crear un objeto Estudiante
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre);
        
        System.out.println("\n¡Bienvenido/a " + nombre + "! 🎓");
        
        // Ciclo principal del programa
        do {
            mostrarMenu();
            String opcion = scanner.nextLine().toUpperCase();
            
            switch (opcion) {
                case "A" -> agregarNota(scanner, estudiante);
                case "V" -> estudiante.mostrarCalificaciones();
                case "P" -> estudiante.mostrarPromedio();
                case "S" -> {
                    System.out.println("\n👋 ¡Hasta luego!");
                    programaActivo = false;
                }
                default -> System.out.println("\n❌ Opción no válida. Intenta de nuevo.");
            }
            
        } while (programaActivo);
        
        scanner.close();
    }
    
    // MÉTODO AUXILIAR: Mostrar el menú
    private static void mostrarMenu() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║   MENÚ DE CALIFICACIONES       ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("[A] Agregar una calificación");
        System.out.println("[V] Ver todas las calificaciones");
        System.out.println("[P] Ver promedio");
        System.out.println("[S] Salir");
        System.out.print("\nElige una opción: ");
    }
    
    // MÉTODO AUXILIAR: Agregar una nota
    private static void agregarNota(Scanner scanner, Estudiante estudiante) {
        if (!estudiante.puedeAgregarMas()) {
            System.out.println("\n⚠️ Ya tienes 10 calificaciones (máximo permitido)");
            return;
        }
        
        System.out.print("\nIngresa la calificación (0-10): ");
        try {
            int nota = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            if (nota >= 0 && nota <= 10) {
                estudiante.agregarCalificacion(nota);
                System.out.println("✅ Calificación agregada correctamente");
                System.out.println("📌 Total de calificaciones: " + estudiante.getContador() + "/10");
            } else {
                System.out.println("❌ La calificación debe estar entre 0 y 10");
            }
        } catch (Exception e) {
            System.out.println("❌ Error: Debes ingresar un número");
            scanner.nextLine(); // Limpiar el buffer
        }
    }
}
