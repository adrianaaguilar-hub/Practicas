/*
═══════════════════════════════════════════════════════════════════
    SOLUCIÓN DEL EJERCICIO DE REPASO
    (No mires hasta que lo intentes por tu cuenta)
═══════════════════════════════════════════════════════════════════
*/

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioRepaso_SOLUCION {
    
    static String[] estudiantes = {"Ana", "Luis", "María"};
    static String[] materias = {"Matemáticas", "Historia", "Ciencias", "Inglés"};
    static double[][] calificaciones = new double[3][4];
    
    // ═══════════════════════════════════════════════════════════════
    // SOLUCIÓN TODO 1
    // ═══════════════════════════════════════════════════════════════
    public static void inicializarCalificaciones() {
        // Recorrer cada estudiante (fila)
        for (int i = 0; i < 3; i++) {
            // Llenar todas sus calificaciones con 0.0
            Arrays.fill(calificaciones[i], 0.0);
        }
        System.out.println("✓ Calificaciones inicializadas en 0.0");
    }
    
    // ═══════════════════════════════════════════════════════════════
    // SOLUCIÓN TODO 2
    // ═══════════════════════════════════════════════════════════════
    public static void mostrarCalificaciones(int indiceEstudiante) {
        System.out.println("\n════════════════════════════════");
        System.out.println("Estudiante: " + estudiantes[indiceEstudiante]);
        System.out.println("════════════════════════════════");
        
        // Recorrer las 4 materias
        for (int i = 0; i < 4; i++) {
            System.out.println(materias[i] + ": " + calificaciones[indiceEstudiante][i]);
        }
        
        System.out.println("════════════════════════════════");
    }
    
    // ═══════════════════════════════════════════════════════════════
    // SOLUCIÓN TODO 3
    // ═══════════════════════════════════════════════════════════════
    public static void ingresarCalificacion(Scanner scanner, int indiceEstudiante, int indiceMateria) {
        System.out.print("Ingrese calificación de " + materias[indiceMateria] + " para " + estudiantes[indiceEstudiante] + ": ");
        double nota = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        
        // Guardar en la matriz
        calificaciones[indiceEstudiante][indiceMateria] = nota;
        
        System.out.println("✓ Calificación guardada");
    }
    
    // ═══════════════════════════════════════════════════════════════
    // SOLUCIÓN TODO 4
    // ═══════════════════════════════════════════════════════════════
    public static double calcularPromedio(int indiceEstudiante) {
        double suma = 0;
        
        // Sumar las 4 calificaciones
        for (int i = 0; i < 4; i++) {
            suma += calificaciones[indiceEstudiante][i];
        }
        
        // Dividir entre 4 para obtener el promedio
        return suma / 4;
    }
    
    // ═══════════════════════════════════════════════════════════════
    // SOLUCIÓN TODO 5
    // ═══════════════════════════════════════════════════════════════
    public static void menu(Scanner scanner) {
        String opcion = "";
        
        while (!opcion.equals("4")) {
            System.out.println("\n========== MENÚ ==========");
            System.out.println("1. Ingresar calificación");
            System.out.println("2. Ver calificaciones");
            System.out.println("3. Ver promedio");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextLine();
            
            // OPCIÓN 1: Ingresar calificación
            if (opcion.equals("1")) {
                System.out.print("Estudiante (1-Ana, 2-Luis, 3-María): ");
                int est = scanner.nextInt() - 1;  // Convertir a índice
                System.out.print("Materia (1-Mat, 2-Hist, 3-Cien, 4-Ing): ");
                int mat = scanner.nextInt() - 1;  // Convertir a índice
                scanner.nextLine();  // Limpiar buffer
                
                // Validar índices
                if (est >= 0 && est < 3 && mat >= 0 && mat < 4) {
                    ingresarCalificacion(scanner, est, mat);
                } else {
                    System.out.println("❌ Opción inválida");
                }
            }
            
            // OPCIÓN 2: Ver calificaciones
            else if (opcion.equals("2")) {
                System.out.print("Estudiante (1-Ana, 2-Luis, 3-María): ");
                int est = scanner.nextInt() - 1;
                scanner.nextLine();
                
                if (est >= 0 && est < 3) {
                    mostrarCalificaciones(est);
                } else {
                    System.out.println("❌ Estudiante inválido");
                }
            }
            
            // OPCIÓN 3: Ver promedio
            else if (opcion.equals("3")) {
                System.out.print("Estudiante (1-Ana, 2-Luis, 3-María): ");
                int est = scanner.nextInt() - 1;
                scanner.nextLine();
                
                if (est >= 0 && est < 3) {
                    double promedio = calcularPromedio(est);
                    System.out.println("📊 Promedio de " + estudiantes[est] + ": " + promedio);
                } else {
                    System.out.println("❌ Estudiante inválido");
                }
            }
            
            // OPCIÓN 4: Salir
            else if (opcion.equals("4")) {
                System.out.println("👋 ¡Hasta luego!");
            }
            
            // Opción inválida
            else {
                System.out.println("❌ Opción inválida. Intente de nuevo.");
            }
        }
    }
    
    // ═══════════════════════════════════════════════════════════════
    // MAIN
    // ═══════════════════════════════════════════════════════════════
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("═══════════════════════════════════════");
        System.out.println("  SISTEMA DE CALIFICACIONES");
        System.out.println("═══════════════════════════════════════");
        
        inicializarCalificaciones();
        menu(scanner);
        
        scanner.close();
    }
}
